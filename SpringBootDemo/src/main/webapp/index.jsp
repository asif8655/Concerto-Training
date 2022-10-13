<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
<style type="text/css">
.jumbotron {
	background-color: #953d95 !important;
	color: white;
}

.main {
	background-color: #ddbbbb;
	padding: 40px;
}

.purple, a {
	color: #953d95 !important;
}

.login {
	padding-top: 40px;
}

.menu {
	margin-top: -40px !important;
}

.error {
	color: red;
}
</style>
</head>
<body>


	<div class='jumbotron text-center'>

		<h1>Shopping Lovers</h1>
	</div>
	<div class='container menu'>
		<nav class="navbar navbar-expand-lg navbar-light bg-light">

			<div id="navbarSupportedContent">
				<ul class="navbar-nav mr-auto text-center">
					<li class="nav-item"><a class="nav-link" href="products">View
							Products <span class="sr-only">(current)</span>
					</a></li>
					<li class="nav-item"><a class="nav-link" href="customers">View
							Customers</a></li>
					<li class="nav-item"><a class="nav-link" href="add">Add
							Products <span class="sr-only">(current)</span>
					</a></li>
					<li class="nav-item"><a class="nav-link" href="register">Register
							Customer <span class="sr-only">(current)</span>
					</a></li>
				</ul>
			</div>
		</nav>
	</div>
	<div class="container main">
		<h2 align="center">We Value Your Hard-Earned Money and hate to
			see you spend like ZOMBIE!!!</h2>
		<h3 align="center">We offer quality items at cheapest price to
			fit your pockets....</h3>

		<c:if test="${message != null }">
			<span class='error'><c:out value="${message }"></c:out></span>
		</c:if>
		<c:if test="${sessionScope.email == null }">
		<h4 class='login purple'>Login</h4>
		<form action="login" method="post">

			<div class="row">
				<div class="col-lg-6 col-lg-offset-3">
					<div class="form-group">
						<label for="username">UserName:</label> <input type="text"
							class="form-control" id="email" placeholder="Enter Username"
							name="username">
					</div>
					<div class="form-group">
						<label for="password">Password:</label> <input type="password"
							class="form-control" id="email" placeholder="Enter Password"
							name="password">
					</div>
					<input type='hidden' value=<c:out value="${purchase }"></c:out>
						name="purchase" />
					<div align="center">
						<button type="submit" class="btn btn-primary" value="Login">Login</button>
					</div>
				</div>
			</div>
		</form>
		</c:if>
		<c:if test="${sessionScope.email != null }">
			 <h4 class='text-center'><a href='logout'>Logout</a></h4>
		</c:if>
	</div>

</body>
</html>