<%-- 
    Document   : EditPage
    Created on : Apr 13, 2017, 1:38:54 PM
    Author     : Lemon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="3.css">
        <title>Edit Page</title>
    </head>
    <body>
        <div>   
           <h2>Edit Subject</h2>
           
           <hr><br>
           
            <form method="post" action="EditSubject"> 
               <span> id :</span> <input type="number" name="id" >  <br>                 
               <span> Edit name to :</span> <input type="text" name="name" >     <br>           
               <span> Edit course_id to :</span> <input type="text" name="course_id" >   <br>
                <input type="submit" name="submit" value="ok">                    
           
            </form>                      
        </div>
    </body>
</html>
