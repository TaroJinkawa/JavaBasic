/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */

		ArrayList<Player> array = new ArrayList<Player>();
		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
			while (scanner.hasNext()) {
				Player player = new Player();
				String line = scanner.nextLine();
				String[] list = line.split(",", 4);

				player.setPosition(list[0]);
				player.setName(list[1]);
				player.setCountry(list[2]);
				player.setTeam(list[3]);

				array.add(player);


			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		}

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
		Collections.shuffle(array);

		int gkCount = 0;
		int dfCount = 0;
		int mfCount = 0;
		int fwCount = 0;

		for (Player playerd : array) {
			
			
			if(playerd.getPosition().equals("GK") ){
				if (gkCount < 1) {
					System.out.println(playerd.toString());
					gkCount++;
				}

			}else if(playerd.getPosition().equals("DF") ){
				if (dfCount < 4) {
					System.out.println(playerd.toString());
					dfCount++;
				}

			}else if(playerd.getPosition().equals("MF") ){
				if (mfCount < 4) {
					System.out.println(playerd.toString());
					mfCount++;
				}

			}else if(playerd.getPosition().equals("FW") ){
				if (fwCount < 2) {
					System.out.println(playerd.toString());
					fwCount++;
				}

			}


		}
	}

}
