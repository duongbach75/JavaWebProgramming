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
        <title>Page</title>
    </head>
    <body>
        <form action="control?comand=add" method="post">
            <table>
                <tr>
                    <td>stt</td>
                    <td><input type="text" name="stt" />
                        
                </tr>
                <tr>
                    <td>Ten</td>
                    <td><input type="text" name="name" />
                        <input type="text" name="stt" value="889" hidden></td>
                </tr>
                 <tr>
                    <td>Khoa</td>
                    <td><input type="text" name="khoa" />
                     </td>
                </tr>
                 <tr>
                    <td>Lop</td>
                    <td><input type="text" name="lop" />
                      </td>
                </tr>
                <tr>
                    <td  colspan='2'>
                        <input type="hidden" value="add" name="comand" >
                        <input type="submit" value="Add">
                    </td>
                </tr>
                
         
        </form>
    </body>
</html>
