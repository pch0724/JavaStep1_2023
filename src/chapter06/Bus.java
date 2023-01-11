package chapter06;

public class Bus {

	//field
	int busNum;
	int passengerCount;
	int money;
	
	//free compile
	
	//overloading constructor
	public Bus(int busNum) {
		this.busNum = busNum;
	}//b
	
	//method
	public void take(int money) {//승객이 낸 돈
		this.money += money;//버스 수입 증가
		passengerCount++;//승객 수
	}//t
	
	public void showInfo() {//버스 정보 출력
		System.out.println("버스 번호 : " + busNum + "번의 승객은 " + passengerCount + "명이고, 수입은" + money + "원 입니다.");		
	}
}
