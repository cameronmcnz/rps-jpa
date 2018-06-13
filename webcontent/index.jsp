<html>
<head>
<title>Roshambo!</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<p>Which one will it be?</p>

<a href="GameServlet?choice=rock">rock</a>
<a href="GameServlet?choice=paper">paper</a>
<a href="GameServlet?choice=scissors">scissors</a>

<%
com.mcnz.rps.GameSummary gameSummary = (com.mcnz.rps.GameSummary)request.getAttribute("gameSummary");
if (gameSummary!=null) {
%>

<br/><br/>
Server chose: ${gameSummary.serverGesture} <br/>
You chose: ${gameSummary.clientGesture} <br/>
Result: ${gameSummary.result} <br/>
<br/><br/>
Time played: ${gameSummary.date}
<%
}
%>
</body>
</html>