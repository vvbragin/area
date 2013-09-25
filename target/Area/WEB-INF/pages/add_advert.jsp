<!DOCTYPE html>

<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>${nameParam}</title>
</head>
<body>
Add new entry<br>

<form:form action="addAdvert" method="post" commandName="advert">
    <form:input type="text" path="name" placeholder="Ad name"/>
    <button type="submit">Add advert</button>
</form:form>




</body>
</html>