package chapter03.IF;

import java.util.Scanner;

public class IfExample12 {

	public static void main(String[] args) {
		// 데이터베이스
		String id = "soldesk";
		int pass = 221227;
		
		//Scanner scan
		Scanner scan = new Scanner(System.in);
		//ID 받기
		System.out.print("아이디 : ");
		String inputID = scan.nextLine();
		
		if(id.equals(inputID)) {
			// 비밀번호 입력
			System.out.print("비밀번호 : ");
			String PW = scan.nextLine();
			int iPW = Integer.parseInt(PW);
			// 비밀번호 확인 코드
			if(pass == iPW) {
				System.out.println(id + "님 환영합니다.");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}//in if
		}else {
			System.out.println("아이디가 틀렸습니다.");
		}//out if

	}//main

}//class
