package chapter05;

public class FunTest06 {

	public String channel; // heap
	public int channelInt; // heap
	public int volume; // heap
		
	//생성자 생략
	
	//void 외에 모든 타입의 메서드는 반드시 꼭 return 값을 갖는다.
	public int channelUp(int volume) {
		this.volume = volume; // this. : stack 메모리 => heap 메모리 
		System.out.println("소리를 높이겠습니다.");
		return volume + 2;
		
	} // stack
	
	public void channelDown(int volume) {
		this.volume = volume; // this. : stack 메모리 => heap 메모리 
		System.out.println("소리를 높이겠습니다.");
		System.out.println("소리를" + volume + "만큼 내립니다." );
		//return volume + 2; // void는 절대 return 값이 존재할 수 없음

	} // stack
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunTest06 tv = new FunTest06();
		
		//방법1
		System.out.println("소리를" + tv.channelUp(9) + "만큼 올립니다." );
		//방법2
		int volume = tv.channelUp(9);
		System.out.println("소리를" + volume + "만큼 올립니다." );
		tv.channelDown(5);
	}

}
