<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Komp
  Date: 2018-07-22
  Time: 00:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Show</title>
</head>
<body>
<jsp:include page="menu.jsp"></jsp:include>
<%--<p>${requestScope.tegoSzukaj}</p>--%>
<p>Znalezione MUZEA:</p>
<c:forEach items="${requestScope.muzeums}" var="muzeum">
    <p>${muzeum.getId()} ${muzeum.getNazwa()} ${muzeum.getMiasto()} ${muzeum.getUlica()}</p>
</c:forEach>

</body>
</html>
