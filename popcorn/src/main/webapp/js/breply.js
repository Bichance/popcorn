console.log("*****Reply Module........");

var replyService = (function() {  //이름없는 함수

//ADD	
	function add(reply, callback, error) {
		//console.log("add reply...............");

		$.ajax({
			type : 'post',
			url : './reply/create',
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
	
//GET LIST
	function getList(param, callback, error) {
	var qna_num = param.qna_num;
	var sno = param.sno;
	var eno = param.eno;
	// alert(param.qna_num);                                    
	//JQUERY의 비동기통신				//결과를 json형식으로 받겠다, ".JSON"을 빼면 XML형식으로 받음	
	$.getJSON("./reply/list/" + qna_num + "/" + sno + "/" + eno + ".json",
			function(data) {
				// alert(data);
				if (callback) {
					callback(data); // 댓글 목록만 가져오는 경우
					// callback(data.replyCnt, data.list); //댓글 숫자와 목록을 가져오는 경우
				}
			});  //(요청 uri , 요청을 받을 함수)
	}
	
//GET PAGE
	function getPage(param, callback, error) {

		$.ajax({
			type : 'get',
			url : "./reply/page",    //이  URL을 보고 서블릿을 찾아가는 이유는 WEB.XML에서 확인
			data : param,
			contentType : "application/text; charset=utf-8", //전달될 타입
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
	
//REMOVE
	function remove(qreply_num, callback, error) {
		$.ajax({
			type : 'delete',
			url : './reply/' + qreply_num,
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
	
//UPDATE
	function update(reply, callback, error) {

		console.log("qreply_num: " + reply.qreply_num);

		$.ajax({
			type : 'put',
			url : './reply/' + reply.qreply_num,
			data : JSON.stringify(reply),  //보내는 데이터
			contentType : "application/json; charset=utf-8", //보내는 데이터 타입-JSON이다
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
	
//GET
	function get(qreply_num, callback, error) {

		$.get("./reply/" + qreply_num + ".json", function(result) {

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

	return {     //json객체 리턴 {해당 함수를 나타내는 키값: 함수명}
		add : add,
		get : get,
		getList : getList,
		getPage : getPage,
		remove : remove,
		update : update
	};

})(); // 이름없는 함수 닫히고')', ();함수실행
//replyService는 함수가 아니라 함수를 사용한 결과를 담고있는것 (return값-> json 객체들)