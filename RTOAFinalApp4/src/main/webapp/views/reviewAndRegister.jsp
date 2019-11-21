<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html>
<html>
<head>
<style >
body  {
  background-image: url("paper.gif");
  background-color: #cccccc;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form action="/finalPage" method="post"
		modelAttribute="vhclRegDetails">
		<h1 align="center" style="color: blue;">Owner Details</h1>

		<h5 align="center">First Name ::${OwnerDetail.fName}</h5>
		<h5 align="center">Last Name ::${OwnerDetail.lName}</h5>
		<h5 align="center">Gender ::${OwnerDetail.gender}</h5>
		<h5 align="center">Phon No ::${OwnerDetail.phno}</h5>
		<h5 align="center">Birthday ::${OwnerDetail.dob}</h5>
		<h5 align="center">SSN ::${OwnerDetail.ssn}</h5>
		<h5 align="center">Created date ::${OwnerDetail.create_dt}</h5>
		<h5 align="center">Created date ::${OwnerDetail.update_dt}</h5>
		<h1 align="center" style="color: blue;">Owner Address Details</h1>

		<h5 align="center">House No. ::${addressDomain.hNo}</h5>
		<h5 align="center">Street Name ::${addressDomain.street_name}</h5>
		<h5 align="center">City ::${addressDomain.city}</h5>
		<h5 align="center">Zip code ::${addressDomain.zip_Code}</h5>

		<h1 align="center" style="color: blue;">Vehical Details</h1>

		<h5 align="center">Vehicle Type ::${vhclDomain.vhclType}</h5>
		<h5 align="center">MFG Year ::${vhclDomain.mfgYear}</h5>
		<h5 align="center">Vehicle Brand ::${vhclDomain.vhclBrabd}</h5>
		<button align="center" style="color: blue; width: 20%; height: 20%;">
			<input type="submit" value="Previous" />
		</button> &nbsp;&nbsp; <button align="center"
			style="color: blue; width: 20%; height: 20%;">
			<input type="submit" value="Submit" />
		</button>
	</form:form>
</body>
</html>