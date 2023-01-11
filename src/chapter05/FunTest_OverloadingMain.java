package chapter05;

public class FunTest_OverloadingMain {

	public static void main(String[] args) {
		
		FunTest_Overloading obj = new FunTest_Overloading(); // obj : 객체
		//구조체 : 기본적인 틀 | 객체 : 옵션 | 구조체 + 객체 : 객체지향프로그래밍
		//객체지향프로그래밍 : 객체에 따라 달라짐
		
		obj.getResult(99);
		obj.getResult('A');
		obj.getResult("JAVA");
		obj.getResult(6, " 스트링" );
		

	}

}
