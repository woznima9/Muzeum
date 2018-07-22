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
    <input type="text" name="miastaSzukaj" value="Łódź">
    <input type="text" name="ulicySzukaj" value="Piotrkowska">
    <input type="submit" name="szukaj" value="SZUKAJ" width="60">
</form>

</body>
</html>
