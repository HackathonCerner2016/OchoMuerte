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
        
        <div id="playStuff"></div>
        <div id="pageWrapper"></div>
        
	<script type="text/javascript">
            var str = '{ "songParts":[ { "bpm":"120", "notes":"8", "values": [ { "chord":"A", "position":"0", "name":"A0" }, { "chord":"E", "position":"3", "name":"E3" }, { "chord":"E", "position":"3", "name":"E3" }, { "chord":"", "position":"", "name":"" }, { "chord":"D", "position":"5", "name":"D5" }, { "chord":"A", "position":"0", "name":"A0" }, { "chord":"", "position":"", "name":"" }, { "chord":"E", "position":"0", "name":"E0" }] } ] }';
            buildSongPartArray(str);
        </script>
        
        
        
    </body>
</html>
