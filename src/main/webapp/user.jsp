<%--
  Created by IntelliJ IDEA.
  User: Hieu's PC
  Date: 5/24/2023
  Time: 3:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
String username = request.getParameter("username");
%>
<h1>hello <%=username%></h1>
</body>
</html>
