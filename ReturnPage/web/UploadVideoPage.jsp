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
        <link rel="stylesheet" type="text/css" href="./css/bootstrap.min.css">
        <script type="text/javascript" src="./js/jquery.js"></script>
        <script type="text/javascript" src="./js/bootstrap.min.js"></script>
       
        <title>Upload Page</title>
    </head>
   
    <body>
        
            <div class="container">
        
                <h1><b>Upload Video   <i class="glyphicon glyphicon-cloud-upload"></i></b></h1> 
        
                         <hr>
                 
                <form method="post"  action="UploadFile" enctype="multipart/form-data">
                        <div class="form-group">
                            <b>Choose a video <i class="glyphicon glyphicon-facetime-video"></i></b>
                            <input type="file"  name="File" class="form-control" placeholder="please upload only 'mp4' file">
                         </div>
                         <button type="submit" class="btn btn-default">Upload</button>
                </form>
            </div>
       
    </body>
</html>
