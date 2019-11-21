	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>IND-RTO</title>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script
	src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js"></script>
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
 
<script>
$(function() {
		$('form[id="regId"]').validate({
			rules : {
				reg_center : 'required'
			},
			messages : {
				reg_center : 'Please enter center'
				
			},
			submitHandler : function(form) {
				form.submit();
			}
		});
	});
</script>
<style >
body  {
  background-image: url("paper.gif");
  background-color: #cccccc;
}
</style>
</head>
<body>
	<h1>Vehicle Registration Center</h1>
		<form:form modelAttribute="vhclRegistration" method="POST" action="register" id="regId">
		<table style="border:1">
			<tr>
				<td>Registration Center</td>
				<td><form:input path="regcenter"/></td>
			</tr>
			<tr>
			<td></td>
				<%-- <td><input type="submit" name="altSubmit" formaction="/vechiles/loadVechile?vechileId=${vechileId}" value="previous"/> --%>
				<td><a href="#">previous</a>
				<input type="submit"  value="Submit"></td>
           	 </tr>
		</table>
	</form:form>
	</div>
</body>
</html>