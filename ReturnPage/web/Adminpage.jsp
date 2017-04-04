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
                id :<input type="number" name="id" >  <br>                 
                Edit name to :<input type="text" name="name" >     <br>           
                Edit course_id to :<input type="text" name="course_id" >   <br>
                <input type="submit" name="submit" value="ok">                    
           
            </form>                      
        </div>
        
        
    </body>
</html>

  