<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	.table{
		/* width:70% !important; */
	}
	.cust{
		padding: 30px;
	}
	body{
 	background-color: #953d95;
 	color:white;
}
a{
	color:white;
	text-decoration: underline;
}
a:hover{
	color:black !important;
}
	</style>
</head>
<body>

<div align="center" class="container cust">
            <h1>Customers List</h1>
            <table class="table table-bordered">
            <tr>
            	<th>No</th>
                <th>Name</th>
                <th>Phone</th>
                <th>City</th>
                <th>Username</th>
                </tr>
                <c:forEach var="customer" items="${customers}" varStatus="status">
                <tr>
                    <td>${status.index + 1}</td>
                    <td>${customer.custname}</td>
                    <td>${customer.phone}</td>
                     <td>${customer.city}</td>
                    <td>${customer.email}</td>
                </tr>
                </c:forEach>             
            </table>
        </div>
         <h4 class='text-center'><a href='./'>Home</a></h4>
</body>
</html>