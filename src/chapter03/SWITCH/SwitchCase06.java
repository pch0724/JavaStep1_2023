package chapter03.SWITCH;

public class SwitchCase06 {

	public static void main(String[] args) {
		// 오전9~오후6시까지
		int time=(int)(Math.random()*10)+9;
		System.out.println("[현재시간 : "+time+"시]");
		
		switch (time) {
		//case 1,2,3,4,5,6:{//version 14이후 가능함
		case 9: case 10: case 11: case 12: { 
			System.out.println("수업듣기");
			break;
		}
		case 13: case 14: {
			System.out.println("점심먹기");
			break;
		}
		case 15: case 16: case 17: {
			System.out.println("복습하기");
			break;
		}
		
		default:
			System.out.println("잠자기");
		}

	}

}
