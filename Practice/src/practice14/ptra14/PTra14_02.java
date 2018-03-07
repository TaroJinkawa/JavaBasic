/*
 * PTra14_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice14.ptra14;

public class PTra14_02 {

	public static void main(String[] args) {
		practice14.common.BDCourse bdcourse = new practice14.common.BDCourse();
		System.out.println(bdcourse.getCourseName());

		for(int i=0;i<bdcourse.getCourseUnit().length;i++) {
			System.out.println(bdcourse.getCourseUnit()[i]);
		}
	}
	/*
	 * ★ common.Courseを実装した、DBCourseクラスを作成してください
	 *
	 * コース名称
	 * 		「【Eラーニング】DB基礎」
	 * 単元
	 * 		DB基礎
	 * 		SQL基礎
	 * 		正規化
	 * 		SQL応用
	 */

}
