package chapter04.Example;

public class Example01 {

	public static void main(String[] args) {
		//for문을 이용하여 다음 배열의 점수를 줄단위로 평균을 구하시오
		int[][]array = {{95,86},{83,92,96},{78,83,93,87,88}};
		
		int sum = 0;
		double avg = 0;
		int total = 0;
		int cnt = 0;
		int count = 0;
		/*
		for(int i=0; i<array.length; i++) {
			for(int j=0; j< array[i].length; j++) {
				count = array[i].length;
				sum += array[i][j];
				avg = sum/(double)count;
				cnt++;
			}//in for
			System.out.println("["+i+"] 행의 총점 : " + sum);
			System.out.println("["+i+"] 행의 평균 : " + Math.round(avg));
			total += sum;
			sum = 0; 
			System.out.println();
		}//for
		System.out.println("전체 총점 : " + total);
		System.out.println("전체 평균 : " + total/(double)cnt);
		*/
		/*
		double avg = 0;
		int total = 0;
		
		int count = 0;
		
		int sum[] = new int [3];
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				sum[i] += array[i][j];
				count++;
			}//in for
			System.out.println("[" + i + "] 행의 합 : " + sum[i]);
			System.out.println("[" + i + "] 행의 평균 : " + (sum[i]/count));
			count=0;
		}//for
		*/
		
		for(int[]num : array) { //95, 86
			for(int score : num) { //95 // 86 
				total += score;
			}//in for
			count++;
			System.out.println(count + "번째 줄 학생의 합계 : " + total);
		}//for
	}//main

}//class
