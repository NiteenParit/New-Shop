<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="New Shop Website Using Spring MVC and Hibernate">
 <meta name="author" content="Niteen Parit">
 
<%--<meta name="_csrf" content="${_csrf.token}">
<meta name="_csrf_header" content="${_csrf.headerName}"> --%>

<title>New Shop - ${title}</title>

<!-- Bootstrap Core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">


<!-- Custom CSS -->
<link href="${css}/myapp.css" rel="stylesheet">

</head>

<body>
	


		<!-- Navigation -->
		<%@include file="./shared/navbar.jsp"%>
		
		<!-- Page content -->
		<!-- Loading the Home page content -->
		<c:if test="${userClickHome==true}"> 
		<%@include file="home.jsp"%>
		</c:if>
		
		<c:if test="${userClickAbout==true}"> 
		<%@include file="about.jsp"%>
		</c:if>
		
		<c:if test="${userClickContact==true}"> 
		<%@include file="contact.jsp"%>
		</c:if>
		
		
		<c:if test="${userClickAllProducts ==true or userClickCategoryProducts==true}"> 
		<%@include file="listProducts.jsp"%>
		</c:if>
		

		<!-- Footer comes here -->
		<%@include file="./shared/footer.jsp"%>

		
			<!--   jQuery -->
		<script src="${js}/jquery.js"></script>

	
		
		<!-- DataTable Bootstrap Script -->	
		<script src="${js}/bootstrap.min.js"></script>
		
	

</body>

</html>