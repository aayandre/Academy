<%-- 
    Document   : exemplo
    Created on : 16/03/2018, 21:38:08
    Author     : andre.ayamamoto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<%
    String msg = "oi galera!";
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:forEach begin="0" end="20" varStatus="cont">
            <c:choose>
                <c:when test="${cont.index % 2 == 0}">
                    <h1 style="color: red"><c:out value="${cont.index}" /><%= msg%></h1>
                </c:when>
                <c:otherwise>
                    <h1 style="color: green"><c:out value="${cont.index}" /><%= msg%></h1>
                </c:otherwise>

            </c:choose>


        </c:forEach>



    </body>
</html>
