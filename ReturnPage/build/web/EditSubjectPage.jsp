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
        <title>Edit Page</title>
    </head>
    <body>
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
