<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<div style="width: 500px; margin: 50px auto; padding 30px">
		<h2>Login</h2>
		<%
			if(request.getParameter("error") != null){
				out.print("<p style='color: red'>Sai tên đăng nhập hoặc mật khẩu</p>");
			}
		%>
		<form action="LoginController" method="post">
			<div>
				<lable>Username: </lable>
				<input type="text" name="username" value="">
			</div>
			</br>
			<div>
				<label>Password: </label>
				<input type="password" name="password" value="">
			</div>
			</br>
			<div>
				<input type="submit" name="login" value="Login">
				<input type="reset" name="reset" value="Reset">
			</div>
		</form>
	</div>
</body>
</html>