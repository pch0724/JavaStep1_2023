package chapter03.IF;

import javax.swing.JOptionPane;

public class IfExample02 {

	public static void main(String[] args) {
		// String : 문자들(char)이 모여서 만들어지는 문자열 / Class
		/* 
		 * String -> int : 
		 * 	ex) "10" => 문자
		 *  	"10" + 2 => 102
		 *  	12 결과로 바꾸기 위해서는 int로 전환 필요
		 *  	=> Integer.parseInt
		 */
		int dat;
		
		dat = Integer.parseInt(JOptionPane.showInputDialog("값을 입력하세요.")); // 명시적 형변환
		
		// 10의 배수를 판단하세요
		// 조건 : dat에 있는 값을 10으로 나눈 나머지가 0인지에 대한 여부
		if(dat % 10 == 0)
			System.out.println(dat +"은(는) 10의 배수입니다.");
		else 
			System.out.println(dat +"은(는) 10의 배수가 아닙니다.");
	}

}
