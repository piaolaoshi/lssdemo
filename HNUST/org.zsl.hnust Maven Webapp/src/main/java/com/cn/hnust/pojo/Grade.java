package com.cn.hnust.pojo;

public class Grade {
    private String id;

    private String courseOne;

    private String courseTwo;

    private String courseThree;
    
    private String courseFour;

    private String rankingList;
    
    private String totalScore;
    
    private String name;
    
    private String period;

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(String totalScore) {
		this.totalScore = totalScore;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCourseOne() {
		return courseOne;
	}

	public void setCourseOne(String courseOne) {
		this.courseOne = courseOne;
	}

	public String getCourseTwo() {
		return courseTwo;
	}

	public void setCourseTwo(String courseTwo) {
		this.courseTwo = courseTwo;
	}

	public String getCourseThree() {
		return courseThree;
	}

	public void setCourseThree(String courseThree) {
		this.courseThree = courseThree;
	}

	public String getRankingList() {
		return rankingList;
	}

	public void setRankingList(String rankingList) {
		this.rankingList = rankingList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourseFour() {
		return courseFour;
	}

	public void setCourseFour(String courseFour) {
		this.courseFour = courseFour;
	}

	@Override
	public String toString() {
		return "Grade [id=" + id + ", courseOne=" + courseOne + ", courseTwo="
				+ courseTwo + ", courseThree=" + courseThree + ", courseFour="
				+ courseFour + ", rankingList=" + rankingList + ", totalScore="
				+ totalScore + ", name=" + name + ", period=" + period + "]";
	}

	/*@Override
	public String toString() {
		return "Grade [id=" + id + ", name="+ name +",courseOne=" + courseOne + ", courseTwo="
				+ courseTwo + ", courseThree=" + courseThree + "]";
	}*/

	

   
    
}