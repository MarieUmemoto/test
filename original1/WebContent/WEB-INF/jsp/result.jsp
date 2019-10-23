<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="original.Janken" %>
    <% Janken jk = (Janken)request.getAttribute("jk"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>結果</title>
</head>
<link rel="stylesheet" href="hakubamura.css" type="text/css">
<body>
<div class ="result" align="center">
<img src="murao/<%=jk.getMuraoJanken() %>.jpg"><br>
<img src="result/<%=jk.getResult() %>.jpg"><br>
<a href="01.html">戻る</a>
<a href="01.html#an">もう一回</a>

</div>
</body>
</html>