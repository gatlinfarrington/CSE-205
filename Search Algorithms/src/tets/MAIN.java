package tets;

import java.util.Random;

public class MAIN {
	public static void main(String[] args) {
		int[] arr = new int[10];	
		randomArray(arr);
		
		SearchAlgo t = new SearchAlgo();
		
		t.selectSort(arr);
		t.printArray(arr);
	}
	
	public static void randomArray(int[] arr) {
		Random rand = new Random();
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(101);
		}
		
	}

}
