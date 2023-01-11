package chapter06;

public class TakeTrans {

	public static void main(String[] args) {
		//학생 2명
		StdInfo stdJames = new StdInfo("James", 12000);
		StdInfo stdTom = new StdInfo("Tom", 10000);


		//버스 타기
		Bus bus100 = new Bus(100);
		stdTom.takeBus(bus100);
		//정보확인
		stdTom.showInfo();//지출
		bus100.showInfo();//수입증가 인원수 증가
		System.out.println("==========================================");
		
		//지하철 타기
		Subway sub = new Subway("1");
		stdJames.takeSubway(sub);
		//정보확인
		stdJames.showInfo();
		sub.showInfo();
		System.out.println("==========================================");

		Subway sub2 = new Subway("2");
		stdTom.takeSubway(sub2);
		stdTom.showInfo();
		sub2.showInfo();
		System.out.println("==========================================");
		
		
		Bus bus987 = new Bus(987);
		stdTom.takeBus(bus987);
		stdTom.showInfo();
		bus987.showInfo();
		System.out.println("==========================================");
		
		stdJames.takeBus(bus100);
		stdJames.showInfo();
		bus100.showInfo();
	}//m

}//c
