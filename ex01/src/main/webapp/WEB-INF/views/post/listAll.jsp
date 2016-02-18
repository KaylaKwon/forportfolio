<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false"%>

<%@ include file="../include/header.jsp"%>

<div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
          <h1>
            Board Management
            <small>Preview</small>
          </h1>
          <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
            <li><a href="#">Forms</a></li>
            <li class="active">General Elements</li>
          </ol>
        </section>
        
	<div class="col-md-12">
		<div class="box">
			<table class="table table-bordered">
				<tr>
					<th style="width: 10px">postId</th>
					<th>TITLE</th>
					<th>WRITER</th>
					<th>REGDATE</th>
					<th style="width: 40px">VIEWCNT</th>
				</tr>
				
				<c:forEach items="${list}" var="postVO">
				
				<tr>
					<td>${postVO.postId}</td>
					<td><a href='/post/read?postId=${postVO.postId}'>${postVO.postTitle}</a></td>
					<td>${postVO.userId}</td>
					<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${postVO.postDate}"/></td>
					<td><span class="badge bg-red">${postVO.hitNum }</span></td>
				</tr>
				
				</c:forEach>
			</table>	
		</div>
	
	</div>
</div>


<%@ include file="../include/footer.jsp"%>

<script>
	var result = '${msg}';
	if(result == 'SUCCESS'){
		alert("처리 완료");
	}
</script>