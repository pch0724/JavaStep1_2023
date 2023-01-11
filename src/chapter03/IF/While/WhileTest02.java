package chapter03.IF.While;

public class WhileTest02 {

	public static void main(String[] args) {
		/*
		int i = 1;
		
		while(i<=10) {
			System.out.println(i);
			i++;
		}//while
		System.out.println("프로그램 종료");
		*/
		
		int num =1;
		int sum =0;
		
		while(num<=10) {
			 
			sum+=num;
			num++;		
		}
		System.out.println("현재 num 값 : " + num);
		System.out.println("1 ~ 10까지의 합 : " + sum);
	}//main

}//class
