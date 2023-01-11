package chapter04.Example;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		// 학생 수를 입력받아, 점수를 입력하고 점수리스트를 출력하고 총점과 평균을 분석		
		Scanner scan = new Scanner(System.in);
		int std = 0;
		int score[] = null;
		
		while(true) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택> ");
			int num = scan.nextInt();
			
			if(num==1) {
				System.out.print("학생수> ");
				std = scan.nextInt();
				if(std <= 0) {
					System.out.println("학생수는 0보다 커야함");
				}
			}else if(num==2) {
				score = new int [std];
				if(std <= 0) {
					System.out.println("학생수 먼저 입력");
				}
				for(int i=0; i < score.length;i++) {
					System.out.print("score["+ (i+1) + "] : ");
					score[i] = scan.nextInt();
				}//for
			}else if(num==3) {
				if((score == null) || (std == 0)) {
					System.out.println("점수 먼저 입력");
				}else {
					for(int i = 0; i < score.length; i++) {
						System.out.println("score[" + (i+1) +"] : " + score[i]);
					}//for					
					System.out.println("----------------------------------");
				}
			}else if(num==4) {
				if(score == null) {
					System.out.println("점수 먼저 입력");
				}else {
					int max = 0, sum = 0;
					
					for(int i = 0; i < score.length; i++) {
						/*
						 * max = max < score[i] ? score[i] : max; //최고점수
						*/
						if(max < score[i]) {
							max = score[i];
							sum += score[i];
						}else{
							sum += score[i];
						}
					}//for
					String avg = String.format("%.2f", sum / (double)std);
					System.out.println("최고 점수 : " + max);
					System.out.println("총점 : " + sum);
					System.out.println("평균 : " + avg);					
				}//if
			}else if(num==5) {
				break;
			}else {
				System.out.println("잘못입력");
			}//if
			
		}//while
		System.out.println("프로그램 종료");
	}//main

}//class
