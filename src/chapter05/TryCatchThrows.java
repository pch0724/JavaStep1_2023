package chapter05;

public class TryCatchThrows {

	public static void fun()  throws Exception{
		
		try {
			System.out.println("fun()메서드");//정상코드
			throw new Exception();
			
		} catch (RuntimeException e) {//RuntimeException : 실행 중 발생하는 에러
			System.out.println("예외발생");//에러시 수행하는 수행문
		
		}finally { //finally : 에러를 잡지 못해도 또는 에러를 잡아도 무조건 수행해야하는 코드
			System.out.println("finally 문장");
		}
		
	}//fun
	
	
	public static void main(String[] args) {
		//static이므로 바로 호출 가능해야 하지만 throws Exception 메소드 이므로 try catch로 호출
		//fun();
		try {
			fun();
		} catch (Exception e) {
			System.out.println("main()의 catch문 문장");
		}//try_m
		
	}//main

}//class
