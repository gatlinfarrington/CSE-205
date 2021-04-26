

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
	
	public void bubbleSort(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j< n - 1 - i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			
			}
		}
	}
	
	public void quickSort(int[] arr, int begin, int end) {
		if(begin < end) {
			int partIndex = partition(arr, begin, end);
			
			quickSort(arr, begin, partIndex - 1);
			quickSort(arr, partIndex+1, end);
		}
	}
	
	private int partition(int[] arr, int begin, int end) {
		int center = arr[end];
		int i = (begin - 1);
		
		for(int j = begin; j < end; j++) {
			if(arr[j] <= center) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[end];
		arr[end] = temp;
		
		return i+1;
	}
	
	//log(n)n time
	public void mergeSort(int[] arr, int l, int r) {
		if(l < r) {
			int m = l+(r-1)/2;
			
			mergeSort(arr, l,m);
			mergeSort(arr, m+1, r);
			
			sort(arr, l, m, r);
		}
	}
	
	private void sort(int[] arr, int l, int m, int r) {
		int n1 = m-l+1;
		int n2 = r-m;
		
		int left[] = new int[n1];
		int right[] = new int[n2];
		
		for(int i = 0; i < n1; i++) {
			left[i] = arr[l+i];
		}
		for(int i = 0; i < n2; i++) {
			right[i] = arr[m+l+i];
		}
		int i = 0, j = 0, k = l;
		while(i < n1 && j<n2) {
			if(left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			}else {
				arr[k] = right[j];
				j++;
			}
		}
		while(i<n1) {
			arr[k] = left[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k] = left[i];
			j++;
			k++;
		}
	}
	public void printArray(int arr[]) {
		int n = arr.length;
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
}
