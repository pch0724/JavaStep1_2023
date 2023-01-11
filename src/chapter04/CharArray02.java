package chapter04;

public class CharArray02 {

	public static void main(String[] args) {

		char alphabets[] = new char[26];
		char ch= 'A'; //65
		/*
		for(int i = 0;i < alpahabets.length ;i++) {
			alphabets[i] = ch++;
			System.out.print(alphabets[i] + " ");
		}//for
		*/
		for(int i = 0;i < alphabets.length ;i++, ch++) {
			alphabets[i] = ch;
			System.out.println("("+alphabets[i] + "," + (int)alphabets[i] + ")");
		}//for
	}//main

}//class
