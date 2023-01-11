package chapter02;

public class Bit_Test01 {

	public static void main(String[] args) {
		// Bit 연산
		
		int num1 = 5;  // 0101
		int num2 = 10; // 1010
		
		// Bit OR(|) 연산
		int result1 = num1 | num2;
		System.out.println(result1);
		/* 
		 * num1 = 0B0101
		 * 		          => result1 = 각 자리에 하나만 1 신호가 있어도 참 => 0B1111 = 15 
		 * num2 = 0B1010 
		 */
		
		// Bit AND(&) 연산
		int result2 = num1 & num2;
		System.out.println(result2);
		/* 
		 * num1 = 0B0101
		 * 		          => result2 = 각 자리에 신호가 동일해야 참 => 0B0000 = 0 
		 * num2 = 0B1010 
		 */
		
		
		// Bit XOR(^) 연산
		int result3 = num1 ^ num2;
		System.out.println(result3);
		/* 
		 * num1 = 0B0101
		 * 		          => result3 = 각 자리가 서로 다른 신호가 있으면 참 => 0B1111 = 15 
		 * num2 = 0B1010 
		 */
		
	}

}
