<%@ taglib tagdir="/WEB-INF/tags" prefix="t"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
 <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<t:template>
<table>
			<thead>
			<tr>
			<th>ID</th>
			<th>Title</th>
			<th>Description</th>
			<th>Quantity</th>
			<th>Price</th>
			<th>Category Id</th>
			<th>Category title</th>
						</tr>
						</thead>
						<tbody>
								<c:forEach  items = "${products}" var="products">
								<tr>
								<td>${product.id}</td>
								<td>${product.title}</td>
								<td>${product.description}</td>
								<td>${product.quantity}</td>
								<td>${product.price}</td>
								<td>${product.productCategory.id}</td>
								<td>${product.productCategory.title}</td>
								</tr>
								</c:forEach>
						</tbody>
</table>
</t:template>
