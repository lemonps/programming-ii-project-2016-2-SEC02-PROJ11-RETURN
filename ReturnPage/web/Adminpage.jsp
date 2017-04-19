 <%-- 
    Document   : Adminpage
    Created on : Mar 30, 2017, 4:21:42 PM
    Author     : Lemon
--%>
<html>
    <head>  
        <title> Admin Page</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" type="text/css" href="a.css">
        <style>
            td{
               border : 4px solid white; 
            }
        </style>
        
    </head>
    
    <body>
        <h1>Hello Admin</h1>
        <hr>
           
        <div>

                   <h2>Create Subject</h2>
            <form method="post" action="CreateSub">       
                <input type="text" name="id" placeholder="input id">               
                <input type="text" name="name" placeholder="input name">                
                <input type="text" name="course_id" placeholder="input course_id" >
                <input type="submit" name="submit">                    
            </form>                      
        </div>
   

            <table>
                    <tr><td><a href="UploadVideoPage.jsp">Upload Videos</a></td></tr>
                    <tr><td><a href="EditSubjectPage.jsp">Edit Subject</a></td></tr>
                    <tr><td><a href="CreateSubjectPage.jsp">Create Subject</a></td></tr>
                    <tr><td><a href="DeleteSubjectPage.jsp">Delete Subject</a></td></tr>
                
            </table>
        </div>    
            
    </body>
</html>
