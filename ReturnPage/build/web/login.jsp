<%-- 
    Document   : login1
    Created on : Apr 19, 2017, 10:29:03 AM
    Author     : Lemon
--%>

<%@page import="model.user"%>
<%@page import="model.LoginFormDB"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="./css/bootstrap.min.css">
        <script type="text/javascript" src="./js/jquery.js"></script>
        <script type="text/javascript" src="./js/bootstrap.min.js"></script>

        <title>LOGIN Page</title>

    </head>
    <body>



        <div class="container">
            <div class="col-md-2"></div>
            <div class="col-md-8">
                <h1 class="h1">SIGN IN RETURN 	<i class="glyphicon glyphicon-log-in"></i></h1>  <hr>          
                <form action="ConnectLogin"  method="POST">
                    <div class="form-group">
                        <i class="glyphicon glyphicon-user"></i>&nbsp<label for="exampleInputEmail1">Username</label>
                        <input type="text" name="username" class="form-control" placeholder="Username">
                    </div>
                    <div class="form-group">
                        <i class="glyphicon glyphicon-lock"></i>&nbsp<label for="exampleInputPassword1">Password</label>
                        <input type="password" name = "password" class="form-control" placeholder="Password">
                    </div>
                    <button type="submit" class="btn btn-default">Submit</button>
                    <button type="button" class="btn btn-default" onclick="/Register.jsp">Register Account</button>
                </form>  
            </div>
            <div class="col-md-2"></div>
        </div>

        
    </body>
</html>              
<!--   <p>Username : <input type="text" name = "username"></p>
<p>Password : <input type="password" name = "password"></p>
<input type="submit" value="Sign in">


