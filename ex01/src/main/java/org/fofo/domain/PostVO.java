package org.fofo.domain;
/*하나의 개시글 객체*/
import java.util.Date;

public class PostVO {
	private Integer postID;
	private Integer boardID;
	private Integer uID;
	private Integer hitNum;
	private Integer recommendNum;
	private Integer commentNum;
	private Integer bookmarkNum;
	private Date postDate;
	private String postTitle;
	private String postContent;
	private String tags;
	
	
	//Getter
	public Integer getPostID(){ return postID; }
	public Integer getBoardID(){ return boardID; }
	public Integer getUID(){ 	return uID; }
	
	public Integer getHitNum(){ 		return hitNum; }
	public Integer getRecommendNum(){	return recommendNum; }
	public Integer getCommentNum(){ 	return commentNum; }
	public Integer getBookmarkNum(){ 	return bookmarkNum; }
	
	public Date getPostDate(){		return postDate; }
	public String getPostTitle(){ 	return postTitle; }
	public String getPostContent(){ return postContent; }
	
	public String getTags(){ return tags; }
	
	
	
	//Setter
	public void setPostID(Integer postID){	this.postID = postID; }
	public void setBoardID(Integer boardID){ this.boardID = boardID; }
	public void setUID(Integer uID){ 		this.uID = uID; }
	
	public void setHitNum(Integer hitNum){				this.hitNum = hitNum; }
	public void setRecommendNum(Integer recommendNum){	this.recommendNum = recommendNum; }
	public void setCommentNum(Integer commentNum){		this.commentNum = commentNum; }
	public void setBookmarkNum(Integer bookmarkNum){ 	this.bookmarkNum = bookmarkNum; }
	
	public void setPostDate(Date postDate){ 		this.postDate = postDate; }
	public void setPostTitle(String postTitle){ 	this.postTitle = postTitle; }
	public void setPostContent(String postContent){ this.postContent = postContent; }
	
	public void setTags(String tags){ this.tags = tags; }
}
