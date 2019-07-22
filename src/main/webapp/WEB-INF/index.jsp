<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page  contentType="text/html; charset=UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
        <title>Welcome</title>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/main.css"/>
</head>
<body>
<div><h1>Hello, This is JSP</h1></div>
<hr>
<h1>Ура</h1></div>
<hr>
<h2>${name}</h2>
<hr>


<a href="${pageContext.request.contextPath}/images/test.jpg">Photo</a>
<img src="${pageContext.request.contextPath}/images/test.jpg" alt="yra"/>
<hr>
<img src="${pageContext.request.contextPath}/images/test.jpg" alt="yra"/>
<hr>
<img src="${pageContext.request.contextPath}/images/test.jpg" alt="yra"/>
<hr>
<img src="${pageContext.request.contextPath}/images/test.jpg" alt="yra"/>
<hr>
мама
</body>
</html>
