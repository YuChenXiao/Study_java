<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: TsungHan
  Date: 2017/9/8
  Time: 下午 03:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ page import="java.util.Date"%>
<% out.println("現在時間:" + new Date());%>
<%@ include file ="/17_6.jsp"%>
</body>
</html>
