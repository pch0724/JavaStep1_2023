package chapter03.IF.Example;

import java.util.Scanner;

public class ExampleWhile01 {

	public static void main(String[] args) {
		//
		boolean run = true;
		
		int balance = 0;
		int total = 0;
		int a = 0, b = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------------");
			System.out.print("선택> ");
			balance = scan.nextInt();
			/*
			if(balance == 4) {
				run = false;
			}else if(balance == 1) {
				System.out.print("예금액> ");
				a = scan.nextInt();
				total+=a;
			}else if(balance == 2) {
				System.out.print("출금액> ");
				b = scan.nextInt();
				total-=b;
			}else if(balance == 3) {
				System.out.print("잔고> " + total);
			}else {
				System.out.println("잘못입력하셨습니다.");
			}//if
			*/
			switch (balance) {
			case 1: // 0 이하 금액 입력되었을 때 예외처리
				System.out.print("예금액> ");
				a=scan.nextInt();
				if(a < 0) {
					System.out.println("예금액은 0원 이상이어야합니다.");
				}else {
					total+=a;					
				}
				break;
			case 2: // 잔액이 부족할 때 예외처리
				System.out.print("출금액> ");
				b=scan.nextInt();
				if(b > total) {
					System.out.println("출금액이 부족합니다.");
				}else {
					total-=b;					
				}
				break;
			case 3:
				System.out.println("잔고> " + total);
				break;
			case 4:
				run = false;
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
			}//switch
			
			System.out.println();
		}//while	
		System.out.println("프로그램 종료");
	}//main

}//class
