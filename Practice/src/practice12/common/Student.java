/*
 * Student.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice12.common;

/**
 * 受講生の情報を格納します
 * @author Rhizome
 *
 */
public class Student {
	/** 受講生ID */
	private int studentId;

	/** 受講生氏名 */
	private String studentName;

	/** 会社名 */
	private String companyName;

	/** 教室名 */
	private String className;

	/** メールアドレス */
	private String mail;

	/** パスワード */
	private String password;

public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName=studentName;
}
public String getcompanyName() {
	return companyName;
}
public void setcompanyName(String companyName) {
	this.companyName =companyName;
}
public String getclassName() {
	return className;
}
public void setclassName(String className) {
	this.className =className;
}
public String getmail() {
	return mail;
}
public void setmail(String mail) {
	this.mail =mail;
}
public String getpassword() {
	return password;
}
public void setpassword(String password) {
	this.password = password;
}

}
