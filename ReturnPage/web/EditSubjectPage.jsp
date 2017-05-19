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

        <style>
            h1,h2{
                text-shadow: 1px 1.5px #808080;
            }
        </style>
    </head>
    <body>

        <div class="container">   

            <h1><b>Edit Subject  <i class="glyphicon glyphicon-cog"></i></b></h1>

            <hr>

            <nav class="navbar navbar-inverse">
                <div class="container-fluid">                  
                    <ul class="nav navbar-nav">
                        <li><a href="Adminpage.jsp">Home</a></li>
                        <li><a href="CreateSubjectPage.jsp">Create Subject</a></li>
                        <li><a href="DeleteSubjectPage.jsp">Delete Subject</a></li>
                        <li><a href="UploadVideoPage.jsp">Upload Video</a></li>
                    </ul>
                </div>
            </nav>

            <hr><br>
            <b>Table Data</b>
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
                    <td><input type="radio" name = "selectValue" value="<%out.print(rs.getInt("id"));%>"></td>
                </tr>
                <%}%> 

            </table>

            <br><hr>

            <h2><b>Edit new value <i class="glyphicon glyphicon-edit"></i></b></h2>

            <form method="POST" action="Esubject">        
                <div class="form-group">
                    <input type="hidden"  name="id" class="form-control" placeholder="enter id of subject" value="">
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
