package chapter05;

import javax.swing.JOptionPane;

public class FunTest01 {
	
	//합계 메서드(함수)
	//접근한정자 : public(공용(제한없음)사용) / protected(공용(생성된 패키지 내에서만/ 상속을 받으면 다른 패키지에서도)사용) / private(클래스 내에서만 사용가능)
	public static void sum(int num1, int num2) { // void -> 결과값을 돌려주지 않음(return; 이 없음) => 결과값을 받으려면 함수 내에서 출력하거나 해야함
		//int num1 = 3;
		//int num2 = 5;
		int total = num1 + num2;
		System.out.println(total);
	}
	
	// main => 실행 담당 메서드
	public static void main(String[] args) { // 다른 것들의 실행을 담당하는 메서드 // 메서드 : 하나의 작업을 담당( ex) 사칙연산 등)
		 int a, b;
		 a = Integer.parseInt(JOptionPane.showInputDialog("값1"));
		 b = Integer.parseInt(JOptionPane.showInputDialog("값2"));
		 
		 sum(a,b);//메서드 호출 : 매개변수의 타입과 개수 맞춰야함 
		
		
	}//m
	/*
	// main을 기준으로 하여 메인선언 전 또는 후에 함수를 정의해도 됨 
	public static void sum(int num1, int num2) { // void -> 결과값을 돌려주지 않음(return; 이 없음) => 결과값을 받으려면 함수 내에서 출력하거나 해야함
		//int num1 = 3;
		//int num2 = 5;
		int total = num1 + num2;
		System.out.println(total);
	}
	*/	
}//c
