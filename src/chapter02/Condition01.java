package chapter02;

public class Condition01 {

	public static void main(String[] args) {

		int a = 10;
		int b = 15;
		boolean result;
		
		result = ++a >= b ? true : false;
		System.out.println(result);
		
		int n1 = 10;
		int n2 = 20;
		String result2;
		
		result2 = (++n1 == n2) ? "Yes" : "No";
		System.out.println(result2);
		
	}

}
