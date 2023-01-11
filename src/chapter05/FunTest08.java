package chapter05;

import java.util.Scanner;

public class FunTest08 {
	
	//멤버변수(필드)
	
	//디폴트 생성자(따로 기재하지 않아도 자동적으로 존재)
	
	//재귀함수
	public static int Recur(int a) {
				
		int result;
		System.out.print(a + " "); //
		
		if(a==1) {
			return(1);
		}else {
			result = a*Recur(a-1);
		}
		
		//return 1; // 정상종료는 아니지만 오류 없이 끝남
		//return 0; // 정상종료되었으나 넘어가는 값이 없음
		return result;
	}
	
	
	public static void main(String[] args) {
		
		System.out.print("정수 입력 : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("메서드 호출");
		int res = Recur(x);
		System.out.println();
		System.out.println("1 ~ " + x + "까지의 수를 곱한 값 : " + res);
	}

}
