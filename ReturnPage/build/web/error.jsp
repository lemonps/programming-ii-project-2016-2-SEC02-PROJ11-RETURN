<%-- 
    Document   : error
    Created on : Apr 4, 2017, 11:41:19 PM
    Author     : homun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="3.css">

        <title>Error Page</title>
    </head>
    <body>
        
        <h2 style="color:red">${sessionScope.msg}</h2>
        <a href="login.jsp" style="color:yellow"> press to go back login again </a>
    </body>
</html>
