<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!doctype html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<div id="nav">
	<%@ include file="adminHeader.jsp"%>
</div>

<style type="text/css">
	.inputArea { margin:10px 0; }
	select { width:100px; }
	label { display:inline-block; width:70px; padding:5px; }
	label[for='bookDes'] { display:block; }
	input { width:150px; }
	textarea#bookDes { width:400px; height:180px; }
</style>
</head>
<body>

<form role="form" method="post" autocomplete="off">
 
 <div class="inputArea">
 <label>1차 분류</label>
 <span class="category1"></span>
	
 <label>2차 분류</label>
 <span class="category2">${goods.cateCode}</span>
</div>

<div class="inputArea">
 <label for="koName">상품명</label>
 <span>${goods.koName}</span>
</div>

<div class="inputArea">
 <label for="bookPrice">상품가격</label>
 <span><fmt:formatNumber value="${goods.bookPrice}" pattern="###,###,###"/></span>
</div>

<div class="inputArea">
 <label for="bookCount">상품수량</label>
 <span>${goods.bookCount}</span>
</div>

<div class="inputArea">
 <label for="bookDes">상품소개</label>
 <span>${goods.bookDes}</span>
</div>

<div class="inputArea">
 <button type="button" id="register_Btn" class="btn btn-warning">수정</button>
 <button type="button" id="register_Btn" class="btn btn-danger">삭제</button>
</div>
 
 
</form>

</body>
</html>