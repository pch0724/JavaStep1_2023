package chapter07;

public class Overload {

	private String name;
	private int age;
	private float h;	
	
	public Overload() {
		this.age = 0;
		this.h = 0f;
		this.name = "익명";
	}

	public Overload(int a, float ki) {

		age = a;
		h = ki;
	}

	public Overload(String n, int a, float ki) {
		name = n;
		age = a;
		h = ki;
	}
	
	public void Disp() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + h);
	}
	
	
	
	
}
