package chapter03.IF.FOR;

import java.util.Scanner;

public class ForTest17 {

	public static void main(String[] args) {
		/*
		// 정수를 입력받아서 입력된 수 만큼 ★ 출력
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int i = scan.nextInt();
		int j;
		for (int a = 1; a <i; a++) {
			System.out.print("★");			
			for(j=i; j<=a; j++) {
				System.out.println();
			}//in for
			System.out.println();
		}//for
		*/
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int i,j,k;
		int n = scan.nextInt();
		
		/*
		for(i=0; i<n; i++) {
			
			for(j=n-1; j>i; j--)
				System.out.print(" ");
			
			for(k=0; k<=i; k++)
				System.out.print("★");
			System.out.println();
			
		}
		 */
		
		//전체 회전
		for( i=0; i<n; i++)
		{	//공백
			for( j=0; j<=n-1-i; j++)
			{
				System.out.print(" ");
			}
			//별
			for( j=0; j<2*i+1; j++)
			{
				System.out.print("★");
			}
			System.out.println();
		}
	}//main

}//class
