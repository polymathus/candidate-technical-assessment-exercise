<%--
  Created by IntelliJ IDEA.
  User: tommyschaeffer
  Date: 8/15/2021
  Time: 13:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>A Rather Boring & Basic Entry Form for a Search Service</title>
</head>
<body>
<h1>Person Search Service</h1>
<form action="SearchService/search/searchForPerson" method="GET">
    <table>
        <tr>
            <td colspan="2">You can search records by primary key, name or name fragment.</td>
        </tr>
        <tr>
            <td>Enter your search criteria: </td>
            <td><input type="text" name="searchCriteria" /></td>
        </tr>
    </table>
    <input type="submit" value="Submit" /></form>
</body>
</html>
