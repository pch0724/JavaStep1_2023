package chapter07;
					//global, main, static => Data
public class Person {//class => Heap

	String name;
	float height; //field => Heap
	float weight;
	
	//기본 생성자
	public Person() {
	}
									// Method => Stack
	//ovl
	public Person(String name) {
		this.name = name;
	}
	public Person(String name, float height, float weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	
	
	
}//c
