package org.fofo.domain;

import java.util.Date;

public class QABoardVO {
	
	private Integer uID;
	private String uEmail;
	private String uPW;
	
	private String uNickname;
	private String uName;
	private Date uBirth;
	
	private Date uJoinDate;
	private String uSort;
	private String uProfileImg;
	
	private Integer uSchoolNum;
	private String uSchoolIDs;
	private Integer uCareerPeriodYear;
	private Integer uCareerPeriodMonth;
	private String uCareerIDs;
	
	private Integer uAwardNum;
	private String  uAwardIDs;
	private Integer uSkillNum;
	private String uSkillIDs;
	
	private Integer uProjectNum;
	private String uProjectIDs;
	
	private Integer uLanguageNum;
	private String uLanguageIDs;
	
	private boolean uPostPublic;
	
	private Integer uPostNum;
	private Integer uCommentNum;
	
	//Getter
	public Integer getUID(){	return uID;	}
	public String getUEmail(){	return uEmail;	}
	public String getUPW(){		return uPW;}
	
	public String getUNickname(){	return uNickname;	}
	public String getUName(){		return uName;	}
	public Date getUBirth(){		return uBirth;	}
	
	public Date getUJoinDate(){		return uJoinDate;	}
	public String getUSort(){		return uSort;	}
	public String getUProfileImg(){	return uProfileImg;	}
	
	public Integer getUSchoolNum(){	return uSchoolNum;	}
	public String getUSchoolIDs(){	return uSchoolIDs;	}
	public Integer getUCareerPeriodYear(){	return uCareerPeriodYear;	}
	public Integer getUCareerPeriodMonth(){	return uCareerPeriodMonth;	}
	public String getUCareerIDs(){	return uCareerIDs;	}
	
	public Integer getUAwardNum(){	return uAwardNum;	}
	public String  getUAwardIDs(){	return uAwardIDs;	}
	public Integer getUSkillNum(){	return uSkillNum;	}
	public String getUSkillIDs(){	return uSkillIDs;	}
	
	public Integer getUProjectNum(){return uProjectNum;	}
	public String getUProjectIDs(){	return uProjectIDs;	}
	
	public Integer getULanguageNum(){	return uLanguageNum;	}
	public String getULanguageIDs(){	return uLanguageIDs;	}
	
	public boolean getUPostPublic(){	return uPostPublic;	}
	public Integer getUPostNum(){		return uPostNum;	}
	public Integer getUCommentNum(){	return uCommentNum;	}
	
	//Setter
	public void setUID(Integer uID){		this.uID = uID;	}
	public void setUEmail(String uEmail){	this.uEmail = uEmail;	}
	public void setUPW(String uPW){			this.uPW = uPW;	}
	
	public void setUNickname(String uNickname){	this.uNickname = uNickname;	}
	public void setUName(String uName){			this.uName = uName;	}
	public void setUBirth(Date uBirth){			this.uBirth = uBirth;	}
	
	public void setUJoinDate(Date uJoinDate){		this.uJoinDate = uJoinDate;	}
	public void setUSort(String uSort){				this.uSort = uSort;	}
	public void setUProfileImg(String uProfileImg){	this.uProfileImg = uProfileImg;	}
	
	public void setUSchoolNum(Integer uSchoolNum){	this.uSchoolNum = uSchoolNum;	}
	public void setUSchoolIDs(String uSchoolIDs){	this.uSchoolIDs = uSchoolIDs;	}
	public void setUCareerPeriodYear(Integer uCareerPeriodYear){	this.uCareerPeriodYear = uCareerPeriodYear;	}
	public void setUCareerPeriodMonth(Integer uCareerPeriodMonth){	this.uCareerPeriodMonth = uCareerPeriodMonth;	}
	public void setUCareerIDs(String uCareerIDs){	this.uCareerIDs = uCareerIDs;	}
	
	public void setUAwardNum(Integer uAwardNum){	this.uAwardNum = uAwardNum;	}
	public void setUAwardIDs(String uAwardIDs){		this.uAwardIDs = uAwardIDs;	}
	public void setUSkillNum(Integer uSkillNum){	this.uSkillNum = uSkillNum;	}
	public void setUSkillIDs(String uSkillIDs){		this.uSkillIDs = uSkillIDs;	}
	
	public void setUProjectNum(Integer uProjectNum){	this.uProjectNum = uProjectNum;	}
	public void setUProjectIDs(String uProjectIDs){		this.uProjectIDs = uProjectIDs;	}
	
	public void setULanguageNum(Integer uLanguageNum){	this.uLanguageNum = uLanguageNum;	}
	public void setULanguageIDs(String uLanguageIDs){	this.uLanguageIDs = uLanguageIDs;	}
	
	public void setUPostPublic(boolean uPostPublic){	this.uPostPublic = uPostPublic;	}
	public void setUPostNum(Integer uPostNum){			this.uPostNum = uPostNum;	}
	public void setUCommentNum(Integer uCommentNum){	this.uCommentNum = uCommentNum;	}
	
}
