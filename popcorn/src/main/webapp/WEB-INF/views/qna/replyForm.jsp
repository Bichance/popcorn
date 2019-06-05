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
<h1 class="col-sm-offset-2 col-sm-10">게시판 답변</h1>
<form class="form-horizontal" 
      action="reply"
      method="post"
      >
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
    <label class="control-label col-sm-2" for="qna_title">제목</label>
    <div class="col-sm-6">
      <input type="text" name="qna_title" id="qna_title" class="form-control"
      value="${dto.title}">
    </div>
  </div>
  
  <div class="form-group">
    <label class="control-label col-sm-2" for="qna_content">내용</label>
    <div class="col-sm-8">
    <textarea rows="7" cols="7" id="qna_content" name="qna_content" class="form-control"></textarea>
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