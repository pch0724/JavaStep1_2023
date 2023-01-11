package chapter03.IF.FOR;

import java.util.Scanner;

public class ForTest13 {

	public static void main(String[] args) {
		// 구구단
		/*
		for(int i=2; i<10; i++) {
			for(int j = 1; j<10; j++) { // i=2 -> j= 1,2,3,4,5,6,7,8,9 ---
				System.out.println(i + " * " + j + " = " + (i*j));
			}//in for
			System.out.println("---------------------------------");
			
		}//for
		*/
		Scanner scan = new Scanner(System.in);
		System.out.print("단을 입력하세요 : ");
		int x = scan.nextInt();
		
		for(int y = 1; y <10; y++ ) {
			System.out.println(x + " * " + y + " = " + (x*y));
		}
	}//main

}//class
