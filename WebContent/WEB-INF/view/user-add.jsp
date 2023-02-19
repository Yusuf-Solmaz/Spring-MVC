<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>

<!DOCTYPE html>
<html>

<head>
<title> User Add Page</title>
 
 <style>
 .error{
 color:red;
 }
 </style>
 
</head>
<body>

<h2>Add User</h2>

<div> 
<form:form action="userAdd" modelAttribute="user" >

Name : <form:input path="name"/>
<br><br>

Password : <form:input path="password"/>
<form:errors path="password" cssClass="error" />

<br><br>
Country : <form:select path="country">
<form:option value="Turkey" label="Turkey"></form:option>
<form:option value="England" label="England"></form:option>
<form:option value="USA" label="USA"></form:option>
<form:option value="France" label="France"></form:option>
</form:select>

<br><br>
Turkish<form:radiobutton path="nativeLanguage" value="Turkish"/>
English<form:radiobutton path="nativeLanguage" value="English"/>
French<form:radiobutton path="nativeLanguage" value="French"/>
German<form:radiobutton path="nativeLanguage" value="German"/>
<br><br>
<input type="submit" value="Submit"/>
</form:form>

</div>


</body>

</html>