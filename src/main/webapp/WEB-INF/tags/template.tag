<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
 <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
 <%@ taglib prefix="locale" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" href='<c:url value="/css/main.css" />' />

<script src="<c:url value="/js/main.js" />"></script>

<title>Insert title here</title>
</head>
<body>
			<div class="" style="height: 100px; background-color: #abb231;"> 
			<form action="<c:url value="/logout.htm" />" method= "POST">
			<input type="hidden"  name="${_csrf.parameterName}" value="${_csrf.token}" />
			<input type="submit" name="submit" value="Logout" />
			</form>
			</div>
			<jsp:doBody />
</body>
</html>