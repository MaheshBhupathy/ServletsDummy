package com.mahesh.domain;

public class StudentsData {

//	SQL> desc student_app_students;
//	 Name                                      Null?    Type
//	 ----------------------------------------- -------- ---------------
//	 STUDENT_ID                                         NUMBER(4)
//	 STUDENT_NAME                                       VARCHAR2(20)
//	 STUDENT_MOBILE                                     NUMBER(10)
//	 STUDENT_CITY                                       VARCHAR2(20)
	
	private Integer studentId;
	private String studentName;
	private Long studentMobile;
	private String studentCity;
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Long getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(long studentMobile) {
		this.studentMobile = studentMobile;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	
}
