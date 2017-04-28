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
        <link rel="stylesheet" type="text/css" href="3.css">

        <title>LOGIN Page</title>
    </head>
    <body>
    
        <div id="">
            <h1>LOGIN Return<h1>
                    <hr>
                    <form action="ConnectLogin">

                        <p>Username : <input type="text" name = "username"></p>
                        <p>Password : <input type="password" name = "password"></p>
                        <input type="submit" value="Sign in" >
                        
                    </form>   
                    </div>
  </body>
 </html>
