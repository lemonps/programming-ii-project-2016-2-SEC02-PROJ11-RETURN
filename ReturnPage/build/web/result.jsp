

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div id = "pz">
            <c:forEach items="${videos}" var="video" varStatus="vs">
                <a href="ControlVideo?vid=${video.id}" onClick=""><img src="stary.png" width="200" height="200"></a> 
                <p>Video Title : ${video.title}</p>
                <p>Video Description : ${video.desc}</p>
                <p>Video Lecturer : ${video.lecturer}</p>
                <p> Video Time : ${video.date_time}</p>
            </c:forEach>
        </div>
    </body>
</html>
