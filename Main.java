package othellogame;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Bord.initialize();
		Bord.showBoard();

		Scanner s = new Scanner(System.in);
		while(Bord.game) {
			System.out.println("駒をおくx座標を入力してください:");
			int x = s.nextInt();

			System.out.println("駒をおくy座標を入力してください:");
			int y = s.nextInt();

			Bord.setStone(x, y);
		}
		s.close();
	}

}
