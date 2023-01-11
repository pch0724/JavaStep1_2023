package chapter03.IF.While;

import java.util.Scanner;

public class WhileTest08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		String menu = "";
		// '\n' => 엔터역할
		while(true) {
			System.out.println("1.입력하기\n2.출력하기\n3.삭제하기\n4.끝내기\n작업할 번호를 선택하세요.");
			num = scan.nextInt();
			System.out.println();
			
			switch (num) {
			case 1:
				System.out.println("입력하기를 누르셨습니다.");
				break; // switch문 종료
			case 2:
				System.out.println("출력하기를 누르셨습니다.");			
				break;
			case 3:
				System.out.println("삭제하기를 누르셨습니다.");				
				break;
			case 4:
				System.out.println("끝내기를 누르셨습니다.");				
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}//switch
			
			if(num == 4) {
				break; // while문 종료
			}//if
			System.out.println("");
		}//while
		
		System.out.println("프로그램 종료");
		
	}//main

}//class
