package chapter01;

public class DoubleEx1 {

	public static void main(String[] args) {
		// Number : bit => byte => short => int => long
		// 문자 : char('') => String("")(자료타입X 클래스O)
		// 소수 : float(f로 선언 필요) => double
		
		float fnum = 3.14f;  //float = 4byte / 정수와 다르게 소수의 경우 값이 작을 경우 f로 선언 필요
		double dnum = 3.14; //double = 8byte
		
		System.out.println(fnum);
		System.out.println(dnum);
	}

}
