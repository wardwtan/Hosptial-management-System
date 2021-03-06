<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width">
    <title>Hospital Management System</title>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    <link rel="stylesheet" href="css/index.css">
</head>
<body>
<div class="bg-dark">
    <div class="navbars">
        <nav class="navbar navbar-expand-md navbar-dark bg-dark mb-4">
            <div class="collapse navbar-collapse" id="navbarCollapse">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item"><a class="nav-link"
                                            href="admin_home.jsp">home</a></li>
                    <li class="nav-item"><a class="nav-link"
                                            href="bill_home.jsp">view bill</a></li>
                    <li class="nav-item"><a class="nav-link"
                                            href="write_bill.jsp">write bill</a></li>
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
						<h5 style="color: white; margin-left: -20px">Enter Patient info to view bill</h5>
						<form name="ma" action="admin_view_bill" method="post">
							<fieldset>
								<div class="form-div-1">
									<input type="text" placeholder="Patient Email" name="email" value=""
										style="width: 215px" required> <br>
								</div>
								<div class="form-div-2">
									<input type="text" placeholder="Patient Name:" name="name"
										value="" style="width: 215px" required> <br>
								</div>
							</fieldset>
							<input type="submit" value="submit" class="btn btn-primary btn2"
								style="margin-left: 47px; margin-top: 10px; width: 95px; height: 35px;" />
						</form>
					</div>
				</article>
			</div>
		</div>
</div>
</body>
</html>