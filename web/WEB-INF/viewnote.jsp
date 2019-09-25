<%-- 
    Document   : viewnote
    Created on : Sep 19, 2019, 12:19:18 PM
    Author     : 749300
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="note" method="get">
            <h1>Simple Note Keeper</h1>
            <h2>View Note</h2>
        
        Title:${note.title}<br>
        Contents:${note.contents}<br>
        <a href="note?edit">Edit</a>
       
        </form>
            
    </body>
</html>
