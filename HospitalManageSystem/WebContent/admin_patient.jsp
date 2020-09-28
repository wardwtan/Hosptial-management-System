<%@page import="Entity.Patient"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import = "Entity.Patient" %>
<%@page import = "dao.UserDao" %>
<%@page import = "java.util.*" %>
<!DOCTYPE html>
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
                                            href="lab_home.jsp">Lab</a></li>
                    <li class="nav-item"><a class="nav-link"
                                            href="bill_home.jsp">bill</a></li>
                </ul>
            </div>
        </nav>
    </div>
		<div class="container" style="height: 800px">
			<div class="row" style="height: 100%; width: 1200px">
				<table style="width:1000px; text-align:center;">
					<% 
						UserDao dao = new UserDao();
						ArrayList<Patient> alluser = dao.getAllUser();
						for(int i = 0; i < alluser.size();i++){
							Patient user = alluser.get(i);
							String name = user.getName();
							String email = user.getEmail();
							String type = user.getType();
					%>
					 <tr style="border: 1px solid white;font-size: 20px;color:white;font-family: monospace;font-weight: bold;">
						<td style="text-align: center;height: 40px"> Name:</td>
						<td style="text-align: center"><%=name%></td>
						<td style="text-align: center">Email:</td>
						<td style="text-align: center"><%=email%></td>
						<td style="text-align: center">Type:</td>
						<td style="text-align: center"><%=type%></td>
					</tr>
					<%
						}
					%>
				</table>
			</div>
		</div>
</div>
</body>
</html>