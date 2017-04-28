<%-- 
    Document   : EditPage
    Created on : Apr 13, 2017, 1:38:54 PM
    Author     : Lemon
--%>

<%@page import="model.ShowData"%>
<%@page import="java.sql.ResultSet"%>
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
            <h1>Edit Subject</h1>

            <hr><br>


            <table border = "2">
                <tr>
                    <th>ID</th>
                    <th>Subject name</th>
                    <th>Course_id</th>
                </tr>

                <%ResultSet rs = ShowData.showData();%>
                <%while (rs.next()) {%>
                <tr>
                    <td><%out.print(rs.getInt("id"));%></td>
                    <td><%out.print(rs.getString("name"));%></td>
                    <td><%out.print(rs.getString("course_id"));%></td>

                </tr>
                <%}%> 

            </table>
             
            <br>
            <hr>

            <h2>Edit . . .</h2>
            
            <form method="post" action="Esubject">          
                    
                <p>
                    <span> id : </span> <input type="text" name="id">  <br>
                    <span> Edit name to :</span> <input type="text" name="name" >     <br>           
                    <span> Edit course_id to :</span> <input type="text" name="course_id" >   <br><br>
                    <input type="submit" name="submit" value="OK" onclick="location.reload(true)">                    
                </p>

            </form>                      
        </div>

    </body>
</html>
