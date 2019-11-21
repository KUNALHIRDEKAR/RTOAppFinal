<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js"></script>
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">

<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script type="text/javascript">
	$(function() {
		$('form[id="second_form"]').validate({
			rules : {
				hNo : 'required',
				street_name : 'required',
				city : 'required',
				state : 'required',

				zip_Code : {
					required : true,
					minlength : 6,
				}
			},
			messages : {
				hNo : 'This field is required',
				street_name : 'This field is required',
				city : 'This field is required',
				state : 'This field is required',
				zip_Code : {
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
<body>
	<h1 align="center">Fill Address Detailes</h1>


	<form:form id="second_form" method="post" action="/saveOwnerFormEntity"
		modelAttribute="addressDomain">
		<table>
		
			<tr>
				<td><form:hidden path="ownerID"/></td>
			</tr>
			<tr>
				<td>House No</td>
				<td><form:input path="hNo" /></td>
			</tr>
			<tr>
				<td>Street Name</td>
				<td><form:input path="street_name" /></td>
			</tr>
			<tr>
				<td>City</td>
				<td><form:input path="city" /></td>
			</tr>
			<tr>
				<td>State</td>
				<td><form:input path="state" /></td>
			</tr>
			<tr>
				<td>Zip Code</td>
				<td><form:input path="zip_Code" /></td>
			</tr>
			<tr>

				<td>Previous</td>
				<td><a href="/previousFormPage">Previous</a></td>
				<td></td>
				<td><input type="submit" value="Submit"></td>
			</tr>

		</table>
	</form:form>
</body>
</html>