package com.cn.hnust.pojo;

public class File_util {
    private int id;

    private String filename;

    private String course;

    private int score;

 

 

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course == null ? null : course.trim();
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

	@Override
	public String toString() {
		return "File_util [id=" + id + ", filename=" + filename + "]";
	}
}