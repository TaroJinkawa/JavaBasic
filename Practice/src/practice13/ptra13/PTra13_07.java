/*
 * PTra13_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

public class PTra13_07 {

	/*
	 * ★ common.Item, common.SuperHero, common.Slimeを使用します
	 */

	public static void main(String[] args) {

		// ★ SuperHeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者（装備あり）", "スライム"を設定してください
		practice13.common.SuperHero superhero = new practice13.common.SuperHero();
		superhero.setName("勇者(装備あり)");

		practice13.common.Slime slime = new practice13.common.Slime();
		slime.setName("スライム");

		// ★ Itemクラスのインスタンスを作成し、("こんぼう", 4）をコンストラクタの引数にしてください
		practice13.common.Item item = new practice13.common.Item("こんぼう", 4);

		// ★ 作成したItemインスタンスをSuperHeroに持たせてください
		superhero.setEquipment(item);


		/*
		 * ★ SuperHeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●SuperHeroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */
		while(true) {
			System.out.println(superhero.getName()+"のターン");
			System.out.println(superhero.getName()+"の攻撃");

			boolean win = slime.damage(superhero.attack());
			if(win == true) {
				System.out.println(slime.getName()+"のHPは0になった");
				System.out.println(superhero.getName()+"は"+slime.getName()+"との戦闘に勝利した");
				break;
			}

			System.out.println(slime.getName()+"のHPはまだ残っている");
			System.out.println("");



			System.out.println(slime.getName()+"のターン");
			System.out.println(slime.getName()+"の攻撃！");

			boolean lose = superhero.damage(slime.attack());

			if(lose == true) {
				System.out.println(superhero.getName()+"のHPは0になった");
				System.out.println(slime.getName()+"は"+superhero.getName()+"との戦闘に勝利した");
				break;
			}

			System.out.println(superhero.getName()+"のHPはまだ残っている");
			System.out.println("");


		}



		// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」

	}
}
