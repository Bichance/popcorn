<%@ page contentType="text/html; charset=UTF-8" %> 
<%@ include file="/ssi/ssi_qna.jsp" %>
<!DOCTYPE html> 
<html> 
<head>
<title>게시판 수정</title>
<meta charset="utf-8">
<script type="text/javascript" src="${pageContext.request.contextPath}/ckeditor/ckeditor.js"></script>
<script type="text/JavaScript">
	window.onload = function() {
		CKEDITOR.replace('qna_content'); // <TEXTAREA>태그 id 값
	};
</script>
</head>
<body> 
 
<div class="container">
<h1 class="col-sm-offset-2 col-sm-10">게시판 답변</h1>
<form class="form-horizontal" 
      action="reply"
      method="post"
      >
      <input type="hidden" name="id" value="user1">
      <input type="hidden" name="qna_num" value="${dto.qna_num}">
      <input type="hidden" name="qna_grpno" value="${dto.qna_grpno}">
      <input type="hidden" name="qna_indent" value="${dto.qna_indent}">
      <input type="hidden" name="qna_ansnum" value="${dto.qna_ansnum}">
      
<!-- <div class="form-group"> -->
<!--     <label class="control-label col-sm-2" for="wname">작성자</label> -->
<!--     <div class="col-sm-6"> -->
<!--       <input type="text" name="wname" id="wname" class="form-control"> -->
<!--     </div> -->
<!--   </div> -->

  <div class="form-group">
  	<label class="control-label col-sm-2" for="id">작성자</label>
		<div class="col-sm-6">
			<!--       <input type="text" name="wname" id="wname" class="form-control"> -->
			<h3>${id}</h3>
		</div>
  </div>
 
  
  <div class="form-group">
  	<label class="control-label col-sm-2" for="qna_title">제목</label>
		<div class="col-sm-6">
			<input type="text" name="qna_title" id="qna_title" class="form-control">
		</div>
	</div>
	
  
  <div class="form-group">
  	<label class="control-label col-sm-2" for="qna_content">내용</label>
		<div class="col-sm-8">
			<textarea rows="7" cols="7" id="qna_content" name="qna_content"
						class="form-control"></textarea>
		</div>
	</div>
  
<!--   <div class="form-group"> -->
<!--     <label class="control-label col-sm-2" for="qna_content">내용</label> -->
<!--     <div class="col-sm-8"> -->
<!--     <textarea rows="7" cols="7" id="qna_content" name="qna_content" class="form-control"></textarea> -->
<!--     </div> -->
<!--   </div> -->

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
    <button class="btn">등록</button>
    <button type="reset" class="btn">취소</button>
   </div>
 </div>
</form>
</div>
</body> 
</html> 