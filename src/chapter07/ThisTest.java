package chapter07;

public class ThisTest {

	private int Speed;
	private int Age;
	private String RobotName;
	private String RobotNum;

	public ThisTest() {
		// TODO Auto-generated constructor stub
	}
	
	public ThisTest(int speed, int age, String robotName, String robotNum) {
		Speed = speed;
		Age = age;
		RobotName = robotName;
		RobotNum = robotNum;
	}

	public void Move() {
		Speed += 20;
		System.out.println("Robot Speed : " + Speed);
	}
	
	public void Stop() {
		Speed = 0;
		System.out.println("Robot Speed : " + Speed);
	}

	public void RAge() {
		Age += 1;
		System.out.println("RobtAge : " + Age);
	}
	
	public void RName() {
		System.out.println("RobotName : " + RobotName);
	}
	
	public int getSpeed() {
		return Speed;
	}

	public int getAge() {
		return Age;
	}

	public String getRobotName() {
		return RobotName;
	}

	public String getRobotNum() {
		return RobotNum;
	}
	
	
	
}
