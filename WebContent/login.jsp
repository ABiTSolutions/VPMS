<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vehicle Parking Management System</title>
</head>
<body>
<body class="profile-login">
		<header class="global-header">
			<div>
				<nav class="global-nav">
					<a class="logo" data-analytics="site logo" href="#">
						Vehicle Parking Management System
					</a>
				</nav>
			</div>
		</header>
		<section class="login" >
			<form action="LoginServlet" method="GET">
				<h1>Vehicle Parking Management System</h1>
				<input type="text" name ="username" placeholder="Email or Username" >
				<div class="password-container">
					<input type="password" name ="password" placeholder="Password" >
					<span>
					(
						<a href="forgot_password.jsp">forgot?</a>
					)
					</span>
				</div>
				<center>
				<button class="button submit" type="submit">Login</button>
				</center>
			</form>
		</section>    
  </body>
</body>
</html>