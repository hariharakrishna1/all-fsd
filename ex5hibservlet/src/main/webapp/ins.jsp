<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import= "ex5hibservlet.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
student s=new student();

s.setSname(request.getParameter("name"));
//s.setSid(Integer.parseInt(request.getParameter("id")));
s.setSemail(request.getParameter("email"));
studentdao stu=new studentdao();
int row=stu.insert(s);
if(row>0)
{
	out.print("hello");
 
}
else;

%>
</body>
</html>