<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ include file="../include/header.jsp" %>
	
	<form role="form" method="post">
		<div class="box-body">
			<div class="form-group">
				<label for="exampleInputEmail1>">PostID</label>
				<input type="text" name='postId' class="form-control" values="${postVO.postID }" readonly="readonly">
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1>">Title</label>
				<input type="text" name='postTitle' class="form-control" values="${postVO.postTitle }">
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Content</label>
				<textarea class="form-control" name="postContent" rows="3">${postVO.postContent}</textarea>
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1>">Writer</label>
				<input type="text" name='userId' class="form-control" values="${postVO.userId }">
			</div>
		</div>
		
		
	</form>
	
	<div class="box-footer">
		<button type="submit" class="btn btn-primary">SAVE</button>
		<button type="submit" class="btn btn-warning">CANCEL</button>
	</div>
	
<%@ include file="../include/footer.jsp" %>


<script>
	$(document).ready(function(){
		var formObj = $("form[role = 'form']");
		console.log(formObj);
		
		$(".btn-warning").on("click", function(){
			self.location = "/post/listAll";
		});
		
		$(".btn-primary").on("click", function(){
			formObj.submit();
		});
		
	});
	
	
	
</script>







