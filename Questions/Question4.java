package Questions;

import java.util.Random;

public class Question4 {
	public static void main(String[] args) {
		int[] intArray=new int[100];
		Random random = new Random(); 
		for(int iterator=0;iterator<100;iterator++) {
			intArray[iterator]=random.nextInt(1000);
		}

		for(int i=0;i<100;i++) {
			System.out.print(intArray[i]+" ");
		}
		System.out.println();
		for(int i:intArray) {
			System.out.print(i+" ");
		}

	}
}
