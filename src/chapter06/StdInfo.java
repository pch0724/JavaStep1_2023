package chapter06;

public class StdInfo {

	//field
	public String stdName;
	public int grade;
	public int money;
	
	//free compile
	
	//overloading constructor
	public StdInfo(String stdName, int money) {
		this.stdName = stdName;
		this.money = money;
	}
	
	//버스
	public void takeBus(Bus bus) {// **매개변수로 객체가 올 수 있음**
		bus.take(1000);
		this.money -= 1000; //학생 지출
	}
	
	//지하철
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500; //학생 지출
	}
	
	//남은 잔액
	public void showInfo() {
		System.out.println(stdName + "님의 남은 잔액은 : " + money + "원 입니다.");
	}
}
