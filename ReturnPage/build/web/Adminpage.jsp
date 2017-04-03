<%-- 
    Document   : AdminPage
    Created on : Apr 3, 2017, 9:21:41 PM
    Author     : Lemon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>  
        <title>Admin Page</title>
        <meta charset="UTF-8">

    </head>
    <body>
        
        <div>
            <form method="post"  action="UploadFile" enctype="multipart/form-data">
                    <input type="file" name="File" >
                    <input type="submit" value="Upload">  
            </form>
        </div>
            
        <div>   
           <h2>Edit Subject</h2>
            <form method="post" action="EditSubject"> 
               
                <span> id </span> <input type="number" name="id"><br><br>
                <span>Edit name to</span> &nbsp <input type="text" name="name" ><br><br>                
                <span>Edit course_id to</span> &nbsp <input type="text" name="course_id" ><br><br>
                
                <input type="submit" name="submit" value="OK">                    
           
            </form>                      
        </div>
   
        
    </body>
</html>

  