<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import ="java.util.*" %>
 <%
 int count =0;

 if(session.isNew())
 session.setAttribute("vCount", count);
 

count= (int)session.getAttribute("vCount");
count = count+1;
session.setAttribute("vCount", count);
 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Online Shopping Experience with Us.
 You have accessed this page for <%=count %>since last
  server reboot <%= request.getRemoteAddr() %></h1>
</body>
</html>