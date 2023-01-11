package chapter02;

public class Incre_Test01 {

	public static void main(String[] args) {

		int a, b, c; // 초기화 X 상태 => 리터널 X
		a = 10;
		b = 20;
		c = 3;
		
		System.out.println("++a : " + (++a)); // ++a = a += 1
		System.out.println("a++ : " + (a++)); // 후위연산이므로 12라인 a 값 출력 후 a의 값에 +1  
		System.out.println("후위연산 : " + (a)); // 13라인에서 후위연산된 값인 12 출력
		System.out.println("======================");
		
		System.out.println("c++ : " + (c++)); // 후위연산이므로 기존 c 값인 3 출력 후 +1
		System.out.println("후위연산 : " + (c)); // 16라인에서 후위연산된 값인 4 출력
		System.out.println("======================");
		
		//a 전위연산 + b 후위연산
		//#1
		System.out.println("++a + b++ : " + (++a + b++)); // 13 + 20 = 33
		System.out.println("후위연산 : " + b); // 23라인에서 후위연산된 값인 21 출력
		System.out.println("======================");
		
		//#2
		System.out.println("++a : " + (++a)); // 14
		System.out.println("b++ : " + (b++)); // 21 / 출력 후 b 값 22로 변경
		System.out.println("후위연산 : " + b); // 22
		System.out.println("++a + b++ : " + (++a + b++)); // 15 + 22 = 37
		System.out.println("후위연산 : " + b); //23
	}

}
