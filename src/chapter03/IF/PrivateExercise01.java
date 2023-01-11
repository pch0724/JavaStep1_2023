package chapter03.IF;

public class PrivateExercise01 {

	public static void main(String[] args) {
		
		int i = (int)(Math.random()*10)+1;
		int j = (int)(Math.random()*10)+1;
		int k = i - j;
		int l = j - i;
		
		if(i > j) {
			System.out.println("i는" + i + "j는" + j + "로 i가 j보다 " + k + "만큼 큽니다.");
		}else if(i < j) {
			System.out.println("i는" + i + "j는" + j + "로 j가 i보다 " + l + "만큼 큽니다.");			
		}else {
			System.out.println("i는" + i + "j는" + j + "로 i와 j보다 같습니다.");		
		}
		// i > j => i가 큽니다.
		
		// i < j => j가 큽니다.
		
		// i = j => 두 수는 같습니다.
		
	}
}
