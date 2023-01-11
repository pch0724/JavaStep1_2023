package chapter06;

public class MyDateMain {

	public static void main(String[] args) {

		MyDate obj = new MyDate(); // new = Heap 메모리에 할당
		
		obj.year = 2023;
		obj.month = 12;
		obj.day = 27;
		
		System.out.println(obj.year + "년 " + obj.month + "월 " + obj.day +"일");
	}

}
