<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ElectionForm</title>
</head>
<body>

	<form action="save" method="get">
		<input type="number" name="id" placeholder="id"> <input
			type="text" name="name" placeholder="name"> <input
			type="text" name="phoneNumber" placeholder="Phone Number"> <input
			type="text" name="age" placeholder="Age"> <input type="text"
			name="address" placeholder="Address"> <input type="text"
			name="pincode" placeholder="pincode">

		<button type="submit" name="save">Save</button>
	</form>

</body>
</html>