package chapter03.IF.FOR;

public class ForTest06 {

	public static void main(String[] args) {

		int i;
		char a = 'A'; //ASCII CODE : 65
		// a = i -> 일반적으로는 불가능
		// a = (char)i로 형변환을 해야 가능		
		for(i=a; i<='Z'; i++) {
			System.out.printf("%c ", i);		
			
			//String => char = charAt(0) : 0은 0번째 문자를 읽는것을 의미
			
			
		}//for
	}//main
}//class
