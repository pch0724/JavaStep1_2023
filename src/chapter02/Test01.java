package chapter02;

public class Test01 {

	public static void main(String[] args) {

		System.out.println("Q1");
		byte bNum = 100;
		int iNum = 1000;
		System.out.println("byte + int = int" + (bNum+iNum));

		float fNum = 3.13f;
		double dNum = 3.01;
		System.out.println("float + double = double" + (fNum + dNum));
		System.out.println("======================");
		System.out.println("");
		
		System.out.println("Q2");
		double dNum2 = 3.15;
		int iNum2 = 12345;
		System.out.println("3.15 + 12345 = " + (int)(dNum2+iNum2));
		
		float fNum2 = 3.53f;
		byte bNum2 = 100;
		System.out.println("3.53 + 100 =" + (byte)(fNum2 + bNum2));
		System.out.println("======================");
		System.out.println("");
		 
		System.out.println("Q3");
		System.out.println("부동소수점방식");
		System.out.println("======================");
		System.out.println("");
		
		System.out.println("Q4");
		int xNum = 10;
		double yNum = 2.5;
		System.out.println("더하기 : " + (int)(xNum + yNum));
		System.out.println("빼기 : " + (int)(xNum - yNum));
		System.out.println("곱하기 : " + (int)(xNum * yNum));
		System.out.println("나누기 : " + (int)(xNum / yNum));
		System.out.println("======================");
		System.out.println("");
		
		System.out.println("Q5");
		char ch1 ='\uAE00';
		System.out.println(ch1);
	}

}
