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

        <title>Create Page</title>

        <script>
            str = document.getElementById('idForCreate').value;
            function isEmpty(str) {
                return (!str || 0 === str.length);
            }
            function isBlank(str) {
                return (!str || /^\s*$/.test(str));
            }
            String.prototype.isEmpty = function () {
                return (this.length === 0 || !this.trim());
            };
        </script>

        <style>
            h1,h2{
                text-shadow: 1px 1.5px #808080;
            }
            hr{
                border : 1.5px inset #3e4f5e;
            }
            #createButt{
                border :1px inset #2F353B;
            }
        </style>

    </head>
    <body>

        <div class="container">

            <h1><b>Create Subject <i class="glyphicon glyphicon-plus"></i></b></h1>       



            <nav class="navbar navbar-inverse">
                <div id="navStyle" class="container-fluid">                  
                    <ul class="nav navbar-nav">
                        <li><a href="Adminpage.jsp">Home</a></li>
                        <li><a href="DeleteSubjectPage.jsp">Delete Subject</a></li>
                        <li><a href="EditSubjectPage.jsp">Edit Subject</a></li>
                        <li><a href="UploadVideoPage.jsp">Upload Video</a></li>
                    </ul>
                </div>
            </nav>


            <b><i class="glyphicon glyphicon-list"></i> Table Data </b>
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
                <p><b>id : </b><input id="idForCreate" type="text" name="id" class="form-control" placeholder="enter id of subject"></p>               
                <p><b>Subject name: </b><input id="subName" type="text" name="name" class="form-control" placeholder="enter name of subject"></p>                
                <p><b>Course_id : </b><input id="courseId" type="text" name="course_id" class="form-control" placeholder="enter course id of subject"></p>
                <input  id="createButt" type="submit" name="submit" class="btn btn-default" value="Create" onclick="checkCreate()">                    
            </form>                      

        </div>

    </body>
</html>
