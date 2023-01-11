package chapter06;

public class StudentMain {

	public static void main(String[] args) {
		//필드를 이용하여 set
		Student std1 = new Student();
		std1.studentName = "김치";
		std1.address = "서울";
		
		std1.showstudentInfo();
		System.out.println("----------------------------------");
		
		//메서드를 이용하여 set
		Student std2 = new Student();
		std2.setStudentName("박수");
		std2.setAddress("경기도 고양시");
		
		std2.showstudentInfo();
		System.out.println("----------------------------------");
		
		//생성자 오버로딩 set
		Student std3 = new Student("대한", "부산");
		std3.showstudentInfo();
		
	}//m

}//c
