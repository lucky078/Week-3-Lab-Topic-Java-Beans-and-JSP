<%-- 
    Document   : editnote
    Created on : Sep 19, 2019, 12:19:48 PM
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
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
        <form action="note" method="post">
            <table>
                <tr><td>Title:</td>
                    <td><input type="text" name="tit" value="${note.title}"> </td>
                </tr>
                <tr><td>Contents:</td>
                    <td>
                        <textarea rows="4" cols="50" name="con" >${note.contents}</textarea></td>
                </tr>
            </table>
             <input type="submit" name="save" value="Save">
              <input type="submit" name="delete" value="Delete">
               <input type="submit" name="edit" value="Edit">
        </form>
        
    </body>
</html>
