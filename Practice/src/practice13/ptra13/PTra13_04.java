/*
 * PTra13_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

public class PTra13_04 {

	/*
	 * ★ PTra13_02, PTra13_03で作成した、Hero/Slimeクラスを使用します
	 */

	public static void main(String[] args) {

		// ★ HeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者", "スライム"を設定してください
		practice13.common.Hero hero = new practice13.common.Hero();
		hero.setName("勇者");
		practice13.common.Slime slime = new practice13.common.Slime();
		slime.setName("スライム");

		/*
		 * ★ HeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●Heroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */

		while(true) {
			boolean winFlag = slime.damage(hero.attack());

			if(winFlag = false) {
				System.out.println(hero.getName()+"は"+slime.getName()+"との戦いに勝利した");
				break;
			}
			hero.damage(slime.attack());
			boolean loseFlag = hero.damage(slime.attack());

			if(loseFlag = false) {
				System.out.println(slime.getName()+"は"+hero.getName()+"との戦いに勝利した");
				break;
			}

		}


		// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」

	}
}
