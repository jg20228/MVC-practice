<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../include/nav.jsp"%>


<div class="container">
	<form action="/blog5/user?cmd=updateProc" method="POST" class="was-validated">
	
		<input type="hidden" name ="id" value="${sessionScope.principal.id}"/>
	
		<div class="form-group">
			
			<label for="username">Username:</label> 
			<input value="${sessionScope.principal.username }"
			type="text" class="form-control" id="username" placeholder="Enter username" name="username" required readonly>
			<div class="valid-feedback">Valid.</div>
			<div class="invalid-feedback">Please fill out this field.</div>
		</div>

		<div class="form-group">
			<label for="password">Password:</label> <input type="password" class="form-control" id="password"
				placeholder="Enter password" name="password" required>
			<div class="valid-feedback">Valid.</div>
			<div class="invalid-feedback">Please fill out this field.</div>
		</div>

		<div class="form-group">
			<label for="email">Email:</label> 
			<input value="${sessionScope.principal.email}"
			type="email" class="form-control" id="email" placeholder="Enter email" name="email" required>
			<div class="valid-feedback">Valid.</div>
			<div class="invalid-feedback">Please fill out this field.</div>
		</div>

		<div class="form-group">
			<label for="address">Address:</label>
			<button type="button" class="btn-warning float-right" onclick="goPopup()">주소검색</button>
			
			<input value="${sessionScope.principal.address }" type="text" class="form-control" id="address" placeholder="Enter address" name="address" required>
			<div class="valid-feedback">Valid.</div>
			<div class="invalid-feedback">Please fill out this field.</div>
		</div>
		<button type="submit" class="btn btn-primary">회원정보수정</button>
	</form>
</div>

<script src="${path}/js/juso.js"></script>
<%@ include file="../include/footer.jsp"%>