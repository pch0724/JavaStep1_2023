package chapter03.IF;

public class IfExample06 {

	public static void main(String[] args) {

		int num = (int) (Math.random() * 6) + 1;
		String x;

		// 1점 ~ 6점까지 받을 수 있음 각 점수당 분식 쏘기
		if (num == 1) {
			x = "순대";
		} else if (num == 2) {
			x = "떡볶이";
		} else if (num == 3) {
			x = "어묵";
		} else if (num == 4) {
			x = "튀김";
		} else if (num == 5) {
			x = "김밥";
		} else {
			x = "계란말이";
		}
		System.out.println(num + "점 => " + x + "입니다.");
	}//main

}//class
