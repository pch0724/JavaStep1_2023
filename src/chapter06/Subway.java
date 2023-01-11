package chapter06;

public class Subway {

	//field
	String subLine;
	int passengerCount;
	int money;//지하철 수입
	
	//free compile
	
	//overloading constructor
	public Subway(String subLine) {
		this.subLine = subLine;
	}//b
	
	//method
	public void take(int money) {//승객이 낸 돈
		this.money += money;//지하철 수입 증가
		passengerCount++;//승객 수
	}//t
	
	public void showInfo() {//버스 정보 출력
		System.out.println("지하철 호선 : " + subLine + "호선의 승객은 " + passengerCount + "명이고, 수입은" + money + "원 입니다.");		
	}
}
