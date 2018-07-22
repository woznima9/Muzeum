<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Search</title>
</head>
<body>
<jsp:include page="menu.jsp"></jsp:include>
<p>wpisz miasto w którym szukasz muzeów</p>
<form method="POST" action="/searchMuzeums">
    <input type="text" name="tegoSzukaj" value="Łódź">
    <input type="submit" name="szukaj" value="SZUKAJ" width="60">
</form>

</body>
</html>
