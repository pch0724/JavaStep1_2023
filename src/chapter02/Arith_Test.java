package chapter02;

public class Arith_Test {

	public static void main(String[] args) {
		// 총점과 평균을 출력
		
		int mathScore = 93;
		int engScore = 87;
		
		// 총점
		int sum = mathScore + engScore;
		
		// 평균
		double avg = sum / 2;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}

}
