<%-- 
    Document   : Products
    Created on : 26.03.2019., 12:33:32
    Author     : programer10
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="my.css" rel="stylesheet" type="text/css"/>
        <script src="script.js" type="text/javascript"></script>
        <title>Products</title>
    </head>
    <body>
        <h1>Hello ${sessionScope.account}</h1>
        <h2 id="shoppingCart"></h2>
        <c:forEach items="${products}" var="product">
            <div class="product">
                <p>${product.name}</p>
                <p>Price: ${product.price}</p>
                <input type="button" id="${product.id}" value="Buy"/>
            </div>    
        </c:forEach>
    </body>
    
</html>
