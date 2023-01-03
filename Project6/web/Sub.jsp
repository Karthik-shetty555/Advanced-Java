<%-- 
    Document   : Sub
    Created on : 27 Dec, 2022, 3:08:21 PM
    Author     : mcacnj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sub</title>
    </head>
    <body>
        <h1>Subtraction</h1>
        <%
            int f1=Integer.parseInt(request.getParameter("field1"));
            int f2=Integer.parseInt(request.getParameter("field2"));
            int sub=f1-f2;
            %>
            <jsp:forward page="/Result.jsp">
                <jsp:param name="result" value="<%=sub%>"/>
            </jsp:forward>
    </body>
</html>
