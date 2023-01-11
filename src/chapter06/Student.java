package chapter06;

public class Student {

	//필드
	int studentID;
	String studentName; // 다른 클래스에서 다른 필드처럼 직접 호출은 불가능 | 메서드를 통해서면 다른 클래스에 들어갈 수 있음
	int grade;
	String address;
	
	
	//디폴트 생성자(free compile)
	//오버로딩된 생성자 있을 시 디폴트를 사용하기 위해서는 반드시 디폴트 생성자 생략 X 반드시 명시 필요
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	//생성자 오버로딩(제어권 우선권 : 오버로딩 > 디폴트)
	public Student(String studentName, String address) {
		this.studentName = studentName;
		this.address = address;
	}
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}	
	
	public void showstudentInfo() {
		System.out.println(studentName + " | " + address);
	}

}
