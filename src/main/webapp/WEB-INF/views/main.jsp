<%-- 
    Document   : hello
    Created on : May 3, 2016, 12:23:01 AM
    Author     : cascau_neinvinsu
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<style>
    <%@include file="../../resources/style/main.css" %>
</style>
<script>
    <%@include file="../../resources/script/jquery.js" %>
    <%@include file="../../resources/script/main.js" %>
</script>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>OchoMuerte</title>
    </head>
    <body>
        <c:forEach var="songs" items="${song.songParts}">
            ${songs.songPart} <br />
        </c:forEach>

        <h1>1. Test CSS</h1>

        <h2>2. Test JS</h2>
        <div id="msg"></div>
    </body>
</html>
