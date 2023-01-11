package chapter06;

public class StudentInfo {

	//필드
	int studentID;
	private String studentName; // 다른 클래스에서 다른 필드처럼 직접 호출은 불가능 | 메서드를 통해서면 다른 클래스에 들어갈 수 있음
	int grade;
	String address;
	
	//생성자 생략 : free compile
	//메서드 
	public String getStudentName() { // public -> 외부에서 사용 가능 : studentName(private) 우회적 사용 가능
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
	
}
