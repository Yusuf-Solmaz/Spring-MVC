<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>

<!DOCTYPE html>
<html>

<head>
<title> Computer Add Page</title>
 
 <style>
 .error{
 color:red;
 }
 </style>
 
</head>
<body>

<h2>Add Computer</h2>

<div> 
<form:form action="computerAdd" modelAttribute="computer" >

Brand : <form:input path="brand"/>
<form:errors path="brand" cssClass="error"/>
<br><br>

Ram Capacity (GB) : <form:select path="ramCapacity">
<form:option value="4" label="4"></form:option>
<form:option value="8" label="8"></form:option>
<form:option value="16" label="16"></form:option>
<form:option value="32" label="32"></form:option>
</form:select>

<br><br>

Display Card Capacity (GB) : <form:input path="displayCardCapacity"/>
<form:errors path="displayCardCapacity" cssClass="error"/>

<br><br>

Serial Number: <form:input path="serialNumber"/>
<form:errors path="serialNumber" cssClass="error"/>
<br><br>
Display Card Brand: <form:input path="displayCardBrand"/>
<form:errors path="displayCardBrand" cssClass="error"/>
<br><br>
<input type="submit" value="Submit"/>

</form:form>


</div>


</body>

</html>