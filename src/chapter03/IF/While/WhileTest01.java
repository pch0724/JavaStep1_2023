package chapter03.IF.While;

public class WhileTest01 {

	public static void main(String[] args) {
		// 
		while(true) {
			
			int num = (int)(Math.random()*6)+1;
			System.out.println("주사위의 눈 : " + num);
			
			if(num == 6) {
				break;
			}//if
		}//while(조건) : 조건만 맞으면 계속 반복
		
		System.out.println("프로그램 종료");
	}//main

}//class
