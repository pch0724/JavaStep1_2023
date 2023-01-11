package chapter07;

import javax.swing.JOptionPane;

public class EncapsulationMain {

	public static void main(String[] args) {
		
		int side;
		int height;
		int Area;
		
		side = Integer.parseInt(JOptionPane.showInputDialog("밑변"));
		height = Integer.parseInt(JOptionPane.showInputDialog("높이"));

		//객체생성
		Encapsulation en = new Encapsulation();
		
		Area = en.Cal_Area(side, height);
		System.out.println("사각형의 넓이 : " + Area + "㎠");
		String str = "사각형의 넓이 : " + Area + "㎠";
		JOptionPane.showMessageDialog(null, str);
		

		
	}

}
