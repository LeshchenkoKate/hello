<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
    <title>Add author</title>

<body>

<h1>Create new author</h1>

<form:form method="POST" action="/addAuthor" modelAttribute="author">
    <table>
        <tr>
            <td><form:label path="nick">Nickname </form:label></td>
            <td><form:input path="nick" /></td>
        </tr>

        <tr>
            <td><input type="submit" value="Submit" /></td>
        </tr>
    </table>
</form:form>
</body>
</html>
