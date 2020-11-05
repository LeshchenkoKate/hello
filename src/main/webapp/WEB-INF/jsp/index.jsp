<%--
  Created by IntelliJ IDEA.
  User: omegi
  Date: 01.11.2020
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Hello</title>
</head>
<link href="https://unpkg.com/bootstrap@4.5.0/dist/css/bootstrap.min.css" rel="stylesheet" />
<body>
<button type="button" class="btn btn-primary"><a class="dropdown-item" href="users">Users</a></button>
<button type="button" class="btn btn-secondary"><a class="dropdown-item" href="posts">Posts</a></button>
<form class="form-inline" action="/action_page.php">
    <label for="name">First name:</label>
    <input type="name" class="form-control" placeholder="Enter first name" id="name">
    <label for="lastname">Last name:</label>
    <input type="lastname" class="form-control" placeholder="Enter last name" id="lastname">
    <label for="email">Email address:</label>
    <input type="email" class="form-control" placeholder="Enter email" id="email">
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
<div class="container">
    <h2>Table with users</h2>
    <table class="table">
        <thead class="thead-dark">
        <tr>
            <th>Firstname</th>
            <th>Lastname</th>
            <th>Email</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>Author.getAuthor()</td>
            <td>Doe</td>
            <td>john@example.com</td>
        </tr>
        <tr>
            <td>Mary</td>
            <td>Moe</td>
            <td>mary@example.com</td>
        </tr>
        <tr>
            <td>July</td>
            <td>Dooley</td>
            <td>july@example.com</td>
        </tr>
        </tbody>
    </table>

</div>

</body>
</html>
