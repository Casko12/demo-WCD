<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/12/2023
  Time: 9:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String name = request.getParameter("name");
%>
<h1>this is footer block</h1>
<h1>Hello : <%= name %></h1>

</body>
</html>