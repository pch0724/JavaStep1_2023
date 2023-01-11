package chapter03.IF;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		//정보처리기사의 각 과목의 정답개수를 int형 타입의 변수 5개를 선언하고 입력받으세요(단 입력은 Scanner클래스 사용)
		Scanner scan = new Scanner(System.in);
		//소프트웨어 설계(soft1), 소프트웨어 개발(soft2), 데이터베이스 구축(DB), 프로그램밍언어활용(pro), 정보시스템 구축(os)
		System.out.print("소프트웨어 설계 점수 : ");
		int soft1 = scan.nextInt();
	
		System.out.print("소프트웨어 개발 점수 : ");
		int soft2 = scan.nextInt();
		
		System.out.print("데이터베이스 구축 점수 : ");
		int DB = scan.nextInt();
	
		System.out.print("프로그래밍 언어 활용 점수 : ");
		int pro = scan.nextInt();

		System.out.print("정보시스템 구축 점수 : ");
		int os = scan.nextInt();

		double avg = ((soft1 + soft2 + DB + pro + os)/5); 
		
		//한 과목이라도 8개(40) 미만 평균이 60점 미만인 경우 불합격입니다로 출력
		//그렇지 않으면 합격입니다으로 출력	
		
		if(((soft1>=40) && (soft2>=40) && (DB>=40) && (pro>=40) && (os>=40))) {
			if(avg >= 60) {
				System.out.println("합격입니다.");
			}else {
				System.out.println("불합격입니다.");
			}
		}else if(avg >= 60){
			if((soft1>=40) && (soft2>=40) && (DB>=40) && (pro>=40) && (os>=40)) {
				System.out.println("합격입니다.");				
			}else {
				System.out.println("불합격입니다.");
			}
		}
		
		
		/*
		 *
		if(soft1 < 40 || soft2 < 40  || DB < 40 || pro < 40 || os < 40 || avg < 60) {
			System.out.println("불합격입니다.");
		}else {
			System.out.println("합격입니다.");
		}
		*/ 
	}//main

}//class
