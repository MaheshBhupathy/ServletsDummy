package com.mahesh.dao;

public class SQLConstants {

//		Name                                      Null?    Type
// ----------------------------------------- -------- --------------
// USER_ID                                            NUMBER(4)
// USERNAME                                           VARCHAR2(20)
// PASSWORD                                           VARCHAR2(20)
// USER_ROLE                                          VARCHAR2(20)

	public static final String SQL_STUDENT_APP_USERS_AUTH = "SELECT USER_ID,USER_ROLE,USERNAME,PASSWORD FROM STUDENT_APP_USERS WHERE USERNAME=? AND PASSWORD=?";

	
	
//	
//	SQL> desc student_app_students;
//	 Name                                      Null?    Type
//	 ----------------------------------------- -------- ---------------
//	 STUDENT_ID                                         NUMBER(4)
//	 STUDENT_NAME                                       VARCHAR2(20)
//	 STUDENT_MOBILE                                     NUMBER(10)
//	 STUDENT_CITY                                       VARCHAR2(20)
	
	public static final String SQL_STUDENT_APP_GET_ALL_STUDENTS = "SELECT STUDENT_ID,STUDENT_NAME,STUDENT_MOBILE,STUDENT_CITY FROM STUDENT_APP_STUDENTS";
	
}
