package chapter02;

public class Logic_Test01 {

	public static void main(String[] args) {

		char a,b;
		boolean c; //true false 감별
		
		a = 'A';
		b = 'B';
		
		c =(true || true) && false ;  // false
		System.out.println(c);
		
		c = (a < b) && (a == b); // false
		System.out.println(c);
		System.out.println("===================");
		
		c = (a < b) || (a == b); // true
		System.out.println(c);
		
		
	}

}
