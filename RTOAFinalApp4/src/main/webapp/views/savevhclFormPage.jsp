<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="//code.jquery.com/jquery.min.js"></script>
<script src="lib/year-select.js"></script>

<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js"></script>
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<style >
body  {
  background-image: url("paper.gif");
  background-color: #cccccc;
}
</style>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script type="text/javascript">
	$(function() {
		$('form[id="second_form"]').validate({
			rules : {
				vhclType : 'required',
				mfgYear : 'required',
				vhclBrabd : 'required'
							},
			messages : {
				vhclType : 'This field is required',
				mfgYear : 'This field is required',
				vhclBrabd : 'This field is required'
			
			},
			submitHandler : function(form) {
				form.submit();
			}
		});

	});
</script>

<script >
$(function() {

	$("#yearselect").yearselect({
		start: 2000,
		  end: 2019,
		  displayAsValue:true,
		  
		 
		});
	
});</script>
<style>
.error {
	color: red;
	margin-left: 5px;
}
label.error {
	display: inline;
}
</style>





</head>
<body>
<h1 align="center">Fill Vehicle Detailes</h1>


<form:form id="second_form" method="post" action="/saveVhclFormEntity" modelAttribute="vhclDomain" >
<table>
<tr>
<td>Owner ID</td>
<td>${ownerID}</td>
</tr>

<tr>
<td>vhclType</td>
<td><form:select  path="vhclType">
<option value="">Select Vehicle Type</option>
 <option value="Two_Wheeler">TWO WHEELER</option>
    <option value="Three_Wheeler">TWO WHEELER</option>
    <option value="Four_Wheeler">Four WHEELER</option>
</form:select>
</td>
</tr>
<tr>
<td>mfgYear</td>
<td><form:select  path="mfgYear" >
<option value="">Select MFG Year</option>
 <option value="2000">2000</option>
    <option value="2001">2001</option>
    <option value="2002">2002</option>
    <option value="2003">2003</option>
 <option value="2004">2004</option>
    <option value="2005">2005</option>
    <option value="2006">2006</option>
    <option value="2007">2007</option>
 <option value="2008">2008</option>
    <option value="2009">2009</option>
    <option value="20010">20010</option>
	  <option value="2011">2011</option>
    <option value="2012">2012</option>
    <option value="2013">2013</option>
 <option value="2014">2014</option>
    <option value="2015">2015</option>
    <option value="2016">2016</option>
    <option value="2017">2017</option>
 <option value="2018">2018</option>
    <option value="2019">2019</option>
  
</form:select></td>
</tr>
<tr>
<td>vhclBrand</td>
<td><form:input path="vhclBrabd" /></td>
</tr>

<td></td>
<td><input type="submit" value="Submit"></td>
</tr>

</table>
</form:form>
</body>
</html>