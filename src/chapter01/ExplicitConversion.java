package chapter01;

public class ExplicitConversion {

	public static void main(String[] args) {
		// 캐스팅 문법(명시적 형변환)
		
		int iNum = 1000;
		byte bNum = (byte)iNum; //byte 범위 : -128 ~ 127
		
		System.out.println(iNum);
		System.out.println(bNum); //유실된 결과값(손실)
		System.out.println("=====================");
		
		
		double dNum1 = 1.2; //8byte => 묵시적으로 4byte
		float fNum1 = 0.9f; // 4byte
		
		int iNum2 = (int)(dNum1 + fNum1);
		int iNum3 = (int)dNum1 + (int)fNum1;
		
		System.out.println(iNum2); //원래 결과값: 2.1 출력 결과값: 2
		System.out.println(iNum3); //원래 결과값: 2.1 출력 결과값: 1
		// 캐스팅 단위에 따라 값도 달라질 수 있음
	}

}
