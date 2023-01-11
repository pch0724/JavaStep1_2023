package chapter05;

public class FunTest05 {

	public String channel;//멤버 변수
	public int channelInt;
	public int volume;		
	
	//생략 가능
	public FunTest05() {
		// TODO Auto-generated constructor stub
	}
	
	public void channelUp(int volume) {
		System.out.println("소리를 " + volume + "만큼 올립니다");
	}
		
	public void channelDown(int volume) {
		System.out.println("소리를 " + volume + "만큼 내립니다");
		
	}
	
	//오버로딩 : 메서드 이름은 같은데 매개변수가 다를 때 -> 다형성 만족 
	public void channelChange(String channel) { // 변수방처럼 메서드 이름도 동일하면 안됨 (매개변수가 다르면 다른 메서드로 인지)
		System.out.println("TV 채널을 " + channel + "로 바꿉니다");
		
	}
	//오버로딩
	public void channelChange(int channelInt) {
		System.out.println("채널을 " + channelInt + "로 바꿉니다");
		
	}
	
	//==================================================
	
	public static void main(String[] args) {

		FunTest05 obj = new FunTest05();
		
		obj.channelChange(11);
		obj.channelChange("MBC");
		obj.channelDown(5);
		obj.channelUp(5);
	}

}
