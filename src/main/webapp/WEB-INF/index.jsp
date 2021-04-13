<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <!DOCTYPE html>
    <html>
        <head>
            <meta charset="ISO-8859-1">
            <title>Insert title here</title>
        </head>
        <body>
            <div>
            <p><c:out value="${error}"/></p>
            <h1>What is the code?</h1>
            <form method="POST" action="/result">
            <input type="text" name="password">
            <input type="submit" value = "Try Code">
            <!-- <c:out value="${2+2}"/>  -->
			</form>
        </div>
</body>
</html>