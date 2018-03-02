package practice12;

/*
 * PTra12_01.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
import practice12.common.Student;

public class PTra12_01 {
	public static void main(String[] args) {

		/*
		 * common.Studentにアクセサを追加し、
		 * ★ フィールドのアクセス修飾子を外部クラスからのアクセスを禁止させるようにしてください
		 *
		 * ★ 下記、インスタンスフィールドへのアクセスをアクセサ経由に変更してください
		 */
		Student student = new Student();
		student.setStudentId(10001);
		student.setStudentName("リゾーム太郎");
		student.setcompanyName("株式会社リゾーム");
		student.setclassName("Z教室");
		student.setmail("rhizome@hogehoge.com");
		student.setpassword("1qazxcvb");

		System.out.println("受講生ID　：" + student.getStudentId());
		System.out.println("受講生名　：" + student.getStudentName());
		System.out.println("会社名　　：" + student.getcompanyName());
		System.out.println("教室名　　：" + student.getclassName());
		System.out.println("メール　　：" + student.getmail());
		System.out.println("パスワード：" + student.getpassword());
	}
}
