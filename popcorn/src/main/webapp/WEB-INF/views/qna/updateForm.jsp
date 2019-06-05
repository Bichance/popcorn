<%@ page contentType="text/html; charset=UTF-8" %> 
<%@ include file="/ssi/ssi_qna.jsp" %>
<!DOCTYPE html> 
<html> 
<head>
  <title>게시판 수정</title>
  <meta charset="utf-8">
</head>
<body> 
 
<div class="container">
<h1 class="col-sm-offset-2 col-sm-10">내 글 수정</h1>
<form class="form-horizontal" 
      action="update"
      method="post"
      >
      
      <input type="hidden" name="qna_num" value="${dto.qna_num}">
      <input type="hidden" name="col" value="${param.col}">
      <input type="hidden" name="word" value="${param.word}">
      <input type="hidden" name="nowPage" value="${param.nowPage}">
  
<!--   <div class="form-group"> -->
<!--     <label class="control-label col-sm-2" for="wname">작성자</label> -->
<!--     <div class="col-sm-6"> -->
<%--       <input type="text" name="wname" id="wname" class="form-control" value="${dto.wname}"> --%>
<!--     </div> -->
<!--   </div> -->
 
  <div class="form-group">
    <label class="control-label col-sm-2" for="qna_title">제목</label>
    <div class="col-sm-6">
      <input type="text" name="qna_title" id="qna_title" class="form-control" value="${dto.qna_title}">
    </div>
  </div>
  
  <div class="form-group">
    <label class="control-label col-sm-2" for="qna_content">내용</label>
    <div class="col-sm-8">
    <textarea rows="7" cols="7" id="qna_content" name="qna_content" class="form-control">${dto.qna_content}</textarea>
    </div>
  </div>
  
  <div class="form-group">
		<label class="control-label col-sm-2" for="qna_type"><span
			id="need">*</span>분류</label>
		<div class="col-sm-2">
			<select name="qna_type" class="form-control">
				<option value="0">선택하세요</option>
				<option value="Q01">계정관련</option>
				<option value="Q02">영화관련</option>
				<option value="Q03">결제관련</option>
				<option value="Q04">영상, 음향관련</option>
				<option value="Q05">기타 문의</option>
			</select>
		</div>
	</div>

  <div class="form-group">
    <label class="control-label col-sm-2" for="qna_pw">비밀번호</label>
    <div class="col-sm-6">
      <input type="password" name="qna_pw" id="qna_pw" class="form-control">
    </div>
  </div>  
  
   <div class="form-group">
   <div class="col-sm-offset-2 col-sm-5">
    <button class="btn">수정</button>
    <button type="reset" class="btn">취소</button>
   </div>
   </div>
   
</form>
</div>

</body> 
</html> 