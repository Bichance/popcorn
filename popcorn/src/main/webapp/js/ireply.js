console.log("*****Reply Module........");

var replyService = ( function() {

	function add(reply, callback, error) {
		console.log("add reply...............");

		$.ajax({
			type : 'post',
			url : './ireply/create',
			data : JSON.stringify(reply),
			contentType : "application/json; charset=utf-8",
			success : function(result, status, xhr) {
				if (callback) {
					callback(result);
				}
			},
			error : function(xhr, status, er) {
				if (error) {
					error(er);
				}
			}
		});
	}

	function getList(param, callback, error) {
		var imgno = param.imgno;
		var sno = param.sno;
		var eno = param.eno;
		// alert(param.imgno);
		$.getJSON("./ireply/list/" + imgno + "/" + sno + "/" + eno + ".json",
				function(data) {
					// alert(data);
					if (callback) {
						callback(data); // 댓글 목록만 가져오는 경우
						// callback(data.replyCnt, data.list); //댓글 숫자와 목록을 가져오는
						// 경우
					}
				});

	}

	function getPage(param, callback, error) {
		var nPage = param.nPage;
		var nowPage = param.nowPage;
		var col = param.col;
		var word = param.word;
		var imgno = param.imgno;

		$.ajax({
			type : 'get',
			url : "./ireply/page",
			data : param,
			contentType : "application/text; charset=utf-8",
			success : function(result, status, xhr) {
				if (callback) {
					callback(result);
				}
			},
			error : function(xhr, status, er) {
				if (error) {
					error(er);
				}
			}
		});
	}

	function remove(rnum, callback, error) {
		$.ajax({
			type : 'delete',
			url : './ireply/' + rnum,
			success : function(deleteResult, status, xhr) {
				if (callback) {
					callback(deleteResult);
				}
			},
			error : function(xhr, status, er) {
				if (error) {
					error(er);
				}
			}
		});
	}

	function update(reply, callback, error) {

		console.log("rnum: " + reply.rnum);

		$.ajax({
			type : 'put',
			url : './ireply/' + reply.rnum,
			data : JSON.stringify(reply),
			contentType : "application/json; charset=utf-8",
			success : function(result, status, xhr) {
				if (callback) {
					callback(result);
				}
			},
			error : function(xhr, status, er) {
				if (error) {
					error(er);
				}
			}
		});
	}

	function get(rnum, callback, error) {

		$.get("./ireply/" + rnum + ".json", function(result) {

			if (callback) {
				callback(result);
			}

		}).fail(function(xhr, status, err) {
			if (error) {
				error();
			}
		});
	}

	;

	return {
		add : add,
		get : get,
		getList : getList,
		getPage : getPage,
		remove : remove,
		update : update
	};

})();
