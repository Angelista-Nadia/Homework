<%--
  Created by IntelliJ IDEA.
  User: Надя
  Date: 5/22/2024
  Time: 2:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.example.Movie.Genre" %>
<html>
<head>
    <title>Edit</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f3f3f3;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .main {
            background-color: #fff;
            border-radius: 15px;
            box-shadow: 0 0 20px
            rgba(0, 0, 0, 0.2);
            padding: 20px;
            width: 300px;
        }
        .main h2 {
            color: #4caf50;
            margin-bottom: 20px;
        }
        label {
            display: block;
            margin-bottom: 5px;
            color: #555;
            font-weight: bold;
        }
        input[type="text"],
        input[type="number"],
        select {
            width: 100%;
            margin-bottom: 15px;
            padding: 10px;
            box-sizing: border-box;
            border: 1px solid #ddd;
            border-radius: 5px;
        }
        input[type="submit"] {
            padding: 15px;
            border-radius: 10px;
            border: none;
            background-color: #4caf50;
            color: white;
            cursor: pointer;
            width: 100%;
            font-size: 16px;
        }
        button[type="edit"] {
            padding: 15px;
            border-radius: 10px;
            border: none;
            background-color: #4caf50;
            color: white;
            cursor: pointer;
            width: 100%;
            font-size: 16px;
        }
    </style>

</head>
<body>

<div class="main">
    <h2>Edit Movie</h2><br>

    <form action="/edit" method="post">

        <input name="id" type="hidden" value="${film.id}">

        <label for="Title">Title of the Movie</label>
        <input type="text" id="Title" name="title" value="${film.title}"
               required
        />

        <label for="year">Year of Release</label>
        <select id="year" name="year" value="${film.year}"><br>
            <option value="${film.year}">${film.year}</option>
            <script>
                let y = 1920
                while(y<2025)
                {
                    y++
                    document.getElementById('year').innerHTML += '<option>'+y+'</option>'
                }
            </script>
        </select>

        <label for="Review">Review</label>
        <input type="text" id="Review" name="description" value="${film.description}"
               required
        />

        <label for="Genre">Genre</label>
        <select class="selectpicker" value="${film.genre}" id="Genre" name="genre"><br>
            <c:forEach items="<%=Genre.values()%>" var="genre">
                <option value="${genre.name()}">${genre}</option>
            </c:forEach>
        </select>

        <label for="viewed">Viewed</label>
        <c:if test="${film.isView == true}">
            <input type="checkbox" checked id="viewed" name="view">
        </c:if>
        <c:if test="${film.isView == false}">
            <input type="checkbox" id="viewed" name="view" value="view">
        </c:if>

        <hr>

        <input type="submit" value="update">

    </form>
</div>
</body>
</html>