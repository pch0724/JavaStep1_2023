package chapter04;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ArrayTest02 {

	public static void main(String[] args) {

		String student[] = new String[7];
		String phone[] = new String[7];		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < student.length; i++) {
			/*
			student[i] = scan.nextLine();
			phone[i] = scan.nextLine();
			*/
			student[i] = JOptionPane.showInputDialog("이름");
			phone[i] = JOptionPane.showInputDialog("전화번호");
			
			System.out.print("이름 :" + student[i] + " ");
			System.out.println("전화번호 : " + phone[i]);
		}//for
	}//main

}//class
