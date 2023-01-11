package chapter07;

public class KoreanMain {

	public static void main(String[] args) {

		Korean k1 = new Korean("박자바", "010-1234-5678");
		System.out.print("국적 : "+k1.nation);
		System.out.println(" | 이름 : " + k1.name + " | 번호 : " + k1.ssn);
		System.out.println("-----------------------------------------------");
		
		Korean k2 = new Korean("김자바", "010-1111-2222");		
		System.out.print("국적 : "+k2.nation);
		System.out.println(" | 이름 : " + k2.name + " | 번호 : " + k2.ssn);
		
	}//m

}//c
