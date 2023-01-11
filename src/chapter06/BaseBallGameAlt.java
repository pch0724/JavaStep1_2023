package chapter06;

import java.util.Random;
import java.util.Scanner;

public class BaseBallGameAlt {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int com[] = new int[3];
		int user[] = new int[3];
		
		
		while(true) {
			for(int i = 0; i < 3; i++) {
				com[i] = 0;
				com[i] = new Random().nextInt(9)+1;
				
				for(int j = 0; j < i; j++) {
					if(com[j] == com[i]) {
						i--;
					}//if
				}//i f
			}//f
			
			for(int i = 0; i < 3; i++) {
				user[i] = 0;
				System.out.println("1 ~ 9 사이의 수 입력");
				System.out.println((i+1) + "번째 수를 입력 > ");
				user[i] = sc.nextInt();
				
				if(user[i] > 9 || user[i] < 1) {
					System.err.println("1 ~ 9 사이의 수를 입력하시오.");
					i--;
				}//i if
				
				for(int j = 0; j < i; j++) {
					if(user[j] == user[i]) {
						System.err.println("중복된 숫자입니다.");
						i--;
					}//i
				}//f			
			}//f
			
			for(int i = 0; i < 3; i++) {
				System.out.print(com[i] + " " + "\n");
				System.out.print(user[i] + " " + "\n");
			}
				int strike = 0;
				int ball = 0;
				int out = 0;
			
			/*
		int com1 = 0;
		int com2 = 0;
		int com3 = 0;
	
		do {
			//1 ~ 9난수 발생
			com1 = new Random().nextInt(9)+1;
			com2 = new Random().nextInt(9)+1;
			com3 = new Random().nextInt(9)+1;
		}while(com1 == com3 || com1 == com2 || com2 == com3);
			 */
			//컴퓨터 게임 준비 완료
			
			/*
		//사용자 입력할 수
		int user1 = 0;
		int user2 = 0;
		int user3 = 0;
		
		while(true) {
			System.out.println("1 ~ 9 사이의 수 입력");
			System.out.print("첫 번째 수를 입력 > ");
			user1 = sc.nextInt();
			System.out.print("두 번째 수를 입력 > ");
			user2 = sc.nextInt();
			System.out.print("세 번째 수를 입력 > ");
			user3 = sc.nextInt();
			int strike = 0;
			int ball = 0;
			int out = 0;
			
			if(com[0] == user[0]) {
				strike++;
			}else if(com1 == user2 || com1 == user3) {
				ball++;
			}else {
				out++;
			}//com1 if
			
			if(com2 == user2) {
				strike++;
			}else if(com2 == user1 || com2 == user3) {
				ball++;
			}else {
				out++;
			}//com2 if
			
			if(com3 == user3) {
				strike++;
			}else if(com3 == user1 || com3 == user2) {
				ball++;
			}else {
				out++;
			}//com3 if
			
			System.out.println("스트라이크 : "+ strike + " | 볼 : " + ball + " | 아웃 : " + out);
			
			if(strike == 3) {
				System.out.println("승리");
				break;
			}else if(out == 3) {
				System.out.println("패배");
				break;
			}//if
			
		}//w
			 */
			
		}//w
			
		
	}//m

}//c
