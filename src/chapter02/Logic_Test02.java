package chapter02;

public class Logic_Test02 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;
		
		System.out.println("========AND========");
		boolean flag1 = (num1 > 10) && (num2 >20); // False
		System.out.println("False && False : " + flag1);
		
		boolean flag2 = (num1 > 10) && (num2 >0); // False
		System.out.println("False && True : " + flag2);
				
		boolean flag3 = (num1 > 0) && (num2 >20); // False
		System.out.println("True && False : " + flag3);

		boolean flag4 = (num1 > 0) && (num2 >0); // True
		System.out.println("True && True : " + flag4);
		
		System.out.println("========OR========");
		boolean flag5 = (num1 > 10) || (num2 >20); // false
		System.out.println("False || False : " + flag5);
		
		boolean flag6 = (num1 > 10) || (num2 >0); // True
		System.out.println("False || True : " + flag6);
		
		boolean flag7 = (num1 > 0) || (num2 >20); // True
		System.out.println("True || False : " + flag7);
		
		boolean flag8 = (num1 > 0) || (num2 >0); // True
		System.out.println("True || True : " + flag8);
		
		System.out.println("========NOT========");
		//num1과 num2는 같지 않다.
		boolean flag9 = (num1 != num2); // True
		System.out.println("num1 != num2 : " + flag9);
		
		flag9 = !(num1>0);
		System.out.println(flag9);
		
		
	}

}
