<%-- 
    Document   : Adminpage
    Created on : Mar 30, 2017, 4:21:42 PM
    Author     : Lemon
--%>
<html>
    <head>  
        <title>TODO supply a title</title>
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
<<<<<<< HEAD
                id :<input type="number" name="id" >  <br>                 
                Edit name to :<input type="text" name="name" >     <br>           
                Edit course_id to :<input type="text" name="course_id" >   <br>
                <input type="submit" name="submit" value="ok">                    
           
            </form>                      
        </div>
        
        
=======
                           
                <input type="text" name="name" >                
                <input type="text" name="course_id" >
                <input type="submit" name="submit">                    
           
            </form>                      
        </div>
        <div>
                   <h2>Create Subject</h2>
            <form method="post" action="CreateSub"> 
                <input type="text" name="id">               
                <input type="text" name="name" >                
                <input type="text" name="course_id" >
                <input type="submit" name="submit">                    
            </form>                      
        </div>
   
>>>>>>> 573f8281b06a0048c007508af47ae0abd721aa27
    </body>
</html>
