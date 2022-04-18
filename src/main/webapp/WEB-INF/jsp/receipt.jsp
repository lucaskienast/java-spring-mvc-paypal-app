<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Payment Receipt</title>
<style type="text/css">
	table {border: 0;}
	table td {padding: 10px;}
</style>
</head>
<body>
	<div align="center">
		<h1>Payment Completed</h1>
		<h2>Receipt Details</h2>
		<table>
			<tr>
				<td>Merchant:</td>
				<td>Java PayPal Inc.</td>
			</tr>
			<tr>
				<td>Payer:</td>
				<td>${payer.firstName} ${payer.lastName}</td>
			</tr>
			<tr>
				<td>Sub Total:</td>
				<td>${transaction.amount.details.subtotal}</td>
			</tr>
			<tr>
				<td>Shipping:</td>
				<td>${transaction.amount.details.shipping}</td>
			</tr>
			<tr>
				<td>Tax:</td>
				<td>${transaction.amount.details.tax}</td>
			</tr>
			<tr>
				<td>Total:</td>
				<td>${transaction.amount.total}</td>
			</tr>
		</table>
	</div>
</body>
</html>