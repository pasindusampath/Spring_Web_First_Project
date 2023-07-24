<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%--
  Created by IntelliJ IDEA.
  User: Pasindu Sampath
  Date: 7/24/2023
  Time: 5:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
 name : ${student.studentName}
 address : ${student.city}
 <ul>
     <c:forEach var="data" items="${student.accounts}">
         <li>${data}</li>
     </c:forEach>
 </ul>

</body>
</html>
