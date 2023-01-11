package chapter07;

import javax.swing.JOptionPane;

public class ThisTestMain {

	public static void main(String[] args) {
		ThisTest tt1 = new ThisTest();
				
		tt1.Move();
		tt1.Move();
		tt1.Stop();
		System.out.println("----------------------------");
		tt1.RAge();
		System.out.println("----------------------------");
		int R_speed = Integer.parseInt(JOptionPane.showInputDialog("로봇 속도"));
		int R_age = Integer.parseInt(JOptionPane.showInputDialog("로봇 나이"));
		String R_name = JOptionPane.showInputDialog("로봇 이름");
		String R_num = JOptionPane.showInputDialog("로봇 번호");
		
		ThisTest tt2 = new ThisTest(R_speed, R_age, R_name, R_num);
		int speed = tt2.getSpeed();
		System.out.println("속도 : " + speed);
		System.out.println("나이 : " + tt2.getAge());
		System.out.println("이름 : " + tt2.getRobotName());
		System.out.println("번호 : " + tt2.getRobotNum());
		System.out.println("----------------------------");
		tt2.Move();
		tt2.RName();
		tt2.RAge();
		tt2.Move();
		tt2.Move();
		tt2.Move();
		tt2.Move();
		tt2.Move();
		tt2.Move();
		tt2.Stop();
		
	}

}
