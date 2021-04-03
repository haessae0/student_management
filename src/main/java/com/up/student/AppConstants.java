/**
 * 项目名：student
 * 修改历史：
 * 作者： MZ
 * 创建时间： 2016年1月6日-上午9:41:57
 */
package com.up.student;

/**
 * 模块说明： 常量
 * 
 */
public class AppConstants {
	// jdbc
	public static final String JDBC_URL = "jdbc:sqlite:test.db";
	public static final String JDBC_USERNAME = "test";
	public static final String JDBC_PASSWORD = "test";
	public static final String JDBC_DRIVER = "org.sqlite.JDBC";

	// student field
	public static final String STUDENT_NAME = "학생이름";
	public static final String STUDENT_SNO = "학번";
	public static final String STUDENT_SEX = "성별";
	public static final String STUDENT_DEPARTMETN = "전공";
	public static final String STUDENT_HOMETOWN = "주소";
	public static final String STUDENT_EMAIL = "이메일";
	public static final String STUDENT_TEL = "전화번호";
	public static final String STUDENT_MARK = "학점";

	// login view
	public static final String LOGIN_TITLE = "LOGIN";
	public static final String LOGIN_USERNAME = "USERNAME";
	public static final String LOGIN_PASSWORD = "PASSWORD";
	public static final String LOGIN = "LOGIN";
	public static final String RESET = "RESET";

	// main view
	public static final String MAINVIEW_TITLE = "학생 정보 관리 시스템";
	public static final String MAINVIEW_PAGENUM_JLABEL_DI = "제 ";
	public static final String MAINVIEW_PAGENUM_JLABEL_YE = "/99 쪽";
	public static final String MAINVIEW_FIND_JLABEL = "";
	public static final String MAINVIEW_FIRST = "맨 처음으로";
	public static final String MAINVIEW_LAST = "맨 끝으로";
	public static final String MAINVIEW_PRE = "다음 페이지";
	public static final String MAINVIEW_NEXT = "이전 페이지";
	public static final String PARAM_FIND_CONDITION = "";
	public static final String PARAM_FIND = "학생 찾기";
	public static final String PARAM_ADD = "학생 추가";
	public static final String PARAM_DELETE = "학생 삭제";
	public static final String PARAM_UPDATE = "업데이트";

	// add view
	public static final String ADDVIEW_TITLE = "添加学生信息";
	public static final String ADDVIEW_ADDBUTTON = "添加";
	public static final String EXITBUTTON = "退出";

	// delete view
	public static final String DELETEVIEW_TITLE = "删除学生信息";
	public static final String DELETEVIEW_DELETEBUTTON = "删除";

	// update view
	public static final String UPDATEVIEW_TITLE = "更新学生信息";
	public static final String UPDATEVIEW_UPDATEBUTTON = "更新";

}
