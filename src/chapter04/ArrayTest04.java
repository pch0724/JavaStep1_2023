package chapter04;

public class ArrayTest04 {

	public static void main(String[] args) {

		double[] data = new double[5];
		
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		data[3] = 40.0;
		data[4] = 50.0;

		double total = 1.0;
		
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
			total *= data[i];			
		}
		System.out.println("total: " + total);
	}

}
