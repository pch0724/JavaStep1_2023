package chapter03.IF.FOR;

import java.util.Scanner;

public class ForTest18 {

	public static void main(String[] args) {

		// 정수 입력받아서 입력된 수 만큼 ★ 출력
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int i, j, k;
		int n = scan.nextInt();
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("★" + " ");
			}
			System.out.println();
		}
	}

}
