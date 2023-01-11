package chapter03.IF;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		// gender가 F면 남성입니다 그렇지 않으면 여성입니다.
		Scanner scan = new Scanner(System.in);
		System.out.println("성별을 입력하시오.(M/F)");
		char gender;
		gender = scan.nextLine().charAt(0);
		
		if(gender == 'M') {
			System.out.println("여성입니다.");
		}else {
			System.out.println("남성입니다.");
		}
		
		System.out.println("=======================================");
		System.out.println();
		System.out.print("주문하시겠습니까?(Y/N)");
		
		char ch;
		ch = scan.nextLine().charAt(0);
		
		if((ch == 'Y') || (ch == 'y')) {
			System.out.print("메뉴를 입력해주세요.");
			String menu = scan.nextLine();
			System.out.println(menu + "가 주문 완료되었습니다.");
		}else if((ch =='N')||(ch=='n')) {
			System.out.println("주문이 종료되었습니다.");
		}else {
			System.out.println("Y 또는 N으로 응답해주십시오.");
		}//if
		
	}//main

}//class
