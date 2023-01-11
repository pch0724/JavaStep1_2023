package chapter03.IF.SWITCH;

import java.util.Scanner;

public class SwitchCase04 {

	public static void main(String[] args) {

		//scanner 클래스의 인스턴트 변수 scan에 값을 입력받음
		Scanner scan = new Scanner(System.in);
		//A,a => 우수고객 / B, b => 일반회원 / 나머지 => 고객
		System.out.print("등급을 입력하십시오.(A,B) : ");
		
		char grade;
		//charAt(0) : String -> char
		grade = scan.nextLine().charAt(0); // nextLine : string / char와 호환X / charAt : string -> char
		//charAt() 따로 알아보자
		switch (grade) {
		case 'A': case 'a':
			System.out.println("우수고객");
			break;
		case 'B': case 'b':
			System.out.println("일반회원");
			break;
		default:
			System.out.println("고객");
			break;
		}
	}//main
}//class
