package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car[] car = new Car[3];

		Car car1 = new Car();
		car1.serialNo = 100;
		car1.color = "Red";
		car1.gasoline = 50;

		Car car2 = new Car();
		car2.serialNo = 101;
		car2.color = "Blue";
		car2.gasoline = 52;

		Car car3 = new Car();
		car3.serialNo = 102;
		car3.color = "Green";
		car3.gasoline = 55;

		car[0] = car1;
		car[1] = car2;
		car[2] = car3;

		final int distance = 400;
		for (int i = 0; i < car.length; i++) {
			int d = distance;
			final int g = car[i].gasoline;

			while (true) {

				int run = car[i].run();

				d -= run;
				if (run == -1) {
					System.out.println(car[i].serialNo + "(" + car[i].color + ")" + "は目的地に到達できませんでした");
					break;

				} else if (0 >= d) {
					int x = car[i].gasoline;
					int n = g - x;

					System.out.println(car[i].serialNo + "(" + car[i].color + ")" + "は目的地まで" + n + "時間かかりました。残りのガソリンは、"
							+ x + "リットルです");
					break;

				}
			}
		}

	}
}
