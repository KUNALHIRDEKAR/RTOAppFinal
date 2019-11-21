<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>jQuery UI Datepicker - Display month &amp; year menus</title>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js"></script>
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">

<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>
	$(function() {
		$("#dob").datepicker({
			changeMonth : true,
			changeYear : true,
			yearRange : "1950:2019"
		});
		
	});
</script>
<script type="text/javascript">
	
</script>
<script type="text/javascript">
	$(function() {
		$('form[id="second_form"]').validate({
			rules : {
				fName : 'required',
				lName : 'required',
				email : {
					required : true,
					email : true,
				},
				ssn : {
					required : true,

				},
				phno : {
					required : true,
					minlength : 8,
				}
			},
			messages : {
				fName : 'This field is required',
				lName : 'This field is required',
				email : 'Enter a valid email',
				phno : {
					minlength : 'Password must be at least 10 characters long'
				}
			},
			submitHandler : function(form) {
				form.submit();
			}
		});

	});
</script>
<style>
.error {
	color: red;
	margin-left: 5px;
}
label.error {
	display: inline;
}
</style>

<style >
body  {
  background-image: url("paper.gif");
  background-color: #cccccc;
}
</style>

</head>
<body >
<h1 style="align-content: center;">Owner Details</h1>


	<form:form id="second_form" method="post" action="/saveFormEntity"
		modelAttribute="ownerDomain">
		<table >
			<tr>
				<td>First Name
				<td>
				<td><form:input path="fName"/></td>
			</tr>
			<tr>
				<td>Last Name
				<td>
				<td><form:input path="lName" /></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><form:radiobutton path="gender" value="male" />Male <form:radiobutton
						path="gender" value="female" />Female</td>
				<td><form:errors path="gender" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Email
				<td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td>DOB
				<td>
				<td><form:input path="dob" /></td>
			</tr>

			<tr>
				<td>Mobile Number
				<td>
				<td><form:input path="phno"/></td>
			</tr>

			<tr>
				<td>SSN
				<td>
				<td><form:input path="ssn" /></td>
			</tr>

			<tr>
				<td>Submit
				<td>
				<td><input type="submit" value="Next"></td>
			</tr>
		</table>
	</form:form>
	
</body>
</html>