package tets;

public class SearchAlgo {
	
	public void selectSort(int arr[]) {
		int n = arr.length;
		
		for(int i = 0; i < n-1; i++) {
			int min = i;
			for(int j = i+1; j< n; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
			}
		}
	}
	
	
	public void printArray(int arr[]) {
		int n = arr.length;
		for(int i = 0; i < n-1; i++) {
			if(i != arr.length-1) {
				System.out.print(arr[i] + ", ");
			}else {
				System.out.print(arr[i]);
			}
		}
	}
}
