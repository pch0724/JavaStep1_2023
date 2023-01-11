package chapter02;

public class Incre_Test02 {
	
	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("-------------------");
		x++; // print 시 10으로 읽고 11로 증가
		++x; // print 시 12로 증가 후 출력
		System.out.println("x = " + x);
		
		System.out.println("-------------------");
		y--; // 10 -> 9
		--y; // 8
		System.out.println("y = " + y);
		
		System.out.println("-------------------");
		z = x++; // z = 12, x 12 -> 13
		System.out.println("z = " + z); // 12
		System.out.println("x = " + x); // 13
		
		System.out.println("-------------------");
		z = ++x; // x 13 -> 14, z =14
		System.out.println("z = " + z); // 14
		System.out.println("x = " + x); // 14
		
		System.out.println("-------------------");
		z = ++x + y++; // x 14 -> 15, y = 8 -> 9 , z =15 + 8 = 23
		System.out.println("z = " + z); // 23
		System.out.println("x = " + x); // 15
		System.out.println("y = " + y); // 9
		
	}
}
