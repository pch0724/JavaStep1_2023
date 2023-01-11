package chapter03.IF.While;

import java.util.Scanner;

public class WhileTest05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num, cnt=0, sum=0;
		double avg=0;
		//0을 입력하면 종료
		
		while(true) {
			System.out.print("숫자 입력 : ");
			num = scan.nextInt();
			
			if(num == 0) {
				break;
			}else {
				sum+=num;
				cnt++;
				avg = sum / (double)cnt;
			}//if
		}//while
		System.out.println("합 : " + sum + " 평균 : " + avg);
	}//main

}//class
