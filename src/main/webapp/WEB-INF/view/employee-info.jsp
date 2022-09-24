<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Ильдус
  Date: 23.09.2022
  Time: 20:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Employee info</title>
    </head>
    <body>


        <form:form action="saveEmployee" modelAttribute="employee">

            <form:hidden path="id"/>

            Name: <form:input path="name"/>
            <br>
            Surname: <form:input path="surname"/>
            <br>
            Departmnet: <form:input path="department"/>
            <br><br>
            Salary: <form:input path="salary"/>
            <br>
            <input type="submit" value="OK">
        </form:form>
    </body>
</html>
