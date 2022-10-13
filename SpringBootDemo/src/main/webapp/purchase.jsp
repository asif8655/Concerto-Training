<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
h1, button{
	padding:30px;
	background-color: #953d95 !important;
	color:white !important;
}
</style>
<title>Insert title here</title>
</head>
<body>

	<h1 class='text-center'>Purchase Items : ${sessionScope.email }</h1>
	<div class='container'>
		<table class="table table-bordered">
			<tr>
				<th>No</th>
				<th>Product Name</th>
				<th>Price</th>
				<th>Quantity</th>
				<th>Amount</th>
			</tr>
			<c:forEach var="product" items="${products}" varStatus="status">
				<tr>
					<td>${status.index + 1}</td>
					<td>${product.pname}</td>
					<td id='p${product.pid}'>${product.price}</td>
					<td><input type='text' name='q${product.pid}' id='q${product.pid}' onfocusout="update(this,t${product.pid},p${product.pid})"/></td>
					<td><span id='t${product.pid}'></span></td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="4" align="right">Total Amount : </td>
				<td><span id='total'></span></td>
			</tr>
		</table>
		<button onclick="checkout()">Proceed to checkout</button>
	</div>
	<script type="text/javascript">
	var total = 0;
	var ele = document.getElementById('total');
	function update(qtyid, spanid, priceid)
	{
		spanid.innerHTML = qtyid.value * priceid.innerText;
		total += parseInt(spanid.innerText);
		ele.innerHTML = total;
		console.log("id "+ qtyid.getAttribute('id'));
	}
	function checkout()
	{
		alert('check');
		
		//order?
	}
	</script>
</body>
</html>