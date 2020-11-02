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
    <title>Posts</title>
</head>
<link href="https://unpkg.com/bootstrap@4.5.0/dist/css/bootstrap.min.css" rel="stylesheet" />
<body>
<button type="button" class="btn btn-primary"><a class="dropdown-item" href="users">Users</a></button>
<button type="button" class="btn btn-secondary"><a class="dropdown-item" href="posts">Posts</a></button>

<div class="dropdown">
    <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
        Dropdown button
    </button>
    <div class="dropdown-menu">
        <a class="dropdown-item" href="#">User 1</a>
        <a class="dropdown-item" href="#">User 2</a>
        <a class="dropdown-item" href="#">User 3</a>
    </div>
</div>
<div class="toast">
    <div class="toast-header">
        Author Header
    </div>
    <div class="toast-body">
        Some text inside the toast body
    </div>
</div>
</body>
</html>
