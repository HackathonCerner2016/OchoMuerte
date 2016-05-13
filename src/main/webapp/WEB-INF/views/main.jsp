<%-- 
    Document   : hello
    Created on : May 3, 2016, 12:23:01 AM
    Author     : cascau_neinvinsu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		
		<spring:url value="/style/main.css" var="mainCss" />
		<spring:url value="/script/jquery.js" var="jqueryJs" />
		<spring:url value="/script/main.js" var="mainJs" />
		
		<link href="${mainCss}" rel="stylesheet" />
		<script src="${jqueryJs}"></script>
		<script src="${mainJs}"></script>
		
        <title>OchoMuerte</title>
    </head>
    <body>
        hello.jsp
        ${song}
		
		<h1>1. Test CSS</h1>

		<h2>2. Test JS</h2>
		<div id="msg"></div>
    </body>
</html>
