package chapter03.IF;

import java.util.Scanner;

public class IfExample07 {

	public static void main(String[] args) {

		// 입력 Scanner 클래스 초기화 => 인스턴스 변수방 선언
		Scanner scan = new Scanner(System.in); // 외우자
		// num1
		System.out.print("1. 첫 번째 수 : ");
		double num1 = Double.parseDouble(scan.nextLine());
		System.out.println("첫 번째 입력받은 수 출력 : " + num1);
		System.out.println();
		
		// num2
		System.out.print("2. 두 번째 수 : ");
		double num2 = Double.parseDouble(scan.nextLine());
		System.out.println("두 번째 입력받은 수 출력 : " + num2);
		System.out.println();
		
		// 0과 나누면 에러 발생
		if(num2 == 0.0) {
			System.out.println("0으로 나눌 수 없습니다.");
		}else {
			System.out.println("나눈 값 : " + num1 / num2);
		}
	}// main

}// class
