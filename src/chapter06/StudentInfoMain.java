package chapter06;

import java.util.Scanner;

public class StudentInfoMain {

	public static void main(String[] args) {

		StudentInfo studentKim = new StudentInfo();
		Scanner s = new Scanner(System.in);
		
		studentKim.studentID = 1004;
		studentKim.grade = 3;
		studentKim.address = "서울시 종로구";
		
		studentKim.setStudentName("홍길동");
		String name = studentKim.getStudentName(); //get으로 받으면 변수방에 넣어야		
		
		System.out.println(name);
	}

}
