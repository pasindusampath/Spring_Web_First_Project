<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Pasindu Sampath
  Date: 7/23/2023
  Time: 1:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
</head>
<body>
<h1>NEW STUDENT</h1>
<form:form action="save" modelAttribute="student">
    <div class="main">
        <div class="inner">
            <div class="form-group">
                <div>
                    <label for="studentName">Student Name</label>
                    <input name="studentName" id="studentName" type="text">
                </div>
                <div>
                    <label for="studentAddress">Student Address</label>
                    <input name="studentAddress" id="studentAddress" type="text">
                </div>
                <div>
                    <label for="studentMobileNo">Student Contact</label>
                    <input name="studentMobileNo" id="studentMobileNo" type="text">
                </div>
                <div>
                    <form:select path="city">
                        <form:options items="${student.cityData}"/>
                    </form:select>
                    <hr>
                    HNB:<form:checkbox path="accounts" value="hnb"/>
                    NSB:<form:checkbox path="accounts" value="nsb"/>
                    BOC:<form:checkbox path="accounts" value="bos"/>
                    DFCC:<form:checkbox path="accounts" value="dfcc"/>
                    NTB:<form:checkbox path="accounts" value="ntb"/>
                </div>
                <input type="submit" value="submit" placeholder="submit">
            </div>
        </div>
    </div>
</form:form>
</body>
</html>
