package chapter03.IF.FOR;

import java.util.Scanner;

public class ForTest09 {

	public static void main(String[] args) {
		// 몇 명의 성적을 입력받을 것인지 정수로 인원 수를 입력받다 총점과 평균을 구하시오
		// 단, 평균은 실수로 출력할 것
		
		Scanner scan = new Scanner(System.in);
		
		int i, sum = 0, cnt = 0;
		double avg = 0;
		
		System.out.print("몇 명의 학생 점수를 입력 받으시겠습니까? : ");
		int std = scan.nextInt();
		
		for(i = 1; i <= std; i++) {
			System.out.print(i + "번째 학생의 점수 입력 : ");
			int score = scan.nextInt();
			sum += score;
			cnt++; // 인원 수 누적
		}
		
		//평균
		avg = sum / (double)std;
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + avg);
		
	}

}
