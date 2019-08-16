<%-- 
    Document   : index
    Created on : Aug 16, 2019, 8:56:20 AM
    Author     : DUONG BACH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Breaking news</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        <nav class="navbar navbar-dark bg-primary">
            <a class="navbar-brand" href="#">Breaking news</a>
        </nav>
        <div class="container">

            <form action="<%=request.getContextPath()%>/reg" method="post">
                <div class="form-group">
                    <br>
                    <label for="exampleInputEmail1">Search</label>
                    <input type="text" class="form-control" name="search" placeholder="Bạn đang tìm gì thế"> 
                    <br>
                    <button type="submit" class="btn btn-primary">Submit</button>
                    <br>
                    </form>
                    <br>

                    <c:forEach var="item" items="${News}">

                        <div class="card-body">
                            <h5 class="card-title">${item.title}</h5>
                            <p class="card-text">${item.summary}</p>
                            <p>Đăng bởi: ${item.author}</p>
                        </div>
                    </c:forEach>

                    <nav aria-label="...">
                        <ul class="pagination">

                            <c:if test="${curr == 1}">
                                <li class="page-item disabled">
                                    <span class="page-link"href="#">Previous</span>
                                </li>     
                            </c:if>

                            <c:if test="${curr > 1}">
                                <li class="page-item disabled">
                                    <span class="page-link"href="?page=${curr-1}">Previous</span>
                                </li>     
                            </c:if>

                            <c:forEach var="i" begin="1" end="${total}" step="1">
                                <li class="page-item"><a class="page-link" href="?page=${i}">${i}</a></li>   
                                </c:forEach>

                            <c:if test="${curr == total}">
                                <li class="page-item disabled">
                                    <span class="page-link"href="#">Next</span>
                                </li>     
                            </c:if>

                            <c:if test="${curr < total}">
                                <li class="page-item disabled">
                                    <span class="page-link"href="?page=${curr+1}">Next</span>
                                </li>     
                            </c:if>
                        </ul>
                    </nav>

                </div>
                </body>
                </html>
