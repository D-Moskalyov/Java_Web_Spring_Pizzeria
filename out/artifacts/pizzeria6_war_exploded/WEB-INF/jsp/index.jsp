<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<tiles:insertDefinition name="defaultTemplate">
    <tiles:putAttribute name="body">
        <html>
        <head>
            <title>Index</title>
        </head>
        <body>
            <h1>Main Page</h1>
        </body>
        </html>

    </tiles:putAttribute>
</tiles:insertDefinition>