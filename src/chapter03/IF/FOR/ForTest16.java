package chapter03.IF.FOR;

public class ForTest16 {

	public static void main(String[] args) {
		int i, j;
		
		for(i=2;i<=9;i++) {
			System.out.print("["+i+"단]" + "\t");
		}
		System.out.println();
		for(j=1; j<=9; j++) {
			for(i=2; i<=9; i++) {
				System.out.print(i + "*" + j + "=" +(i*j)+ "\t");
			}
			System.out.println();
		}
	}

}
