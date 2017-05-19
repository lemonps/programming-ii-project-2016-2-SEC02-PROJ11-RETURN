<%-- 
    Document   : Register
    Created on : Apr 12, 2017, 3:28:02 PM
    Author     : WIN10_M7
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="./css/bootstrap.min.css">
        <script type="text/javascript" src="./js/jquery.js"></script>
        <script type="text/javascript" src="./js/bootstrap.min.js"></script>
      
        <title>Register Page</title>
        
        <style>
            h1,h2{
                text-shadow: 1px 1.5px #808080;
                font-weight: bold;
            }
            #regisButt{
                color:#0C1021;
                border : 1.5px inset #021014;
                font-weight: bold;
            }
            #backToLogin{
                border : 1.5px inset #021014;
            }
            a{
                color:#0C1021;
                font-weight: bold;
            }
            hr{
               border : 1.5px inset #3e4f5e;
            }
            
        </style>
    </head>
    <body>
       
        <div class="container">
            
            <h1> Register Account  <i class="glyphicon glyphicon-pencil"></i></h1>
            
            <hr>
            
            <form action="RegisterData">
                <div class="form-group">
                    <p><b>Username : </b><input type="text" name = "username" class="form-control" placeholder="Username"</p>
                </div>
                <div class="form-group">
                    <p><b>Password : </b><input type="password" name = "password" class="form-control" placeholder="Password"></p>
                </div>
                <div class="form-group">
                    <p><b>Name : </b><input type="text" name = "name" class="form-control" placeholder="Name"></p>
                </div>
                <div class="form-group">
                    <p><b>Surname : </b><input type="text" name = "surname" class="form-control" placeholder="Surname"></p>
                </div>

                <input type="submit" class="btn btn-default" value="Register" id="regisButt">
                &nbsp<button type="submit" class="btn btn-default" id="backToLogin"><a href="login.jsp" >Back to Sign in</a></button>
            </form>    
        </div>
        
    </body>
</html>
