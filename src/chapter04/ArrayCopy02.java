package chapter04;

public class ArrayCopy02 {

	public static void main(String[] args) {

		Book bk = new Book();
		
		//bookArray1 배열 3개 선언
		Book[] bookArray1 = new Book[3];
		//bookArray1 배열 3개 선언
		Book[] bookArray2 = new Book[3];
		
		//초기화
		bookArray1[0] = new Book("데미안", "헤르만 헤세");
		bookArray1[1] = new Book("빨간머리앤", "몽고메리");
		bookArray1[2] = new Book("백설공주", "그림형제");
		
		System.out.println("---------원본(bookArray1)-----------");
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showBookinfo();
			System.out.println();
		}
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		System.out.println("---------복본(bookArray2)-----------");
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookinfo();
			System.out.println();
		}
		
		//=======================================================
		System.out.println();
		bookArray1[0].setBookname("나목");
		bookArray1[0].setAuthor("박완서");
		
		System.out.println("---------원본변경(bookArray1)-----------");
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showBookinfo();
			System.out.println();
		}
		
		System.out.println("---------복본(bookArray2)-----------");
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookinfo();
			System.out.println();
		} // 복사 후 원본이 변경될 시 복사본도 변경된다.
		
	}

}
