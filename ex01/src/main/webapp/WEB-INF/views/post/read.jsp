<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ include file="../include/header.jsp" %>
	
	<form role="form" method="post">
		<input type='hidden' name='postId' value="${postVO.postId }">
	</form>
	
	<div class="box-body">
		<div class="form-group">
			<label for="exampleInputEmail">Title</label>
			<input type="text" name='postTitle' class="form-control" value="${postVO.postTitle }" readonly="readonly">
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">Content</label>
			<textarea class="form-control" name="postContent" rows="3" readonly="readonly">${postVO.postContent }</textarea>
		</div>
		<div class="form-group">
			<label for="exampleInputEmail">Writer</label>
			<input type="text" name="userId" class="form-control" value="${postVO.userId }" readonly="readonly">
		</div>
	</div>
	
	<div class="box-footer">
		<button type="submit" class="btn btn-warning">Modify</button>
		<button type="submit" class="btn btn-danger">REMOVE</button>
		<button type="submit" class="btn btn-primary">LIST ALL</button>
	</div>
	
	
<%@ include file="../include/footer.jsp" %>