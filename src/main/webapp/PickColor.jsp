<%--
  Created by IntelliJ IDEA.
  User: jwhester
  Date: 1/8/20
  Time: 4:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick Color</title>
    <style>
        .btn{
            background-image: linear-gradient(to left, violet, indigo, blue, green, yellow, orange, red);
            color: silver;
            font-size: 20px;
            font-weight: bold;
            height: 50px;
            width: 100px;
            border-radius: 10px;
            margin-top: 10px;

        }
        .form{
            caret-color: lawngreen;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>What is your favorite color?</h1>

    <form action="./login.jsp" method="POST">
        <div class="form-group">
            <label for="color">Color:</label>
            <input id="color" name="color" class="form" type="text">
        </div>
        <input type="submit" class="btn" value="Colorize!">
    </form>
</div>
</body>
</html>
