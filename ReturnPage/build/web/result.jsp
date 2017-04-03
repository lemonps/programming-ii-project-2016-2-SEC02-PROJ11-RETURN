

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>${msg}</p>
        <c:forEach items="${videos}" var="video" varStatus="vs">
                    <p>${vs.count}  ${video.toString()}</p>
         </c:forEach>
    </body>
</html>
