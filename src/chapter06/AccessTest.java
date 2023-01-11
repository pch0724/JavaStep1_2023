package chapter06;

import javax.swing.JOptionPane;

public class AccessTest {
	
	//필드
	private int aa;
	public int bb;
	int cc;
	
	//디폴트 생성자 : void, int, double 같은 기능 추가 X
	public AccessTest() {
		// TODO Auto-generated constructor stub
	}
	
	//메서드
	public void setAa(int aa) {
		this.aa = aa;
	}
	
	public void setBb(int bb) {
		this.bb = bb;
	}
	
	public void setCc(int cc) {
		this.cc = cc;
	}
	
	public void Disp() {
		System.out.println("aa값 : " + aa + "\nbb값 : " + bb + "\ncc값 : " + cc);
	}
	
	
	public static void main(String[] args) {
		AccessTest obj = new AccessTest();// 객체(obj) 생성
		obj.aa = Integer.parseInt(JOptionPane.showInputDialog("aa"));
		obj.bb = Integer.parseInt(JOptionPane.showInputDialog("bb"));
		obj.cc = Integer.parseInt(JOptionPane.showInputDialog("cc"));
		
		obj.Disp();
		
		obj.setAa(1);
		obj.setBb(2);
		obj.setCc(3);
		
		obj.Disp();
	}


}
