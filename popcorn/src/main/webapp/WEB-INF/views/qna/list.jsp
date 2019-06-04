<%@ page contentType="text/html; charset=UTF-8" %> 
<%@ include file="/ssi/ssi_qna.jsp" %>
<!DOCTYPE html> 
<html> 
<head>
  <title>Welcome to PopCorn</title>
  <meta charset="utf-8">
  <script type="text/javascript">
  $(document).ready(function(){
	  var modal = '${msg}'; //Controller에서 가져온 데이터
	  checkModal(modal); //modal생성
	  
	    //history back일때는 modal 안보여주는 코드 1
	    history.replaceState({},null,null);
	  
	    function checkModal(modal){ //modal 생성함수 선언
	       if(history.state) return; //코드2
	       if(modal){
	          $(".modal-body").html(modal);
	          $("#myModal").modal("show");
	      }
	    }
	 });
  function read(bbsno){
    var url = "read"
    url+="?qna_num="+qna_num;
    url+="&col=${col}";
    url+="&word=${word}";
    url+="&nowPage=${nowPage}";
    location.href=url;
  }
  </script>
</head>
<body> 
<div class="container">
<h1 class="col-sm-offset-2 col-sm-10">Q & A</h1>
<form class="form-inline" action="list">
    <div class="form-group">
    <select class="form-control" name="col">
      <option value="name" 
      <c:if test="${col=='name'}">selected</c:if>>성명</option>
      <option value="qna_title"
      <c:if test="${col=='qna_title'}">selected</c:if>
      >제목</option>
      <option value="qna_content"
      <c:if test="${col=='qna_content'}">selected</c:if>
      >내용</option>
      <option value="qna_title_qna_content"
      <c:if test="${col=='qna_title_qna_content'}">selected</c:if>
      >제목+내용</option>
      <option value="total"
     <c:if test="${col=='total'}">selected</c:if>
      >전체출력</option>
    </select>
    </div>
    <div class="form-group">
    <input type="text" class="form-control" placeholder="Enter 검색어" 
    name="word" value="${word}">
    </div>
    <button type="submit" class="btn btn-default">검색</button>
    <button type="button" class="btn btn-default" onclick="location.href='create'">등록</button>
    </form>
	<table class="table table-striped">
		<thead>
		<tr>
			<th>번호</th>
			<th>제목</th>
<!-- 			<th>작성자</th> -->
			<th>ID</th>
			<th>날짜</th>
			<th>분류</th>
			<th>grpno</th>
			<th>indent</th>
			<th>ansnum</th>
		</tr>
	</thead>
	<tbody>
	<c:choose>
		<c:when test="${empty list}">등록된 게시판이 없습니다.</c:when>
		<c:otherwise>
			<c:forEach var="dto" items="${list}">
		<tr>
  			<td>${dto.qna_num}</td>
  		<td>
  		<c:forEach begin="1" end="${dto.qna_indent}">
  			&nbsp;&nbsp;
  		</c:forEach>
  		<c:if test="${dto.qna_indent>0}">
  			<img src='${root}/images/re.jpg'>
  		</c:if>
<%--   		<c:set var="rcount" value="${util:rcount(dto.qna_num, qrMapper) }"/> <!-- rinter --> --%>
<%--   		<a href="javascript:read('${dto.qna_num}')">${dto.qna_title}</a> --%>
<%--   		<c:if test="${rcount>0 }"> --%>
<%--             <span class="badge">${rcount}</span> --%>
<%--       	</c:if> --%>
  		
  		<c:if test="${util:newImg(dto.qna_date)}">
  		 <img src ='${root}/images/new.gif'>
  		</c:if>
  	</td>
<%--   		<td>${dto.name}</td> --%>
  <td>${dto.qna_num}</td>
  <td>${dto.qna_title}</td>
  <td>${dto.id}</td>
  <td>${dto.qna_date}</td>
  <td>${dto.qna_type}</td>
  <td>${dto.qna_grpno}</td>
  <td>${dto.qna_indent}</td>
  <td>${dto.qna_ansnum}</td>
</tr>
</c:forEach>
</c:otherwise>
</c:choose>
</tbody>
</table>
 ${paging}
</div>
<!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog modal-sm">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">게시물 등록 알림</h4>
        </div>
        <div class="modal-body">
          <p>This is a small modal.</p>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
    </div>
  </div>
</body> 
</html> 