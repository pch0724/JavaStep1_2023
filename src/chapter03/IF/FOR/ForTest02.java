package chapter03.IF.FOR;

public class ForTest02 {

	public static void main(String[] args) {
		System.out.println("[1 ~ 100까지의 합 출력]");
		
		int i;
		int sum = 0;
		
		System.out.println("1 ~ 100까지의 수 나열");
		for(i = 1; i <= 100; i++) {
			System.out.print(i + " ");
			sum += i;
		}// for
		System.out.println();
		System.out.println("1 ~ 100까지의 합 : " + sum);
	}//main
}//class
