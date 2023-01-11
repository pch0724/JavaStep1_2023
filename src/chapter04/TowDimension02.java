package chapter04;

import javax.swing.JOptionPane;

public class TowDimension02 {

	public static void main(String[] args) {

		int JavaScore[][] = new int[2][3];

		int n = 0;

		for (int i = 0; i < JavaScore.length; i++) {

			for (int j = 0; j < JavaScore[i].length; j++) {
				n++;
				JavaScore[i][j] = Integer.parseInt(JOptionPane.showInputDialog("점수를 입력하세요"));

				System.out.println("점수는 " + (JavaScore[i][j]) + "점 입니다.");

			}

		}
		/*
		int JavaScore[][] = new int[2][3];

		for (int i = 0; i < JavaScore.length; i++) {

			for (int j = 0; j < JavaScore[i].length; j++) {
				int jumsu = Integer.parseInt(JOptionPane.showInputDialog("점수"));
				JavaScore[i][j] = jumsu;
				System.out.println("JavaScore[" + i + "][" + j + "] :" + JavaScore[i][j]);
			}
			System.out.println();

		}
		*/

	}
}
