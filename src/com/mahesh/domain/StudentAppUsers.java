package com.mahesh.domain;

public class StudentAppUsers {
	
//	 			Name                                      Null?    Type
//			 ----------------------------------------- -------- --------------
//			 USER_ID                                            NUMBER(4)
//			 USERNAME                                           VARCHAR2(20)
//			 PASSWORD                                           VARCHAR2(20)
//			 USER_ROLE                                          VARCHAR2(20)
	
	@Override
	public String toString() {
		return "StudentAppUsers [userId=" + userId + ", username=" + username + ", password=" + password + ", userRole="
				+ userRole + "]";
	}
	private Integer userId;
	private String username;
	private String password;
	private String userRole;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

}
