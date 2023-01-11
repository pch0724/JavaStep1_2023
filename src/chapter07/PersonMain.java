package chapter07;

public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "김철수";
		p1.height = 175.5f;
		p1.weight = 65.5f;
		
		System.out.println("이름 : " + p1.name);
		System.out.println("키 : " + p1.height + "cm");
		System.out.println("체중 : " + p1.weight + "kg");
		System.out.println("-------------------------------------");
		
		Person p2 = new Person("김영희");
		p2.height = 165.5f;
		p2.weight = 55.5f;
		
		System.out.println("이름 : " + p2.name);
		System.out.println("키 : " + p2.height + "cm");
		System.out.println("체중 : " + p2.weight + "kg");
		System.out.println("-------------------------------------");

		Person p3 = new Person("홍길동", 183.3f, 78.8f);
		System.out.println("이름 : " + p3.name);
		System.out.println("키 : " + p3.height + "cm");
		System.out.println("체중 : " + p3.weight + "kg");
		
		
		
		
	}

}
