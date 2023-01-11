package chapter01;

public class Constant {

	public static void main(String[] args) {
		//상수: 변하지 않는 값
		
		final int MAX_NUM = 100;
		final int MIN_NUM; // 초기화 값이 없음
		final double PI = 3.14;
		
		MIN_NUM = 0;
		// final 사용시 최초의 리터널 값에서 변경 불가
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		System.out.println(PI);
		
	}

}
