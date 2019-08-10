<%-- 
    Document   : update
    Created on : Aug 8, 2019, 3:31:08 PM
    Author     : DUONG BACH
--%>

<%@page import="dbconnect.Student"%>
<%@page import="dbconnect.StudentModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <% StudentModel stm= new StudentModel();
        Student st= new Student();
        String id;
        if(request.getParameter("id")!=null){
            st= stm.getstd(Integer.parseInt(request.getParameter("id")));
         
        }
        %>
    </head>
    <body>
        <form action="POST? comand= update" method="login">
            Họ và tên:<br> <input type="text" name="name" value="<%= st.getName() %>"><br>
            Khoa:<br> <input type="text" name="khoa" value="<%= st.getMajor() %>"><br>
            Lớp:<br> <input type="text" name="class" value=" <%= st.getDob()%>"><br>
            <input type="submit" value="update" name="comand" >
        </form>
    </body>
</html>
