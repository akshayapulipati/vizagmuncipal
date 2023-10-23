<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Raise Complaint</title>
</head>
<body>
	<h1>Raise Complaint Regarding Sewage</h1>

	<form method="post" action="/complaint">
		<label for="name">Your Name:</label> <input type="text" name="name"
			required><br>
		<br> <label for="street">Street Name:</label> <input type="text"
			name="street" required><br>
		<br> <label for="complaintText">Complaint Details:</label>
		<textarea name="complaintText" required></textarea>
		<br>
		<br>

		<button type="submit">Submit Complaint</button>
	</form>

	<p>
		<a href="/home">Back to Home</a>
	</p>
</body>
</html>
