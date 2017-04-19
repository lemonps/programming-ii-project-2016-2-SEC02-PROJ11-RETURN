

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
            <a href="subject.jsp" "><img src="stary.png" width="200" height="200"></a> 
                <c:forEach items="${videos}" var="video" varStatus="vs">
                <p>${vs.count}  ${video.title}</p>
                <p>${video.desc}</p>
                <p>${video.lecturer}</p>
                <p>${video.date_time}</p>
                <p>${video.path}</p>
                <p>${video.subject_id}</p>
            </c:forEach>
            <c:forEach items="${subject}" var="subjectt" varStatus="sj">
                <p>${sj.count}  ${video.title}</p>
                <p>${subjectt.course_id}</p>
                <p>${subjectt.name}</p>
            </c:forEach>
        </div>
    </body>
</html>
