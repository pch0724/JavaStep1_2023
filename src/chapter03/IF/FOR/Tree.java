package chapter03.IF.FOR;

import java.util.Scanner;

public class Tree {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i, j, k;
		//i = 전체회전 | j = " "
		System.out.print("입력:");
		int l = scan.nextInt();
		
		for(i=0; i<l; i++) {
			// 전체 회전
			for(j=0; j<l-1-i; j++)
				System.out.print(" ");
			// 공백
			for(k=0; k<(2*i)+1; k++)
				System.out.print("★");
			// 별
			System.out.println();
		
		}
	}

}
