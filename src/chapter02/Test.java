package chapter02;

public class Test {

	public static void main(String[] args) {
		//Q1 바이트 크기가 작은 자료형을 더 큰 자료형으로 대입하는 자동 형 변환의 코드 2가지 구현
		
		byte aNum=20;
		int bNum = aNum;
		
	    System.out.println(aNum);
	    System.out.println(bNum);			
	 
	   
	
	    
		
		//Q2 실수를 정수형 변수에 대입하는경우에 형변환이 자동으로 이루어지고 소수점 이하 부분이 없어지는 형변환 코드 2가지 구현
		
		
	    int bNum2=30;
		float fNum=bNum2;
		
		System.out.println("================");
		System.out.println(bNum2);
		System.out.println(fNum);
		
		
		
		//Q3 더 많은 실수를 표현하기 위해서 가수부와 지수부로 비트를 나누어 표현한 방식
		
		System.out.println("================");
		System.out.println("부동소수점");
		
		
		
		
		
		
		//Q4 변수 두개를 선언해서 10과 2.5을 대입하고 두 변수의 사칙 연산 결과를 정수로만 출력
		
		
       int aVal=10;
	   float bVal=2.5f;
	   
	   System.out.println("aVal + bVal : " + (int)(aVal + bVal));
		
		System.out.println("aVal - bVal : " + (int)(aVal - bVal)); //bVal= aVal-10;
		
	    
		System.out.println("aVal * bVal : " + (int)(aVal * bVal)); //bVal= aVal*10;
		
		
	   System.out.println("aVal / bVal : " + (int)(aVal / bVal)); //bVal= aVal/10;
	   
	  
		
		
		
		//Q5 '글'이라는 한글 문자의 유니코드 값을 찾아서 char형으로 선언한 변수에 저장한 뒤 그 변수를 출력
		
		
        char ch1='글';
		
		char ch2='\uAE00'; //유니코드 
		
		System.out.println("================");
		System.out.println(ch1);
		System.out.println(ch2);
		
	}

}
