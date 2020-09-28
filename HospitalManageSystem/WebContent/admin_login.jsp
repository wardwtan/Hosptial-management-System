<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
	integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
	integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"
	integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI"
	crossorigin="anonymous"></script>
<script>
	function mang() {
		var name = document.ma.name.value;
		var pass = document.ma.pass.value;

		if (name == 0) {
			alert("enter admin name");
			document.ma.name.focus();
			return false;

		}
		if (pass == 0) {
			alert("enter admin password");
			document.ma.pass.focus();
			return false;

		}
	}
</script>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
<link rel="stylesheet" href="index.css">
</head>
<body>
	<div class="global" style="height: 100%">
		<div class="bg-dark" style="height: 100%">
			<div class="navbars">
				<nav class="navbar navbar-expand-md navbar-dark bg-dark mb-4">
					<a class="navbar-brand" href="index.jsp">Home</a>
					<div class="collapse navbar-collapse" id="navbarCollapse">
						<ul class="navbar-nav mr-auto">
							<li class="nav-item"><a class="nav-link"
								href="admin_login.jsp">Admin</a></li>
							<li class="nav-item"><a class="nav-link"
								href="patient_login.jsp">Guest</a></li>
							<li class="nav-item"><a class="nav-link"
								href="patient_reg.jsp">Registration</a></li>
						</ul>
					</div>
				</nav>
			</div>
			<div class="container" style="height: 800px">
				<div class="row" style="height: 100%">
					<article class="span8 form-box"
						style="margin-left: 300px; margin-top: 60px">
						<div>
							<br>
							<h5 style="color: white; margin-left: 40px">Admin Login</h5>
							<form name="ma" action="alogin" method="post"
								onsubmit="return mang()">
								<fieldset>
									<div class="form-div-1">
										<input type="text" placeholder="Name:" name="name" value=""
											style="width: 215px"> <br>
									</div>
									<div class="form-div-3">
										<input type="password" placeholder="password:" name="pass"
											value="" style="width: 215px"> <br>
									</div>
								</fieldset>
								<input type="submit" value="submit" class="btn btn-primary btn2"
									style="margin-left: 0px; margin-top: 10px; width: 95px; height: 35px;" />
								<input type="reset" value="reset" class="btn btn-primary btn2"
									style="margin-left: 30px; margin-top: 10px; width: 85px; height: 35px;" />
							</form>
						</div>
					</article>
				</div>
			</div>
		</div>
	</div>
</body>
</html>