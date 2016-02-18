package org.fofo.domain;

import java.util.Date;

public class UserVO {
	
	private Integer userId;
	private String uEmail;
	private String uPW;
	
	private String uNickname;
	private String uName;
	private Date uBirth;
	
	private Date uJoinDate;
	private String uSort;
	private String uProfileImg;
	
	private Integer uSchoolNum;
	private String uSchoolIds;
	private Integer uCareerPeriodYear;
	private Integer uCareerPeriodMonth;
	private String uCareerIds;
	
	private Integer uAwardNum;
	private String  uAwardIds;
	private Integer uSkillNum;
	private String uSkillIds;
	
	private Integer uProjectNum;
	private String uProjectIds;
	
	private Integer uLanguageNum;
	private String uLanguageIds;
	
	private boolean uPostPublic;
	
	private Integer uPostNum;
	private Integer uCommentNum;
	
	//Getter
	public Integer getUserId(){	return userId;	}
	public String getUEmail(){	return uEmail;	}
	public String getUPW(){		return uPW;}
	
	public String getUNickname(){	return uNickname;	}
	public String getUName(){		return uName;	}
	public Date getUBirth(){		return uBirth;	}
	
	public Date getUJoinDate(){		return uJoinDate;	}
	public String getUSort(){		return uSort;	}
	public String getUProfileImg(){	return uProfileImg;	}
	
	public Integer getUSchoolNum(){	return uSchoolNum;	}
	public String getUSchoolIds(){	return uSchoolIds;	}
	public Integer getUCareerPeriodYear(){	return uCareerPeriodYear;	}
	public Integer getUCareerPeriodMonth(){	return uCareerPeriodMonth;	}
	public String getUCareerIds(){	return uCareerIds;	}
	
	public Integer getUAwardNum(){	return uAwardNum;	}
	public String  getUAwardIds(){	return uAwardIds;	}
	public Integer getUSkillNum(){	return uSkillNum;	}
	public String getUSkillIds(){	return uSkillIds;	}
	
	public Integer getUProjectNum(){return uProjectNum;	}
	public String getUProjectIds(){	return uProjectIds;	}
	
	public Integer getULanguageNum(){	return uLanguageNum;	}
	public String getULanguageIds(){	return uLanguageIds;	}
	
	public boolean getUPostPublic(){	return uPostPublic;	}
	public Integer getUPostNum(){		return uPostNum;	}
	public Integer getUCommentNum(){	return uCommentNum;	}
	
	//Setter
	public void setUserId(Integer userId){		this.userId = userId;	}
	public void setUEmail(String uEmail){	this.uEmail = uEmail;	}
	public void setUPW(String uPW){			this.uPW = uPW;	}
	
	public void setUNickname(String uNickname){	this.uNickname = uNickname;	}
	public void setUName(String uName){			this.uName = uName;	}
	public void setUBirth(Date uBirth){			this.uBirth = uBirth;	}
	
	public void setUJoinDate(Date uJoinDate){		this.uJoinDate = uJoinDate;	}
	public void setUSort(String uSort){				this.uSort = uSort;	}
	public void setUProfileImg(String uProfileImg){	this.uProfileImg = uProfileImg;	}
	
	public void setUSchoolNum(Integer uSchoolNum){	this.uSchoolNum = uSchoolNum;	}
	public void setUSchoolIds(String uSchoolIds){	this.uSchoolIds = uSchoolIds;	}
	public void setUCareerPeriodYear(Integer uCareerPeriodYear){	this.uCareerPeriodYear = uCareerPeriodYear;	}
	public void setUCareerPeriodMonth(Integer uCareerPeriodMonth){	this.uCareerPeriodMonth = uCareerPeriodMonth;	}
	public void setUCareerIds(String uCareerIds){	this.uCareerIds = uCareerIds;	}
	
	public void setUAwardNum(Integer uAwardNum){	this.uAwardNum = uAwardNum;	}
	public void setUAwardIds(String uAwardIds){		this.uAwardIds = uAwardIds;	}
	public void setUSkillNum(Integer uSkillNum){	this.uSkillNum = uSkillNum;	}
	public void setUSkillIds(String uSkillIds){		this.uSkillIds = uSkillIds;	}
	
	public void setUProjectNum(Integer uProjectNum){	this.uProjectNum = uProjectNum;	}
	public void setUProjectIds(String uProjectIds){		this.uProjectIds = uProjectIds;	}
	
	public void setULanguageNum(Integer uLanguageNum){	this.uLanguageNum = uLanguageNum;	}
	public void setULanguageIds(String uLanguageIds){	this.uLanguageIds = uLanguageIds;	}
	
	public void setUPostPublic(boolean uPostPublic){	this.uPostPublic = uPostPublic;	}
	public void setUPostNum(Integer uPostNum){			this.uPostNum = uPostNum;	}
	public void setUCommentNum(Integer uCommentNum){	this.uCommentNum = uCommentNum;	}
	
}