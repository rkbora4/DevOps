<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
    <head>
        <title>Result</title>
    </head>
    <body>
        <h1><c:out value="${message}"></c:out></h1>
        
        <h2><a href="./AnimalList">Animal List</a></h2>
    </body>
</html>