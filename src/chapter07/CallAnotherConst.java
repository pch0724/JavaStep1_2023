package chapter07;

class Person2{
	
	String name;
	int age;
	
	public Person2() {
		this("이름없음", 0);//Person2(String str, int a)
	}
	
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//자기자신의 주소
	Person2 returnSelf() {
		return this;
	}
	
}



public class CallAnotherConst {
	
	public static void main(String[] args) {
		Person2 noName = new Person2();
		System.out.println(noName.name);
		System.out.println(noName.age);
		System.out.println("noName의 주소 : " + noName);
		System.out.println("noName의 주소 : " + noName.returnSelf());// noName의 주소 : chapter07.Person2@1877ab81 | chapter07 : package / Person2 : class / @ + 1877ab81 : 16진수
		//noName과 p의 객체는 전혀 다른 곳에 할당
		System.out.println("-----------------------------------------");
		Person2 p = new Person2();
		System.out.println("p의 주소 : " + p);// p의 주소 : chapter07.Person2@305fd85dP | 같은 패키지, 클래스의 객체이지만 각 객체마다 다른 주소할당
		//주소 복사
		System.out.println("-----------------------------------------");
		Person2 person = noName.returnSelf();
		System.out.println(person);
		System.out.println(noName);
		
	}

}
