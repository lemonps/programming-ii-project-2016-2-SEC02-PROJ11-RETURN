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
        <link rel="stylesheet" type="text/css" href="./css/bootstrap.min.css">
        <script type="text/javascript" src="./js/jquery.js"></script>
        <script type="text/javascript" src="./js/bootstrap.min.js"></script>

        <title>Error Page</title>
    </head>
    <body>
        <div class="container"> 
            <div class="alert alert-warning">
                <strong>Warning !!  </strong>    ${sessionScope.msg} 
            </div>
                <button type="button" class="btn btn-default"><a href="login.jsp"> Press to go back login again </a></button>
        </div>
    </body>
</html>
