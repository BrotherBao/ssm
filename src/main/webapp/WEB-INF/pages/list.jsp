<%--
  Created by IntelliJ IDEA.
  User: 25106
  Date: 2019/8/12
  Time: 18:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>查询所有</h3>
<c:forEach items="${list}" var="category">
    ${category.cname}
</c:forEach>
</body>
</html>
