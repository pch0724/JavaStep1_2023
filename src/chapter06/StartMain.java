package chapter06;

import java.util.Scanner;

public class StartMain {

	public static void main(String[] args) {

		int select;
		String check;
		
		Scanner sc = new Scanner(System.in);
		Start ud = new Start();
		/*
		while(true) {
			System.out.print("정수 입력 > ");
			select = sc.nextInt();
			check = ud.check(select);
			
			if(check.equals("SUCCESS")) {
				break;
			}
		}//w
		*/	
			
		Start obj = new Start();
		int num;
		
		do {
			System.out.println("숫자 입력 :");
			num = sc.nextInt();
		}while(obj.check(num).equals("FAIL"));
			
	}//m

}//c
