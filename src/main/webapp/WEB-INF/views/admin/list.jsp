<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!doctype html>
<html>
<head>
<div id="nav">
	<%@ include file="adminHeader.jsp"%>
</div>

<style type="text/css">
	#container table td { width:100px; }
</style>
</head>
<body>

<div class="container">
<table>
 <thead>
  <tr>
   <th>번호</th>
   <th>이름</th>
   <th>카테고리</th>
   <th>가격</th>
   <th>수량</th>
   <th>등록날짜</th>
  </tr>
 </thead>
 <tbody>
  <c:forEach items="${list}" var="list">
  <tr>
   <td>${list.koNum}</td>
   <td>
   	<a href="/admin/view?n=${list.koNum}">${list.koName}</a>
   </td>
   <td>${list.cateCode}</td>
   <td>
   	<fmt:formatNumber value="${list.bookPrice}" pattern="###,###,###"/>
   </td>
   <td>${list.bookCount}</td>
   <td>
   	<fmt:formatDate value="${list.bookDate}" pattern="yyyy-MM-dd" />
   	</td>
  </tr>   
  </c:forEach>
 </tbody>
</table>
</div>
</body>
</html>