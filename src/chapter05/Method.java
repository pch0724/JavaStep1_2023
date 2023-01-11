package chapter05;

import java.util.Scanner;

public class Method {
	Scanner sc = new Scanner(System.in);

	//멤버 변수 (= 필드)
	
	//생성자 생략
	
	//메서드	
	void makeBread() {
		System.out.println("빵을 만듭니다.");
	}//method1
	
	void makeBread(int count) {//count = 가매개변수
		System.out.print("갯수 : ");
		count = sc.nextInt();
		for(int i = 1; i <= count; i++) {
			//1번째 빵을 만들었습니다.
			//2번째 빵을 만들었습니다.
			System.out.println(i + "번째 빵을 만들었습니다.");
		}
		//요청하신 5개의 빵이 모두 완료되었습니다.
		System.out.println("요청하신 " + count+"개의 빵이 모두 완료되었습니다.");
	}//method2
	
	void makeBread(int count, String bread) {//count = 가매개변수
		System.out.print("갯수 : ");
		count = sc.nextInt();
		System.out.print("종류 : ");
		bread = sc.next();
		for(int i = 1; i <= count; i++) {
			//1번째 생크림 빵을 만들었습니다.
			//2번째 생크림 빵을 만들었습니다.
			System.out.println(i + "번째 " + bread +  " 빵을 만들었습니다.");
		}
		//요청하신 5개의 생크림빵이 모두 완료되었습니다.
		System.out.println("요청하신 " + count+"개의 " + bread + " 빵이 모두 완료되었습니다.");
	}//method3
	
	void order() {
		int count=0;
		String bread="";
		
		while(true) {
			int num;
			
			System.out.println("1. 빵 갯수 선택 | 2. 빵의 갯수와 종류 | 3. 종료 ");
			System.out.print("선택 > ");
			num = sc.nextInt();
			
			if(num == 1) {
				makeBread(count);
			}else if(num == 2) {
				makeBread(count, bread);
			}else {
				break;
			}
			System.out.println("-----------------------------------------------");
		}//while
		System.out.println("프로그램 종료");
	}//order method
	
}//class
