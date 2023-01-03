<%-- 
    Document   : Page1
    Created on : 27 Dec, 2022, 3:15:08 PM
    Author     : mcacnj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Page</title>
    </head>
    <body>
        <h1>JSP include</h1>
        First Name:<%=request.getParameter("fname")%>
        <br>
        Last Name:<%=request.getParameter("lname")%>
        <br>
        Address:<%=request.getParameter("Address")%>
                
    </body>
</html>
