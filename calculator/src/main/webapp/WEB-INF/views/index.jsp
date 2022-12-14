<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>CALCULATOR</title>
</head>
<body>
<h1>CALCULATOR</h1>
<form method="post" action="home">
<input type="number" name="number1" placeholder="Enter number a">
<input type="number" name="number2" placeholder="Enter number b"><br>
<input type="submit" name="operator" value="Addition(+)">
<input type="submit" name="operator" value="Subtraction(-)">
<input type="submit" name="operator" value="Multiplication(X)">
<input type="submit" name="operator" value="Division(/)">
    <p>${calculation} ${result}</p>
</form>
</body>
</html>