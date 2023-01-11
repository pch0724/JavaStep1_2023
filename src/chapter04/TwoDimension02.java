package chapter04;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TwoDimension02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int JavaScore[][] = new int [2][3];
		int a, b;
	
		for(a=0; a<JavaScore.length; a++) {
			for(b=0; b<JavaScore[a].length; b++) {
				/*
				System.out.print("정수 입력 : ");
				int i = scan.nextInt();
				*/
				int i = Integer.parseInt(JOptionPane.showInputDialog("점수"));
				JavaScore[a][b] =i; 
				System.out.println("JavaScore[" + a + "]" +"["+ b+ "]" + " :" +JavaScore[a][b]);
			}//in for
			System.out.println();
		}//for
		
	}//main

}//class
