package chapter07;

public class CarMain {

	public static void main(String[] args) {
		//생성자를 통해 초기화
		Car ca = new Car("검정", 1500);
		
		//멤버변수에 직접 접근해서 초기화 후 출력
		Car car = new Car();
		car.color="빨강";
		car.cc = 1000;
		System.out.println("색상 : "+car.color + " | CC : "+car.cc);
		
		System.out.println("-----------------------------------------");
		//method를 이용한 출력
		System.out.println("색상 : " + ca.getColor() + " | CC : " + ca.getCc());
			
	}//m

}//c
