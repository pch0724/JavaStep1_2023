package chapter06;

import javax.swing.JOptionPane;

public class SungJuk {

	//필드 또는 멤버 변수
	private String std_num; // private = 같은 class 내에서는 사용 가능
	private String std_name;
	private int java, oracle, spring;
	
	//디폴트 생성자 = 클래스 이름과 동일해야함(생략 가능)
	public SungJuk() {
		// TODO Auto-generated constructor stub
	}
	
	//메서드
	public void sum() {
		int total = java+oracle+spring; // stack 메모리 | 지역변수
		
		System.out.println("총합계 : " + total);
	}//s
	
	public void avg() {
		int avg = (java + oracle + spring) / 3; // 지역변수
		System.out.println("평 균 : " + avg);
	}//a
	
	public static void main(String[] args) {
		
		SungJuk rec = new SungJuk(); // new 이하는 생성자를 호출한 것 + 초기화
		
		rec.std_num = JOptionPane.showInputDialog("학번");
		rec.std_name = JOptionPane.showInputDialog("이름");

		rec.java = Integer.parseInt(JOptionPane.showInputDialog("Java 점수 입력"));
		rec.oracle = Integer.parseInt(JOptionPane.showInputDialog("Oracle 점수 입력"));
		rec.spring = Integer.parseInt(JOptionPane.showInputDialog("Spring 점수 입력"));
		
		System.out.println("학번 - " + rec.std_num + " | 이름 - " + rec.std_name + "님의 성적입니다.");
		System.out.println("------------------------------------------------------------------");
		rec.sum();
		rec.avg();
	}//m

}//c
