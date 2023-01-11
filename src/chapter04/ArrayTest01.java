package chapter04;

public class ArrayTest01 {

	public static void main(String[] args) {
		// 선언방법
		int number1[] =new int[10]; //방법1
		int[] number2 =new int[10]; //방법2
		
		int number3[];
		number3 = new int[10];
		
		//초기화
		int number4[] = new int[] {1,2,3,4,5,6,7,8,9,10}; //Fixed-length
		int number5[] = {1,2,3,4,5,6,7,8,9,10};// new int 생략가능
		
		//for문
		for(int i = 0; i < number3.length; i++) {
			System.out.print((number1[i]=(i+1)) + " "); // 리터널 값 대입 후 출력
		}//for
		
	}//main

}//class
