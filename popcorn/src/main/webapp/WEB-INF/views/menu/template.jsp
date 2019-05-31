<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <!-- jquery에 필요한 부분 start -->
  <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.js"></script>
  <script src="<%=request.getContextPath()%>/js/ajaxsetup.js"></script>
  <!-- jquery에 필요한 부분 end -->
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<link href="https://fonts.googleapis.com/css?family=Patua+One&display=swap" rel="stylesheet">
<style type="text/css">
.main {
  padding: 16px;
  margin-top: 50px;
  height: 1500px; /* Used in this example to enable scrolling */
}
</style>
<title><tiles:getAsString name="title"></tiles:getAsString></title>
</head>
<body leftmargin="50" topmargin="50">
<!-- 상단 메뉴 -->
<tiles:insertAttribute name="header"></tiles:insertAttribute>
<!-- 상단 메뉴 끝 -->

<div class="main">
<!-- 내용 시작 -->
<tiles:insertAttribute name="body"></tiles:insertAttribute>


</div>
</body>
</html>