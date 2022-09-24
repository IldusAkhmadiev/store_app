<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Ильдус
  Date: 23.09.2022
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>All Employees:</h2>
    <br>
    <table>
        <tr>
            <th>Name</th>
            <th>Surname</th>
            <th>Department</th>
            <th>Salary</th>
        </tr>

        <c:forEach var="field" items="${allEmps}">
        <tr>
            <td>${field.name}</td>
            <td>${field.surname}</td>
            <td>${field.department}</td>
            <td>${field.salary}</td>
        </tr>
        </c:forEach>
    </table>
    <br>
    <input type="button" value="Add" onclick="window.location.href = 'addEmployee' "/>


</body>
</html>
