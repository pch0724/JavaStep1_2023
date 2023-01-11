package chapter01;

public class BinaryTest2 {

	public static void main(String[] args) {
        //파스칼 기법 : 변수선언 시 첫글자는 무조건 대문자 
		//카멜 기법 : 변수선언 시 첫글자 무조건 소문자 중간단어의 첫자 대문자 
		int num = 10;
		int	bNum = 0B1000; //Binary 즉 2진수(0B)
		int oNum = 010; //8진수(OCT) 

		int bNum2 = 0B10000;
		int hNum = 0X10; //16진수(Hex)
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);		
		System.out.println(bNum2);
		System.out.println(hNum);
		
		
	}
}
