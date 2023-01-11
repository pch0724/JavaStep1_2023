package chapter04;

public class TwoDimension01 {

	public static void main(String[] args) {

		int arr[][]=new int[2][3];
		int n = 0;
		
		for(int i =0; i < arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				n++;
				System.out.print((arr[i][j] = n) + " "); // n++ 리터널 넣고 출력
			}//in for
			System.out.println();
		}//for
		
		System.out.println("------------------------------------------");
		System.out.println(arr.length);//행
		System.out.println(arr[0].length);//0행의 열
		System.out.println("------------------------------------------");
		
		int arr1[][]= {{7,8,9},{10,11,13}}; // 1,2,3 = 0행 / 4,5,6 = 1행
		
		for(int k=0; k < arr1.length; k++) {
			for(int l=0; l < arr1[k].length; l++) {
				System.out.print(arr1[k][l] + " ");
			}
			System.out.println();
		}
	}//main

}//class
