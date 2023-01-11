package chapter07;

public class OverloadMain {

	public static void main(String[] args) {
		Overload o1 = new Overload();		
		o1.Disp();
		System.out.println("====================================");
		
		Overload o2 = new Overload(10, 150.8f);
		o2.Disp();
		System.out.println("====================================");
		
		Overload o3 = new Overload("홍길동", 20, 180.3f);
		o3.Disp();
		
	}//m

}//c
