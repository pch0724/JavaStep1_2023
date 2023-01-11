package chapter03.IF.SWITCH;

public class SwitchCase01 {

	public static void main(String[] args) {

		int ranking = (int)(Math.random()*10)+1;
		char medalColor;
		
		switch (ranking) {
		case 1: 
			medalColor = 'G';
			break;
		case 2:
			medalColor = 'S';
			break; // break가 없으면 아래 라인까지 다 읽고 아래 케이스의 값 산출
		case 3:
			medalColor = 'B';
			break;			
		default: // 나머지 값에 대한 value //default 이후의 값이 없기 때문에 break 없어도 무방
			medalColor = 'A';
		}
		
		System.out.println(ranking + "등 메달은 " + medalColor + "입니다.");
	}

}
