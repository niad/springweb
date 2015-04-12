<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="decorator" uri="/WEB-INF/tld/sitemesh-decorator.tld"  %>
<%@ taglib prefix="page" uri="/WEB-INF/tld/sitemesh-page.tld"  %>

<c:set var="ctx" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><decorator:title /></title>
<%-- bootstrap version 3.3.4 --%>
<link rel="stylesheet" href="${ctx}/style/css/bootstrap.min.css" />
<link rel="stylesheet" href="${ctx}/style/css/bootstrap-theme.min.css" />

<link rel="stylesheet" href="${ctx}/style/css/main.css" />

<script src="${ctx}/style/js/bootstrap.min.js"></script>

<decorator:head />


</head>
<body>

<jsp:include page="/WEB-INF/views/layout/header.jsp"></jsp:include>
<div class="container">	
	<decorator:body />
</div>
<jsp:include page="/WEB-INF/views/layout/footer.jsp"></jsp:include>
	
</body>
</html>