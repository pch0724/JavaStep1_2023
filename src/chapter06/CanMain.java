package chapter06;

import java.util.Scanner;

public class CanMain {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String select = "";
	int money = 0;
	
	Vending vend = new Vending();
	vend.init();//음료준비
	
	System.out.print("돈을 투입하세요 : ");
	money = sc.nextInt();
	
	vend.showCans(money);

	System.out.print("음료를 선택하세요 : ");
	select = sc.next(); // 음료 종류 선택
	
	vend.outCan(select);

	}

}
