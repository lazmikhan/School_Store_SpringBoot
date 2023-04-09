<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <head>
        <title>DAEBAK School Uniform Store</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">    
    </head>
    <body>

        <div class="container-fluid">
     
        
             <h3 class="text-danger">${message}</h3>
        <h1>Welcome to DAEBAK School Uniform Store</h1>
 
        <form method= "post" action="LoginServlet"><div class="col-lg-4">

        <div class="form-group>">
                <label for="username">Username : </label><input class="form-control" type="text" name="username" placeholder="Username"><br>
        </div>
        <div class="form-group>">
                <label for="password">Password : </label><input class="form-control" type="password" name="password" placeholder="Password"><br>
        </div>
        <div class="form-group>">
            <label for="phone">Phone No : </label><input class="form-control" type="tel" name="phone" placeholder="E.g: 012-3456789" pattern="[0-9]{3}-[0-9]{7}" required> <br>
        </div>
                <input class="btn btn-success" type="submit" value="Login">
                <input class="btn btn-success" type="reset" value="Reset">
                
        </div>
        </form>
        <img src="images/Back to school.jpg"/>
    </div>
    </body>
</body>
</html>