
<%@page import="com.prem.model.Category"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="Userhome.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<img alt="img" src="resources/images/123.jpg" height="50" width="50" />
<p>${pr.productID}</p>
<p>${pr.productName}</p>
<p>${pr.productDescription}</p>
<p>${pr.productPrice}</p>
<form action="addtocart"  >
<input type="hidden" value="${pr.productID}" name="p"  />
Quantity<input type="text" name="q" />
<input type="submit" value="go">
</form>


<a href="#"> BuyNow</a>









</body>
</html>
