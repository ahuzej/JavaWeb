<%-- 
    Document   : Registration
    Created on : 26.03.2019., 11:44:26
    Author     : programer10
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login with existing account</h1>
        <form method="POST" action="accountServlet">
            <div>
                <input type="hidden" value="2" id="submitType" name="submitType"/>
                <table>
                    <tr>
                        <td>Username:</td>
                        <td><input type="text" id="username" name="username"/></td>
                    </tr>
                    <tr>
                        <td>Password:</td>
                        <td><input type="password" id="password" name="password"/></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Login"/></td>
                    </tr>
                </table>
            </div>
        </form>
    </body>
</html>
