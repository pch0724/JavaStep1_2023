package chapter04;

import javax.swing.JOptionPane;

public class CharArray01 {

	public static void main(String[] args) {

		String str[] = {"홍길동", "김유신", "이순신", "장길산"};
		String res = "";
		
		for(int i=0; i <str.length; i++) {
			res += str[i]+"\n";
		}//for
		System.out.println(res);
		JOptionPane.showMessageDialog(null, "[영웅들] \n"+res);

	}//main

}//class
