package chapter05;

import java.util.Scanner;

public class Method02 {

	int cnt, num;
	boolean run = true;
	String str = "";
	Method br = new Method();
	
	Scanner sc = new Scanner(System.in);
	
	void oreder2() {
		
		while(run) {
			System.out.println("----------------------------------------");
			System.out.println("1. 빵 갯수 선택 | 2. 빵의 갯수와 종류 | 3. 종료 ");
			System.out.println("----------------------------------------");
			System.out.print("선택 > ");
			
			num = sc.nextInt();
			
			switch (num) {
			case 1:
				br.makeBread(cnt);
				break;
			case 2:
				br.makeBread(cnt, str);
				break;
			case 3:
				run = false;
				break;				
			default:
				System.out.println("잘못된 번호입니다.");
			}//switch
		}//while
		System.out.println("프로그램 종료");
		
	}//order
	
	
}//class
