package chapter06;

public class Computer {

	int sum1(int[] values) {
		int sum = 0;
		
		for(int i = 0; i<values.length; i++) {
			sum += values[i];
		}
		
		return sum;
	}
	//============================================
	int sum2(int ... values) {// ... : 배열로 인지
		int sum = 0;
		
		for(int i = 0; i<values.length; i++) {
			sum += values[i];
		}//for
		
		return sum;
		
	}//method
}//class
