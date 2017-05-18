<%-- 
    Document   : CreateSubjectPage
    Created on : Apr 14, 2017, 8:54:33 PM
    Author     : Lemon
--%>

<%@page import="model.ShowData"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="./css/bootstrap.min.css">
        <script type="text/javascript" src="./js/jquery.js"></script>
        <script type="text/javascript" src="./js/bootstrap.min.js"></script>

        <title>Create subject Page</title>
    </head>
    <body>

        <div class="container">
            <h1><b>Create Subject <i class="glyphicon glyphicon-plus"></i></b></h1>       
                <hr>

            <table class="table table-striped">
                <tr>
                    <th>ID</th>
                    <th>Subject name</th>
                    <th>Subject course id</th>
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

                <hr>
            
                <h2><b>Create Subject <i class="glyphicon glyphicon-plus-sign"></i></b></h2>
           
            <form method="POST" action="CreateSub"> 
                <p><b>id : </b><input type="text" name="id" class="form-control" placeholder="enter id of subject"></p>               
                <p><b>Subject name: </b><input type="text" name="name" class="form-control" placeholder="enter name of subject"></p>                
                <p><b>Course_id : </b><input type="text" name="course_id" class="form-control" placeholder="enter course id of subject"></p>
                <input type="submit" name="submit" class="btn btn-default" value="Create">                    
            </form>                      
       
        </div>

    </body>
</html>
