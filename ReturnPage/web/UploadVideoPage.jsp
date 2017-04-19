<%-- 
    Document   : UploadVideoPage
    Created on : Apr 13, 2017, 1:33:11 PM
    Author     : Lemon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="3.css">
        <title>Upload Page</title>
    </head>
    <body>
        <h1>Upload Video</h1> 
        
        <hr>
        
        <div>
            <form method="post"  action="UploadFile" enctype="multipart/form-data">
                    <input type="file" name="File" >
                    <input type="submit" value="Upload">  
            </form>
        </div>
    </body>
</html>
