package chapter07;

public class ConstTest {

	private int aa;
	private int bb;
	
	public ConstTest() {
	
	}//dc
	
	public ConstTest(int aa, int bb) {
		this.aa = aa;
		this.bb = bb;
	}//ovlc


	public static void main(String[] args) {
		
		ConstTest obj1 = new ConstTest();
		obj1.aa = 10; // 멤버변수가 private이어도 같은 클래스에 메인이 존재하면 사용 가능
		obj1.bb = 20; // 멤버변수가 private이어도 같은 클래스에 메인이 존재하면 사용 가능
		System.out.println(obj1.aa);
		System.out.println(obj1.bb);
		System.out.println("----------------");
		ConstTest obj2 = new ConstTest(30, 40);
		System.out.println(obj2.aa);
		System.out.println(obj2.bb);
		
	}

}
