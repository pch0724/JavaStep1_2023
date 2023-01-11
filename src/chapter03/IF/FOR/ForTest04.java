package chapter03.IF.FOR;

public class ForTest04 {

	public static void main(String[] args) {

		//0 ~ 100까지의 수 중 홀수만 합하기
		/*
		int num;
		int total = 0;
		
		for(num = 0; num <= 100; num++) {
			if(num % 2== 0 )
				continue; // 계속 진행
			total += num;
		}
		System.out.println("홀수의 합 : " + total);
		*/
		
		System.out.println("==============================");
		System.out.println();
		System.out.println("1 ~ 20까지의 수 중 홀수 값만 출력");
		/*
		int i;
		
		for(i=1; i<=20; i+=2) {
			System.out.print(i + " ");
		}
		*/
		/*
		int j;
		
		for(j=1; j<=20; j++) {
			if(j % 2 == 1) {
				System.out.print(j + " ");
			}else {
				continue;
			}
		}
		*/
		
		int k;
		
		for(k=1; k<=20; k++) {
			if (k % 2 == 0) {
				continue;
			}else {
				System.out.print(k + " ");
			}
		}
	}//main

}//class
