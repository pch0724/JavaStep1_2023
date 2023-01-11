package chapter05;

import javax.swing.JOptionPane;

public class FunTest02 {
	
	/*
	public FunTest02() {
		// TODO Auto-generated constructor stub
	}
	*/
	
	//합계 메서드(함수)
	//접근한정자 : public(공용(제한없음)사용) / protected(공용(생성된 패키지 내에서만/ 상속을 받으면 다른 패키지에서도)사용) / private(클래스 내에서만 사용가능)
	public void sum(int num1, int num2) { // void -> 결과값을 돌려주지 않음(return; 이 없음) => 결과값을 받으려면 함수 내에서 출력하거나 해야함
		//int num1 = 3;
		//int num2 = 5;
		int total = num1 + num2;
		System.out.println(num1 +  "+" + num2 + " = " + total);
	}
	
	// main => 실행 담당 메서드
	// 메모리 : 크게 3개로 분류 (Data | Heap | Stack) // Data : 전역변수(Global) | Stack : 지역변수(Local) = 특정 구역 종료 이후 휘발 | Heap : new 키워드 사용 객체, 배열(ex Scanner 불러온 후 객체. 이하 의 기능들) 
	// static: Data 영역에 할당되어 모든 객체가 메모리에 할당
	public static void main(String[] args) { // 다른 것들의 실행을 담당하는 메서드 // 메서드 : 하나의 작업을 담당( ex) 사칙연산 등)
		 int a, b;
		 a = Integer.parseInt(JOptionPane.showInputDialog("값1"));
		 b = Integer.parseInt(JOptionPane.showInputDialog("값2"));
		 
		 // static 에서 호출되지 않았으므로 Error 발생
		 //sum(a,b);//메서드 호출 : 매개변수의 타입과 개수 맞춰야함 
		 FunTest02 obj = new FunTest02(); // => 7라인의 생성자가 생기는 기능을 수행
		 obj.sum(a, b); // Stack 메모리에 있는 메서드를 호출
		
	}//m

}//c
