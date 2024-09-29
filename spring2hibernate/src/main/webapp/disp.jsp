<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="spring2hibernate.*" %>
    <%@ page  import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%List<student> s=(List<student>)request.getAttribute("student");
%>

<table  border="1">
<tr><th>id</th><th>name</th><th>email</th></tr>
<%for(student ss:s){ %>
<tr><td><%=ss.getSid()%></td><td><%=ss.getSname() %></td><td><%=ss.getSemail() %></td></tr>
<%} %>
</table>

</body>
</html>
