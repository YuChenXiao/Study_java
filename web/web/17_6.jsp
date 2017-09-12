<%--
  Created by IntelliJ IDEA.
  User: TsungHan
  Date: 2017/9/8
  Time: 下午 02:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String tmp = request.getParameter("number");
    int i =0;
    if (tmp != null){
        i=Integer.valueOf(tmp);
        i++;
    }
%>
<form action="web/17_6.jsp"method="post"></form>
<input type="text" name="number" value="<%out.print(i);%>"/>
<input type="submit" value="確定"/>
</body>
</html>
