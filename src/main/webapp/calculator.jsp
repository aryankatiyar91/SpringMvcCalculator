<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator Page</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body style="background-color:brown">

	<form action="calc" method="post">
		<div class="container" style="width:50%">
			<br>
			<h1 style="Color:blue">Basic Calculator</h1>
			<br>
			<h2>
				  <label for="tbFn" class="form-label">First Number: </label>
				  <input type="number" class="form-control" id="tbFn" placeholder="Enter First Number" name="tbFn" required="required">
				<br>
				  <label for="tbSn" class="form-label">Second Number: </label>
				  <input type="number" class="form-control" id="tbSn" placeholder="Enter Second Number" name="tbSn" required="required">
			</h2>
			<br>
			
			<input class="btn bg-warning btn-lg btn-block" type="submit" name="btnAdd" value="Add" style="margin-right: 40px" />
			<input class="btn bg-info btn-lg btn-block" type="submit" name="btnSub" value="Sub" style="margin-right: 40px" />
			<input class="btn bg-secondary btn-lg btn-block" type="submit" name="btnMult" value="Mult" style="margin-right: 40px" />
			<input class="btn bg-success btn-lg btn-block" type="submit" name="btnDiv" value="Div" style="margin-right: 40px" />
		</div>
	</form>

</body>
</html>