package chapter03.IF;

import javax.swing.JOptionPane;

public class IfExample08 {

	public static void main(String[] args) {

		int num1, num2;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("num1 입력")); //import 없을 시 ctrl shift o로 불러오기 가능
		num2 = Integer.parseInt(JOptionPane.showInputDialog("num2 입력"));
		
		
		//num1이 크면 num1이 큽니다.
		//num2가 크면 num2가 큽니다.
		//그 밖에는 두 수는 같습니다.
		if(num1 > num2) {
			System.out.println("num1이 큽니다.");
		}else if(num1 < num2) {
			System.out.println("num2가 큽니다.");
		}else {
			System.out.println("두 수는 같습니다.");
		}
	}

}
