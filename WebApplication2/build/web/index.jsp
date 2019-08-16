<%-- 
    Document   : home
    Created on : 04-08-2019, 12:16:17
    Author     : DUONG BACH
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="dbconnect.Student"%>
<%@page import="dbconnect.StudentModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>

    <body>
        <table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">id</th>
      <th scope="col">họ tên</th>
      <th scope="col">khoa </th>
      <th scope="col">lớp</th>
      <th scope="col">chức năng</th>
    </tr>
  </thead>
            
            <%
                try {
                    StudentModel sm = new StudentModel();
                    List<Student> listStudent = sm.getStudents();
                    for (Student st : listStudent) {%>
            <tr>                
                <td>
                    <%= st.getId()%>  
                </td>
                <td>
                    <% out.print(st.getName()); %>  
                </td>
                <td>
                    <% out.print(st.getMajor()); %>  
                </td>
                <td>
                    <% out.print(st.getDob()); %>  
                </td>
                <td>
                    <a href="update.jsp?command=update&id=<%=st.getId()%>"> <input style="background-color: #0033ff" type="submit" value="update"></a><a href="/control?command=delete&id=<%=st.getId()%>"><input style="background-color: red" type="submit" value="xóa"> </a>
                </td>
            </tr>
            <%
                    }
                } catch (Exception e) {
                }
            %>          
        </table>
        <a href="add.jsp?command=add"><input style="background-color: #33ff33" type="button" value="thêm mới"></a>
    </body>
</html>
