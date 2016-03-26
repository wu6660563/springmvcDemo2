<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
    	<base href="<%=basePath%>">
    
    	<title>SpringMVC</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">    
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
		<link rel="stylesheet" type="text/css" href="styles.css">
		-->
  	</head>
  
  	<body>
    	SpringMVC Index<br>
    	<c:forTokens items="s0 s1;s2 s3 s4 s5 s6" delims=" " var="item" begin="1" end="3">
    		<c:out value="${item}"></c:out>
    	</c:forTokens><br>
    	<c:url value="/order/findAll2.jsp"></c:url><br>
    	<c:url value="order/findAll2.jsp"></c:url><br>
    	<fmt:formatNumber value="23.1234567" type="currency" currencyCode="USD" currencySymbol="$" maxFractionDigits="4">
    	</fmt:formatNumber><br>
    	<fmt:formatNumber value="4567823.1234567" pattern="#,#00.0#">
    	</fmt:formatNumber><br>
    	<fmt:formatDate dateStyle="short" type="both" timeStyle="short" value="<%=new Date()%>"/><br>
    	contains:${fn:contains("HelloWorld", "Hello") }
    	endsWith:${fn:endsWith("HelloWorld", "World") }
    	indexOf:${fn:indexOf("1HelloWorld", "Hello")}
    	startsWith:${fn:startsWith("HelloWorld", "Hello")}
    	<br>
    	<spring:message code="test"></spring:message>
  	</body>
</html>
