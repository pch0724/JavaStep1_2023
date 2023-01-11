package chapter04;

public class ArraySumTest {

	public static void main(String[] args) {

		int score[] = {98,90,87};
		
		int sum = 0;
		double avg = 0;
		
		for(int i = 0; i < score.length; i++) {
			sum +=score[i];
		}
		System.out.println("총점 : "+ sum);
		avg = sum / (double)(score.length);
		System.out.println("평균: " + avg);
		//반올림
		System.out.println("평균: " +Math.round(avg));
		
	}//main

}//class
