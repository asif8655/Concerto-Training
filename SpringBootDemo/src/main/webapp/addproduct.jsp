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
<body><div class="container">

	<h2 align="center">Enter Product</h2>
</div>
	<div class="container">
		<form action="products/add" method="post">
			<div class="row">
				<div class="col-lg-6 col-lg-offset-3">
				<div class="form-group">
						<label for="pname">Product Id:</label> <input type="text"
							class="form-control" id="pid" placeholder="Enter Product Id"
							name="pid">
					</div>
					<div class="form-group">
						<label for="pname">Product Name:</label> <input type="text"
							class="form-control" id="pname" placeholder="Enter Product Name"
							name="pname">
					</div>

					<div class="form-group">
						<label for="price">Price:</label> <input type="number"
							class="form-control" id="price" placeholder="Enter price"
							name="price">
					</div>
				
					<div align="center">
						<button type="submit" class="btn btn-primary" value="Add Product">Add Product</button>
					</div>
				</div>
			</div>
		</form>
	</div>
<h4 class='text-center'><a href='./'>Home</a></h4>
</body>
</html>