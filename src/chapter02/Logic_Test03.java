package chapter02;

public class Logic_Test03 {

	public static void main(String[] args) {

		int num1 = 10;
		int i = 2;
		
		boolean value = ((i = i + 2) < 10) && ((num1 = num1 + 2) < 10); //true && false
		System.out.println(i); //4
		System.out.println(num1); //앞의 논리연산 값에 따라 10, 12
		System.out.println(value); // false
		
		System.out.println("----------------------------------");
		
		value = ((i = i + 2) > 10) || ((num1 = num1 + 2) < 10); //true || false
		System.out.println(i); //6
		System.out.println(num1); //앞의 논리연산 값에 따라 12, 14
		System.out.println(value); // true
	}

}
