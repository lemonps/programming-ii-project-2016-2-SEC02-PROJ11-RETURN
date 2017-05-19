<%-- 
    Document   : welcomeToDelete
    Created on : Apr 6, 2017, 10:23:00 AM
    Author     : WIN10_M7
--%>

<%@page import="model.ShowData"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <link rel="stylesheet" type="text/css" href="./css/bootstrap.min.css">
        <script type="text/javascript" src="./js/jquery.js"></script>
        <script type="text/javascript" src="./js/bootstrap.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <form action="Delete">
            <h2>Delete Subject</h2>
            <hr>
            <table border = "1">
                <tr><th>ID</th><th>Name</th><th>Course_id</th><th>Delete</th></tr>
            <nav class="navbar navbar-inverse">
                <div class="container-fluid">                  
                    <ul class="nav navbar-nav">
                        <li><a href="Adminpage.jsp">Home</a></li>
                        <li><a href="CreateSubjectPage.jsp">Create Subject</a></li>
                        <li><a href="EditSubjectPage.jsp">Edit Subject</a></li>
                        <li><a href="UploadVideoPage.jsp">Upload Video</a></li>
                    </ul>
                </div>
            </nav>
                <%ResultSet rs = ShowData.showData();%>
                <%while (rs.next()) {%>
                <tr>
                    <td><%out.print(rs.getInt("id"));%></td>
                    <td><%out.print(rs.getString("name"));%></td>
                    <td><%out.print(rs.getString("course_id"));%></td>
                    <td><input type="checkbox" name = "DeleteBox" value="<%out.print(rs.getInt("id"));%>"></td> 
                </tr>
                <%}%> 
            </table>

            <input type="submit" onclick="location.reload(true)">
        </form>    
    </body>
</html>
