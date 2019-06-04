<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
   String root = request.getContextPath();
   %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<style>
.navbar {
  overflow: hidden;
  background-color: black;
  position: fixed;
  top: 0;
  width: 100%;

}
.nav{
font-size: 20px;
font-family: 'Patua One', cursive;
}
</style>
</head>
<body >
<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <a href="<%=root %>"><img src="<%=root %>/images/popCorn_red.png" style="width: 250px; height: 70px;"></a>
    </div>
    <ul class="nav navbar-nav">
     <li class="active"><a href="#"></a></li>
     <li class="active"><a href="#"></a></li>
<%--       <li><a href="<%=root %>/">Home</a></li> --%>
      <li><a href="<%=root %>/movie/create" style="padding-top: 25px">MOVIE</a></li>
      <li><a href="<%=root %>/qna/list" style="padding-top: 25px">Q & A</a></li>
      <li><a href="#"  style="padding-top: 25px">Page 2</a></li>
      <li><a href="#"  style="padding-top: 25px">Page 3</a></li>
    </ul>
  </div>
</nav>
</body>
</html>