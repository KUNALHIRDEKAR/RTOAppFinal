<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style >
body  {
  background-image: url("paper.gif");
  background-color: #cccccc;
}
</style>
</head>
<body>

<h2>Your Registration is Completed at " ${vhclRegistration.regcenter} RTO Center"</h2>
<h2> & your Registration number is " ${vhclRegistration.regNumber} provided by ${vhclRegistration.regcenter} RTO Office"</h2>
<h1>Thank You!!</h1>
</body>
</html>