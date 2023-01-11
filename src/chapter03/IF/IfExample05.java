package chapter03.IF;

import javax.swing.JOptionPane;

public class IfExample05 {

	public static void main(String[] args) {
		/*
		 * 전시관의 입장료 미취학 아동: 1000원 초등학생: 2000원 중·고등학생: 3500원 성인: 5000원
		 */

		int age;
		int charge;
		// swing(나이를 입력하세요) 사용

		age = Integer.parseInt(JOptionPane.showInputDialog("나이를 입력하세요."));

		if (0 <= age && age < 8) {
			charge = 1000;
			System.out.println("미취학 아동입니다.");
		}else if (age < 14) {
			charge = 2000;
			System.out.println("초등학생입니다.");
		}else if (age < 20) {
			charge = 3500;
			System.out.println("중·고등학생입니다.");
		}else {
			charge = 5000;
			System.out.println("성인입니다.");
		}

		System.out.println("입장료는 " + charge + "원 입니다.");
	}//main

}//class
