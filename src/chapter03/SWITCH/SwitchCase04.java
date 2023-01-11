package chapter03.SWITCH;

import java.util.Scanner;

public class SwitchCase04 {

	public static void main(String[] args) {
		// Scanner 믈래스의 인스턴스변수 scan에 값을 입력받음
		//대문자A이거나 소문자a 이면 우수고객 / B,b -> 일반회원 / 나머지 -> 고객
		//charAt(0) : String -> char
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.print("등급을 입력하세요(A(a),B(b),C(c)) :");
		char grade;
		
		grade=scan.nextLine().charAt(0);//string으로 받아서 char로 변환(매우중요 파이썬에서도 사용)
		
		
		//switch로 판단
		
		switch (grade) {
		case 65 : case 97:
			System.out.println("우수고객입니다");
			break;
		case 66 : case 98 :
			System.out.println("일반회원입니다");
			break;
		default :
			System.out.println("고객입니다");
			

		}//switch
		
		}//main
		
	}//class


