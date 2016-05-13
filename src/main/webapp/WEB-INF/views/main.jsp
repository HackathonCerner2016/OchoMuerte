<%-- 
    Document   : hello
    Created on : May 3, 2016, 12:23:01 AM
    Author     : cascau_neinvinsu
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <!--<link rel="stylesheet" type="text/css" href="../stylesheet/main.css" />-->
        <!--<spring:url value="../style/main.css" var=""/>-->
        
        <link type="text/css" rel="stylesheet" href="<c:url value="/main.css"/>"/>
        
        <spring:url value="/script/jquery.js" var="jqueryJs" />
        <spring:url value="/script/main.js" var="mainJs" />

    <script src="${mainJs}"></script>
    <script src="${mainCss}" rel="stylesheet"></script>

    <title>OchoMuerte</title>
</head>
<body>
    ${song}

    <h1>1. Test CSS</h1>

    <h2>2. Test JS</h2>
    <div id="msg"></div>
</body>
</html>
