<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.example.Movie.Genre" %>
<html>
<head>
    <title>Movie</title>
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
        select {
            width: 100%;
            margin-bottom: 15px;
            padding: 10px;
            box-sizing: border-box;
            border: 1px solid #ddd;
            border-radius: 5px;
        }
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
    <h2>Add new Movie</h2><br>
    <form method="post" action="/">

        <label for="Title">Title of the Movie</label>
        <input type="text" id="Title" name="title"
               required
        />

        <label for="year">Year of Release</label>

        <select id="year" name="year"><br>
            <option value="">Year</option>
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
        <input type="text" id="Review" name="description"
               required
        />

        <label for="Genre">Genre</label>
        <select class="selectpicker" id="Genre" name="genre"><br>
            <c:forEach items="<%=Genre.values()%>" var="genre">
                <option value="${genre}">${genre}</option>
            </c:forEach>
        </select>


        <label for="viewed">Viewed</label>
        <input type="checkbox" id="viewed" name="view" value="view"/>

        <hr>

        <input type="submit" value="save">

    </form>
</div>

<table>
    <colgroup>
        <col span="4" style="background:Khaki">
        <col style="background-color: white">
        <col style="background-color:#33d1ff">
        <col style="background-color:#ff564f">

    </colgroup>
    <tr>
        <td style="background-color: #4caf50; color: white; cursor: pointer">Title of the Movie</td>
        <td style="background-color: #4caf50; color: white; cursor: pointer">Year of Release</td>
        <td style="background-color: #4caf50; color: white; cursor: pointer">Review</td>
        <td style="background-color: #4caf50; color: white; cursor: pointer">Genre</td>
        <td style="background-color: #4caf50; color: white; cursor: pointer">Viewed</td>
    </tr>

    <ul>
        <c:forEach items="${films}" var="film">
            <td>${film.title}</td>
            <td>${film.year}</td>
            <td>${film.description}</td>
            <td>${film.genre}</td>
            <td>
                <c:if test="${film.isView == true}">
                    <input type="checkbox" checked>
                </c:if>
                <c:if test="${film.isView == false}">
                </c:if></td>
            <td><a href="<c:url value='/edit?id=${film.id}'/>"> Edit </a></td>
            <td><a href="<c:url value='/delete?id=${film.id}'/>"> Delete </a></td>
            </tr>
        </c:forEach>
    </ul>

</table>

</body>
</html>