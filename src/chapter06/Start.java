package chapter06;

import java.util.Random;
import java.util.Scanner;

public class Start {
	
	private int random = new Random().nextInt(50)+1;//1 ~ 50 정수 추출
	private int count = 0;
	private String result = "FAIL";
	
	public String check(int mynumber) {
			count++;
			
		//random 값보다 작으면 Up / 크면 Down / 일치하면 => result = "SUCCESS"			
			if(mynumber < random) {
				System.out.println("UP");
			}else if(mynumber > random) {
				System.out.println("DOWN");
			}else{
				System.out.println(count + "회 만에 정답!!");
				result = "SUCCESS";
			}
			return result;
			
	}
}
