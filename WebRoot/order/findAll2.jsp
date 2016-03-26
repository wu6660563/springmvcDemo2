<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="com.framework.test.model.Order"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>FindALL</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  <body>
  	TTTTTTTTTTTTTTTTT<br>
  	<% 	List<Order> list = (List<Order>)request.getAttribute("list"); 
  		for (Order order : list) {
			System.out.println(order.getBussiness_id() + "-----> "+ order.getValue());
		}
  	%>
  	<c:forEach items="${list}" var="order">
  		${order.value}----${order.create_time}---${order.modify_time}
  	</c:forEach>
  </body>
</html>
