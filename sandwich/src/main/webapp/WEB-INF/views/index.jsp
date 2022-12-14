<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Sandwich Condiments</title>
</head>
<body>
<h1>Sandwich Condiments</h1>
<h3 style="color: red">${message}</h3>
<form method="post" action="/home">
<%--    <select name="condiment">--%>
<%--        <option value="lettuce">Lettuce</option>--%>
<%--        <option value="tomato">Tomato</option>--%>
<%--        <option value="mustard">Mustard</option>--%>
<%--        <option value="sprouts">Sprouts</option>--%>
<%--    </select>--%>
    <input type="checkbox" name="condiment" value="lettuce">Lettuce
    <input type="checkbox" name="condiment" value="tomato">Tomato
    <input type="checkbox" name="condiment" value="mustard">Mustard
    <input type="checkbox" name="condiment" value="sprouts">Sprouts<br>
    <input type="submit" value="Save">
</form>
</body>
</html>