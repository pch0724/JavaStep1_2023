package chapter02;

public class AssignTest04 {

	public static void main(String[] args) {

		// 전위연산
		System.out.println("===전위연산===");
		
		int gameScore = 150;
		
		//int lastScore1 = gameScore+1
		int lastScore1 =++gameScore; //암기
		
		System.out.println(lastScore1); // 1 더하고 기억
		System.out.println(gameScore); // ++을 통해 +1이 된 상태
		System.out.println("============");
		
		//int lastScore2 = gameScore-1
		int lastScore2 =--gameScore;
		
		System.out.println(lastScore2); // 1 빼고 기억
		System.out.println(gameScore); // --를 통해 -1이 된 상태
		System.out.println("============");

		// 후위연산
		System.out.println("===후위연산===");
		int lastScore3 =gameScore++; // 읽고 대입 후 더하기
		
		System.out.println(lastScore3); // 'gameScore 값을 먼저 읽고' gameScore에 +1 => 150
		System.out.println(gameScore); // 후위연산을 통해 +1 => 151
		System.out.println("============");

		int lastScore4 =gameScore--; // 읽고 대입 후 빼기
		
		System.out.println(lastScore4); // 'gameScore 값을 먼저 읽고' gameScore에 -1 => 151
		System.out.println(gameScore); // 후위연산을 통해 -1 => 150
		System.out.println("============");

	}

}
