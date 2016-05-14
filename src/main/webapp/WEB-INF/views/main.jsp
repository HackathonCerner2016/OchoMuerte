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
        
        <audio id="myAudio1">
            <source src="http://www.downloadfreesound.com/wp-content/uploads/2014/07/Beep1.mp3?_=1" type="audio/mp3">
        </audio>
        <audio id="myAudio2">
            <source src="http://www.downloadfreesound.com/wp-content/uploads/2014/07/Beep2.mp3?_=1" type="audio/mpeg">
        </audio>
        <audio id="myAudio3">
            <source src="http://www.downloadfreesound.com/wp-content/uploads/2014/07/Beep3.mp3?_=1" type="audio/mpeg">
        </audio>
        <audio id="myAudio4">
            <source src="http://www.downloadfreesound.com/wp-content/uploads/2014/07/Beep4.mp3?_=1" type="audio/mpeg">
        </audio>
        <audio id="myAudio5">
            <source src="http://www.downloadfreesound.com/wp-content/uploads/2014/07/Beep5.mp3?_=1" type="audio/mpeg">
        </audio>
        <audio id="myAudio6">
            <source src="http://www.downloadfreesound.com/wp-content/uploads/2014/07/Beep6.mp3?_=1" type="audio/mpeg">
        </audio>
        <audio id="myAudio7">
            <source src="http://www.downloadfreesound.com/wp-content/uploads/2014/07/Beep8.mp3?_=1" type="audio/mpeg">
        </audio>
        <audio id="myAudio8">
            <source src="http://www.downloadfreesound.com/wp-content/uploads/2014/07/Beep13.mp3?_=1" type="audio/mpeg">
        </audio>
        
        <div id="playStuff">WHEN I GROW UP I WANT TO BE SONGSTER <br/> <button onclick="cursorMovemenet();">Play</button></div>
        <div id="pageWrapper"></div>
        <div id="slider"></div>

        <script type="text/javascript">
            var str ='{ "songParts":[ { "bpm":"120", "notes":"8", "values": [ { "chord":"A", "position":"0", "name":"A0" }, { "chord":"E", "position":"3", "name":"E3" }, { "chord":"E", "position":"3", "name":"E3" }, { "chord":"", "position":"", "name":"" }, { "chord":"D", "position":"5", "name":"D5" }, { "chord":"A", "position":"0", "name":"A0" }, { "chord":"", "position":"", "name":"" }, { "chord":"E", "position":"0", "name":"E0" }] }, { "bpm":"120", "notes":"8", "values": [ { "chord":"A", "position":"0", "name":"A0" }, { "chord":"E", "position":"3", "name":"E3" }, { "chord":"E", "position":"3", "name":"E3" }, { "chord":"", "position":"", "name":"" }, { "chord":"D", "position":"5", "name":"D5" }, { "chord":"A", "position":"0", "name":"A0" }, { "chord":"", "position":"", "name":"" }, { "chord":"E", "position":"0", "name":"E0" }] }, { "bpm":"120", "notes":"8", "values": [ { "chord":"A", "position":"0", "name":"A0" }, { "chord":"E", "position":"3", "name":"E3" }, { "chord":"E", "position":"3", "name":"E3" }, { "chord":"", "position":"", "name":"" }, { "chord":"D", "position":"5", "name":"D5" }, { "chord":"A", "position":"0", "name":"A0" }, { "chord":"", "position":"", "name":"" }, { "chord":"E", "position":"0", "name":"E0" }] }, { "bpm":"120", "notes":"8", "values": [ { "chord":"A", "position":"0", "name":"A0" }, { "chord":"E", "position":"3", "name":"E3" }, { "chord":"E", "position":"3", "name":"E3" }, { "chord":"", "position":"", "name":"" }, { "chord":"D", "position":"5", "name":"D5" }, { "chord":"A", "position":"0", "name":"A0" }, { "chord":"", "position":"", "name":"" }, { "chord":"E", "position":"0", "name":"E0" }] }, { "bpm":"120", "notes":"8", "values": [ { "chord":"A", "position":"0", "name":"A0" }, { "chord":"E", "position":"3", "name":"E3" }, { "chord":"E", "position":"3", "name":"E3" }, { "chord":"", "position":"", "name":"" }, { "chord":"D", "position":"5", "name":"D5" }, { "chord":"A", "position":"0", "name":"A0" }, { "chord":"", "position":"", "name":"" }, { "chord":"E", "position":"0", "name":"E0" }] }, { "bpm":"120", "notes":"8", "values": [ { "chord":"A", "position":"0", "name":"A0" }, { "chord":"E", "position":"3", "name":"E3" }, { "chord":"E", "position":"3", "name":"E3" }, { "chord":"", "position":"", "name":"" }, { "chord":"D", "position":"5", "name":"D5" }, { "chord":"A", "position":"0", "name":"A0" }, { "chord":"", "position":"", "name":"" }, { "chord":"E", "position":"0", "name":"E0" }] } ] }';
            buildSongPartArray(str);
        </script>

    </body>
</html>
