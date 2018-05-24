package com.cn.hnust.pojo;

public class User {
    private String id;

    private String userName;

    private String password;

    private Integer age;
    
    private int period;
    
    private String classT;
    
    private String power;
  

    public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getClassT() {
		return classT;
	}

	public void setClassT(String classT) {
		this.classT = classT;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password="
				+ password + ", age=" + age + ", period=" + period
				+ ", classT=" + classT + ", power=" + power + "]";
	}
}