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
        <link rel="stylesheet" type="text/css" href="./css/bootstrap.min.css">
        <script type="text/javascript" src="./js/jquery.js"></script>
        <script type="text/javascript" src="./js/bootstrap.min.js"></script>

        <title>Edit Page</title>
    </head>
    <body>

        <div class="container">   

            <h1><b>Edit Subject  <i class="glyphicon glyphicon-cog"></i></b></h1>

            <hr><br>

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

            <br><hr>

            <h2><b>Edit new value <i class="glyphicon glyphicon-edit"></i></b></h2>

            <form method="post" action="Esubject">        
                <div class="form-group">
                    <b>id : </b>
                    <input type="text"  name="id" class="form-control" placeholder="enter id of subject">
                </div>
                <div class="form-group">
                    <b>Edit name to : </b>
                    <input type="text" name="name" class="form-control" placeholder="enter new subject name">
                </div>
                <div class="form-group">
                    <b>Edit course id to : </b>
                    <input type="text" name="course_id" class="form-control" placeholder="enter new course id">
                </div>

                <button type="submit" class="btn btn-default">OK</button>
            </form>  

        </div>

    </body>
</html>
