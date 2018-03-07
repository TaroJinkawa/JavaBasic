/*
 * PTra14_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice14.ptra14;

public class PTra14_01 {
	public static void main(String[] args) {
	practice14.common.JavaCourse javacourse = new practice14.common.JavaCourse();

	System.out.println(javacourse.getCourseName());

	for(int i=0;i<javacourse.getCourseUnit().length;i++)
	System.out.println(javacourse.getCourseUnit()[i]);
	}
	/*
	 * ★ common.Courseを実装した、JavaCourseクラスを作成してください
	 *
	 * コース名称
	 * 		「【Eラーニング】Java」
	 * 単元
	 * 		式と演算
	 * 		制御構文
	 * 		メソッド
	 * 		配列
	 * 		オブジェクト指向
	 * 		継承
	 * 		高度な継承
	 */

}
