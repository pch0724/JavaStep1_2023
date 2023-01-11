package chapter02;

public class Bit_Test02 {

	public static void main(String[] args) {

		int num = 0B0000101; // 5
		System.out.println(num);
		
		System.out.println(num << 2); // 증가 추세
		System.out.println(num >> 2); // 감소 추세 / 갈 자리가 없으면 소실
		
		int a, b, c;
		a = 5;
		b = 2;
		c = a >> b;
		System.out.println(c); // 0B0000101 => 0B00000001
		
		c = a << b;
		System.out.println(c); // 0B0000101 => 0B00010100
	}

}
