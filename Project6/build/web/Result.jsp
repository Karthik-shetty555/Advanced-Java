<%-- 
    Document   : Result
    Created on : 27 Dec, 2022, 3:11:23 PM
    Author     : mcacnj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result</title>
    </head>
    <body>
        <h1>Result</h1>
        <%=request.getParameter("result")%>
        <br>
        <b>use of include Tag</b><br>
        <jsp:include page="Page1.jsp">
            <jsp:param name="fname" value="MCA"/>
            <jsp:param name="lname" value="VCET"/>
            <jsp:param name="Address" value="Puttur"/>
        </jsp:include>
                
    </body>
</html>
