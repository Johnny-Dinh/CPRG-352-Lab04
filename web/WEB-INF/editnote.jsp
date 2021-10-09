<%-- 
    Document   : editnote
    Created on : Oct 9, 2021, 11:32:38 AM
    Author     : 792268
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note</title>
    </head>
    <body>
        <form action="note" method="post">
            <div>
                <h1>Simple Note Keeper</h1>
                <h2>Edit Note</h2>
            </div>

            <div>
                <label>Title:</label>
                <input type="text" name="title" value="">
            </div>
            
            <div>
                <label>Contents:</label>
                <textarea type="text" name="content" value=""></textarea>
            </div>
            
            <div>
                <input type="submit" name="save" value="Save">
            </div>
        </form>   
    </body>
</html>
