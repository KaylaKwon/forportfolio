<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ include file="../include/header.jsp" %>
	
	<form role="form" method="post">
		<input type='hidden' name='postId' value="${postVO.postId }">
	</form>
	
	<div class="box-body">
		<div class="form-group">
			<label for="exampleInputEmail1">Title</label>
			<input type="text" name='postTitle' class="form-control" value="${postVO.postTitle }" readonly="readonly">
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">Content</label>
			<textarea class="form-control" name="postContent" rows="3" readonly="readonly">${postVO.postContent }</textarea>
		</div>
		<div class="form-group">
			<label for="exampleInputEmail1">Writer</label>
			<input type="text" name="userId" class="form-control" value="${postVO.userId }" readonly="readonly">
		</div>
	</div>
	
	<div class="box-footer">
		<button id="modifyPost" type="submit" class="btn btn-warning">Modify</button>
		<button id="removePost" type="submit" class="btn btn-danger">REMOVE</button>
		<button id="goList" type="submit" class="btn btn-primary">LIST ALL</button>
	</div>
	
<%@ include file="../include/footer.jsp" %>


<script>

	$(document).ready(function(){
		var formObj = $("form[role = 'form']");
		console.log(formObj);
		
		$(".btn-warning").on("click", function(){
			formObj.attr("action", "/post/modify");
			formObj.attr("method", "get");
			formObj.submit();
		});
		
		$(".btn-danger").on("click", function(){
			formObj.attr("action", "/post/remove");
			formObj.submit();
		});
		
		$(".btn-primary").on("click", function(){
			self.location = "/post/listAll";
		});
	});
	
/* 	$(".btn-primary").on("click", function(){
		formObj.attr("action", "/post/modify");
		formObj.attr("method", "get");
		formObj.submit();
	}); */
	
	
</script>