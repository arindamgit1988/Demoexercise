<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<H1>Enter Details to Add</H1>
<form action="add">
<font size = "4">Enter Name &nbsp:&nbsp<input type = "text" name = "name"></br>
Enter Technology &nbsp:&nbsp<input type = "text" name = "tech"></br>
Enter Registration number &nbsp:&nbsp<input type = "text" name = "reg"></br>
Enter Mobile Number &nbsp:&nbsp<input type = "text" name = "mob"></br>
Enter University ID &nbsp:&nbsp<input type = "text" name = "unid"></br>
</font>
<input type="submit"></br>
</form>
<H1>Enter Registration Number to Search</H1>
<form action="search">
<font size = "4">
Enter Registration number &nbsp:&nbsp<input type = "text" name = "reg1"></br>
</font>
<input type="submit">
</form>

</body>
</html>