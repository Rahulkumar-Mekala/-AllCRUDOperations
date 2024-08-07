
<%@page import="Register.Userbean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>
<style type="text/css">
body {
text-align: center;
	background:  silver;
	padding: 20px;
	
}
.edit{
 
background:  white;
margin-left: 400px;
margin-right: 400px;
padding: 50px;
border-radius: 20px;
}
.button {
	background: white;
	color: black;
	border-radius:20px; 
}
.button:hover {
background: blue;
	color: white;
	
}
</style>
</head>
<body>




<div class="edit">
<h2> Delete Profile Details : </h2>
<% Userbean bean = (Userbean)application.getAttribute("ubean");
String str=(String)request.getAttribute("fname");
out.println("This Page Belong to "+str);
%>

    <form action="deleteupdate" method="post"><br>
   
    <input type="text" name="phone" value=<%=bean.getPhone() %>><br><br>
  <input class="button" type="submit" value=DeleteProfile>
    </form>
    </div>
   
</body>
</html>