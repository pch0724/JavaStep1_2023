package chapter03.IF;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IfExample11 {

	public static void main(String[] args) {
		// Scanner scan이라는 인스턴스 변수 선언
		Scanner scan = new Scanner(System.in);
		String id = "soldesk";
		int pass = 12345;
		// ID라는 변수로 아이디 받기
		System.out.print("아이디 : ");
		String ID = scan.nextLine();
		System.out.print("비밀번호 : ");
		String PW = scan.nextLine();
		int iPW = Integer.parseInt(PW);
		
		if(id.equals(ID)) {
			// PW라는 변수로 비밀번호 선언(String) => 숫자로 받되 String		
			// int 형으로 형변환
			// int PW = Integer.parseInt(scan.nextLine()); = 22, 23라인의 한 줄 코드
			if(pass == iPW) {
				System.out.println(id + "님 환영합니다.");
			}else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		}else {
			System.out.println("아이디가 없습니다.");
			// 중첩질의를 사용하여 로그인 성공과 비밀번호 오류 및 아이디 없음 표시
		}
		
		
		/*
		//논리 연산자
		if((id.equals(ID)) && (iPW != pass)) {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}else if(!(id.equals(ID)) && (iPW == pass)) {
			System.out.println("아이디가 잘못 되었습니다.");
		}else if(!(id.equals(ID)) && (iPW != pass)) {
			System.out.println("로그인 실패");
		}else {
			System.out.println(id + "님 환영합니다.");		
		}
		*/
	}//main

}//class
