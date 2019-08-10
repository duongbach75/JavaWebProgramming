<%-- 
    Document   : add
    Created on : 04-08-2019, 12:26:43
    Author     : DUONG BACH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="POST? comand=add" method="control">
            Họ và tên:<br> <input type="text" name="name"><br>
            Khoa:<br> <input type="text" name="khoa"><br>
            Lớp:<br> <input type="text" name="class"><br>
            <input type="submit" value="add" name="comand">
        </form>
    </body>
</html>
