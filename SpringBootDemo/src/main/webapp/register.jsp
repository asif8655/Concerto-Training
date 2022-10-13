<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Registration System</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<style type="text/css">
.error {
	color: red;
	font-size: 20px;
}
body{
 	background-color: #953d95;
 	color:white;
}
label{
	font-size: 18px;
}
a {
	color: white;
	text-decoration: underline;
}

a:hover {
	color: black !important;
}
</style>
</head>
<body>
<div class="container">

	<h2 align="center">Customer Registration</h2>
</div>
	<div class="container">
		<form action="customers/add" method="post">
			<div class="row">
				<div class="col-lg-6 col-lg-offset-3">
					<div class="form-group">
						<label for="name">Customer Name:</label> <input type="text"
							class="form-control" id="name" placeholder="Enter Name"
							name="custname">
					</div>

					<div class="form-group">
						<label for="phone">Phone:</label> <input type="number"
							class="form-control" id="phone" placeholder="Enter phone no."
							name="phone">
					</div>
					<div class="form-group">
						<label for="email">City:</label> <input type="text"
							class="form-control" id="city" placeholder="Enter city"
							name="city">
					</div>
					<div class="form-group">
						<label for="username">Email:</label> <input type="email"
							class="form-control" id="email" placeholder="Enter Email"
							name="email">
					</div>
					<div class="form-group">
						<label for="password">Password:</label> <input type="password"
							class="form-control" id="email" placeholder="Enter Password"
							name="password">
					</div>
					<div align="center">
						<button type="submit" class="btn btn-primary" value="Register">Register</button>
					</div>
				</div>
			</div>
		</form>
	</div>
<h4 class='text-center'>
		<a href='./'>Home</a>
	</h4>
</body>
</html>