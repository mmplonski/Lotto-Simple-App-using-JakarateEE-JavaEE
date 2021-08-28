<%--
  Created by IntelliJ IDEA.
  User: Marcin
  Date: 28.08.2021
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>

<%@ page import="com.example.Symulator_Lotto_JEE.LottoResult" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Wynik losowania</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<main>
    <% LottoResult result = (LottoResult) request.getAttribute("lottoResult"); %>
    <h2>The result of the draw: <%= result.getDrawnNumbers() %></h2>
    <h2>Your numbers: <%= result.getUserNumbers() %></h2>
    <h2>Numbers hit:<%= result.getWinnigNumbers() %></h2>
    <h2> Number of hits: <%= result.getWinnigNumbers().size() %></h2>
</main>
</body>
</html>