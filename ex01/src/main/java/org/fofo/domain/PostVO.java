package org.fofo.domain;

import java.util.Date;

public class PostVO {
	private Integer postId;
	private Integer boardId;
	private Integer userId;
	private Integer hitNum;
	private Integer recommendNum;
	private Integer commentNum;
	private Integer bookmarkNum;
	private Date postDate;
	private String postTitle;
	private String postContent;
	private String tags;
	
	
	//Getter
	public Integer getPostId(){ return postId; }
	public Integer getBoardId(){ return boardId; }
	public Integer getUserId(){ return userId; }
	
	public Integer getHitNum(){ 		return hitNum; }
	public Integer getRecommendNum(){	return recommendNum; }
	public Integer getCommentNum(){ 	return commentNum; }
	public Integer getBookmarkNum(){ 	return bookmarkNum; }
	
	public Date getPostDate(){		return postDate; }
	public String getPostTitle(){ 	return postTitle; }
	public String getPostContent(){ return postContent; }
	
	public String getTags(){ return tags; }
	
	
	
	//Setter
	public void setPostId(Integer postId){	this.postId = postId; }
	public void setBoardId(Integer boardId){ this.boardId = boardId; }
	public void setUserId(Integer userId){ 	this.userId = userId; }
	
	public void setHitNum(Integer hitNum){				this.hitNum = hitNum; }
	public void setRecommendNum(Integer recommendNum){	this.recommendNum = recommendNum; }
	public void setCommentNum(Integer commentNum){		this.commentNum = commentNum; }
	public void setBookmarkNum(Integer bookmarkNum){ 	this.bookmarkNum = bookmarkNum; }
	
	public void setPostDate(Date postDate){ 		this.postDate = postDate; }
	public void setPostTitle(String postTitle){ 	this.postTitle = postTitle; }
	public void setPostContent(String postContent){ this.postContent = postContent; }
	
	public void setTags(String tags){ this.tags = tags; }
}
