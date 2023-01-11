package chapter05;

import java.util.Scanner;

public class FunTest07 {

	public FunTest07() {//생략가능
		// TODO Auto-generated constructor stub
	}
	/*
	public static String Edustep(int ed) {
		
		String step;
		
		if(ed==1) {
			step = "1단계";
		}else if(ed==2) {
			step = "2단계";
		}else if(ed==3) {
			step = "3단계";
		}else {
			step = "해당 단계가 없습니다";
		}

		return step;
	}// 메서드
	*/
	
	public static void Edustep(int ed) {
		
		String step;
		
		if(ed==1) {
			step = "1단계";
		}else if(ed==2) {
			step = "2단계";
		}else if(ed==3) {
			step = "3단계";
		}else {
			step = "해당 단계가 없습니다";
		}
		System.out.println("현재 수업 단계 : " + step + "입니다.");
	}// 메서드
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("스터디 단계 : ");
		int num = sc.nextInt();
		
		//return 값이 있는 경우
		//String step = Edustep(num);
		//System.out.println("현재 수업 단계 : " + step + "입니다.");
		
		//return 값이 없는경우
		Edustep(num);
	}//m

}//c
