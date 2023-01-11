package chapter03.IF.FOR;

import java.util.Scanner;

public class ForTest05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 정수를 입력받아(Scanner) 입력받은 정수부터 100까지의 합을 출력하시오
		/*
		int i;
		System.out.print("정수 입력 : ");
		int sum = 0;
		
		for(i=scan.nextInt(); i <= 100; i++) {
			sum +=i;
		}//for
		
		System.out.println("합 : " + sum);
		*/
		System.out.println("정수를 입력하세요 : ");
		int a = scan.nextInt();
		int sum = 0;
		int i;
		
		for(i=a; i<=100; i++) {
			sum+=i;
		}
		System.out.println(a + "에서 100까지의 합 : " + sum);
		
		// 1부터 10개의 정수를 반복하면서 정수를 입력받고, 그 수 중의 짝수의 갯수가 몇 개인가?
		// 단, 입력받은 수가 0이면 무시
		
		int j;
		int count;
		int even = 0;
		
		for(count = 1; count <= 10; count++) {
			System.out.print(count + "번째 정수 입력 : ");
			j = scan.nextInt();
			
			if(j == 0) {
				count-=1;
			}else if(j % 2 == 0) {
				even +=1;
			}else {
				continue;
			}//if
		}//for
		
		System.out.println("짝수의 개수 : " + even);

	}//main

}//class
