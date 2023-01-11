package chapter01;

public class LongVariable {

	public static void main(String[] args) {

//		int num1 = 12345678900; //32bit = 4byte
		long num2 = 12345678900L; // Long 사용시 32bit를 초과하는 숫자 뒤에는 L로 선언 필요
		long num3 = 1000; // Long형의 64비트이지만 L로 선언 안했으므로, int로 인식 : 8byte => 4byte
//		주로 int 사용하다가 오류발생시 long + L선언
		
		int level; // 변수 선언만 하고 초기화 되지 않은 상태.
				   // 초기화 = 변수 선언 후 값을 지정
		level = 10;// 10 = 리터널값
		
		System.out.println(num2 + num3); // 결과값 = long으로 인식(큰 수의 데이터 타입 따라감)
		System.out.println(level);
		
	}

}
