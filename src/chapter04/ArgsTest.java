package chapter04;

public class ArgsTest {

	public static void main(String[] args) {

		//배열선언
		int a[] = new int[5]; //Fixed-length
		
		//배열선언2
		int b[]; // 선언만 미리
		b = new int[5]; // 나중 선언

		int aVal;
		int bVal;
		int Tot; // 전역변수
		
		//배열선언3		
		args = new String[2];
		args[0]="1"; // [0] => 첨자 / "1"=> 요소 
		args[1]="2"; // [1] => 첨자 / "2" => 요소
		
		String[] str;
		str= new String[2];

		//length : 배열의 첨자(메모리)수
		if(args.length == 2) {
			int sum = 0; // 지역변수 => if문 내에 속해 if문 종료시 값 사라짐
			aVal=Integer.parseInt(args[0]);
			bVal=Integer.parseInt(args[1]);
		}else {
			aVal = 0;
			bVal = 0;
		}//if
		
		Tot = aVal + bVal;
		System.out.println(Tot);
	}//main

}//class
