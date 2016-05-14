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
            <source src="../../../resources/midi/1.mp3" type="audio/mpeg">
        </audio>
        <audio id="myAudio2">
            <source src="../../../resources/midi/2.mp3" type="audio/mpeg">
        </audio>
        <audio id="myAudio3">
            <source src="../../../resources/midi/3.mp3" type="audio/mpeg">
        </audio>
        <audio id="myAudio4">
            <source src="../../../resources/midi/4.mp3" type="audio/mpeg">
        </audio>
        <audio id="myAudio5">
            <source src="../../../resources/midi/5.mp3" type="audio/mpeg">
        </audio>
        <audio id="myAudio6">
            <source src="../../../resources/midi/6.mp3" type="audio/mpeg">
        </audio>
        <audio id="myAudio7">
            <source src="../../../resources/midi/7.mp3" type="audio/mpeg">
        </audio>
        <audio id="myAudio8">
            <source src="../../../resources/midi/8.mp3" type="audio/mpeg">
        </audio>
        <audio id="myAudio9">
            <source src="../../../resources/midi/9.mp3" type="audio/mpeg">
        </audio>
        <audio id="myAudio10">
            <source src="../../../resources/midi/10.mp3" type="audio/mpeg">
        </audio>
        <audio id="myAudio11">
            <source src="../../../resources/midi/11.mp3" type="audio/mpeg">
        </audio>
        <audio id="myAudio12">
            <source src="../../../resources/midi/12.mp3" type="audio/mpeg">
        </audio>
        <audio id="myAudio13">
            <source src="../../../resources/midi/13.mp3" type="audio/mpeg">
        </audio>
        <audio id="myAudio14">
            <source src="../../../resources/midi/14.mp3" type="audio/mpeg">
        </audio>
        <audio id="myAudio15">
            <source src="../../../resources/midi/15.mp3" type="audio/mpeg">
        </audio>
        <div id="playStuff"></div>
        <div id="pageWrapper"></div>

        <script type="text/javascript">
            var str = '{ "songParts":[ { "bpm":"120", "notes":"8", "values": [ { "chord":"A", "position":"0", "name":"A0" }, { "chord":"E", "position":"3", "name":"E3" }, { "chord":"E", "position":"3", "name":"E3" }, { "chord":"", "position":"", "name":"" }, { "chord":"D", "position":"5", "name":"D5" }, { "chord":"A", "position":"0", "name":"A0" }, { "chord":"", "position":"", "name":"" }, { "chord":"E", "position":"0", "name":"E0" }] } ] }';
            buildSongPartArray(str);
        </script>

        <!--<audio id="test" controls preload="auto"><source src="1.mp3" type="audio/mpeg"/></audio>-->



    </body>
</html>
