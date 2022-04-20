<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!doctype html>
<html>
<head>
<div id="nav">
	<%@ include file="../include/header.jsp"%>
</div>
</head>
<body>
	<h1>회원가입</h1>
	
	<form role="form" method="post" autocomplete="off">
	<div>
		<div class="row g-3 align-items-center">
			<div class="col-auto">
				<label for="inputPassword6" class="col-form-label">아이디</label>
			</div>
			<div class="col-auto">
				<input type="text" id="userId" name="userId" class="form-control"
					aria-describedby="passwordHelpInline">
			</div>
		</div>
	</div>

	<div>
		<div class="row g-3 align-items-center">
			<div class="col-auto">
				<label for="inputPassword6" class="col-form-label">Password</label>
			</div>
			<div class="col-auto">
				<input type="password" id="userPass" name="userPass" class="form-control"
					aria-describedby="passwordHelpInline">
			</div>
			<div class="col-auto">
				<span id="passwordHelpInline" class="form-text"> Must be 8-20
					characters long. </span>
			</div>
		</div>
	</div>

	<div>
		<div class="row g-3 align-items-center">
			<div class="col-auto">
				<label for="inputPassword6" class="col-form-label">닉네임</label>
			</div>
			<div class="col-auto">
				<input type="text" id="userName" name="userName" class="form-control"
					aria-describedby="passwordHelpInline">
			</div>
		</div>
	</div>

	<div>
		<div>
			<div class="row g-3 align-items-center">
				<div class="col-auto">
					<label for="inputPassword6" class="col-form-label">전화번호</label>
				</div>
				<div class="col-auto">
					<input type="text" id="userPhon" name="userPhon" class="form-control"
						aria-describedby="passwordHelpInline">
				</div>
				<div class="col-auto">
					<span id="passwordHelpInline" class="form-text"> 숫자로만 입력하세요
					</span>
				</div>
			</div>
		</div>
	</div>
	<p><button type="submit" class="btn btn-secondary">회원가입</button></p>
	</form>
</body>
</html>