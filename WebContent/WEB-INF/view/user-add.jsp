<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>

<!DOCTYPE html>
<html>

<head>
<title> User Add Page</title>
 
</head>
<body>

<h2>Add User</h2>

<div> 
<form:form action="userAdd" modelAttribute="user" >

Name : <form:input path="name"/>
<br><br>
Password : <form:input path="password"/>
<br><br>
<input type="submit" value="Submit"/>

</form:form>

</div>


</body>

</html>