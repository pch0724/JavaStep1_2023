package chapter06;

import java.util.Scanner;

public class Vending {

	//field
	private Can can[] = new Can[5]; // 메서드를 통해서만 나갈 수 있음 
	private int money;
	
	//can[0] = new Can("환타", 1000); // private 변수방이므로 반드시 메소드 안에서만 초기화한다		
	
	
	//메서드
	public void init() {
		can[0] = new Can("환타", 1000);		
		can[1] = new Can("커피", 700);		
		can[2] = new Can("콜라", 1200);		
		can[3] = new Can("사이다", 1100);		
		can[4] = new Can("이온음료", 1500);		
	}//i
	
	//사용 가능한 음료만 보여주기
	public void showCans(int m) {
		
		money = m;//돈
		
		for(int i = 0; i < can.length; i++) {
			// 돈과 가격과 비교 판단
			if(money >= can[i].getPrice()) {
				System.out.println(can[i].getCanName() + "-" + can[i].getPrice()+"원");
			}//if
		}//for
	}//method
	
	public void outCan(String name) {
		for(int i = 0; i<can.length; i++) {
			if(can[i].getCanName().equals(name)) {
				System.out.println(can[i].getCanName() + "을(를) 선택하셨습니다.");
				System.out.println("잔 액 : " + (money - can[i].getPrice()+"원"));
			}//if
		}//for
		
	}//outCan
	
}//c
