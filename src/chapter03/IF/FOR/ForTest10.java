package chapter03.IF.FOR;

import java.util.Scanner;

public class ForTest10 {

	public static void main(String[] args) {
		// 입력받은 수를 초과하면 반복문을 멈추는 조건
		Scanner scan = new Scanner(System.in);
		
		int i, cnt, sum = 0;
		
		cnt = (int)Math.random();
		
		System.out.print("정수 입력 : "); // 20
		int num = scan.nextInt();
		
		for(i = 1; ;i++) {
			
			if(sum > 200) {
				break;
			}//if
			
			sum+=i;
		}//for
		System.out.println((i-1) + "번째까지의 총합 : " + sum);
	}

}
