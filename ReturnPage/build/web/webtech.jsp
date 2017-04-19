

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <a href="DisplayWebtech.jsp" "><img src="stary.png" width="200" height="200"></a> 
                <c:forEach items="${videos}" var="video" varStatus="vs">
                <p>Video Title : ${video.title}</p>
                <p>Video Description : ${video.desc}</p>
                <p>Video Lecturer : ${video.lecturer}</p>
                <p> Video Time : ${video.date_time}</p>
                <p> Video Path : ${video.path}</p>
                <p>Video Subject ID : ${video.subject_id}</p>
            </c:forEach>
            <c:forEach items="${subject}" var="subjectt" varStatus="sj">
                <p>Subject Course ID : ${subjectt.course_id}</p>
                <p>Subject Name : ${subjectt.name}</p>
            </c:forEach>
        </div>
    </body>
</html>
