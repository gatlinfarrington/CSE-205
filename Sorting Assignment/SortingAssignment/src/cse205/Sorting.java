// The methods in this package are adapted from the code provided with:
//   Java Foundations (2nd & 3rd ed) by  Lewis, DePasquale, & Chase
//   Algorithms (4th ed) by Sedgewick & Wayne

package cse205;

import java.util.ArrayList;
import java.util.List;

public class Sorting {

	// Helper methods
	// These operations will occur multiple times in our sorting methods,
	//   so we add methods for them here

	private static <T extends Comparable<T>> boolean less_than(T a, T b) {
		return (a.compareTo(b) < 0);
	}
	private static <T extends Comparable<T>> boolean less_than_equal(T a, T b) {
		return (a.compareTo(b) <= 0);
	}
	private static <T extends Comparable<T>> boolean greater_than(T a, T b) {
		return (a.compareTo(b) > 0);
	}
	private static void swap(Object[] a, int ii, int jj) {
		Object swap = a[ii];
		a[ii] = a[jj];
		a[jj] = swap;
	}
	public static <T extends Comparable<T>> boolean isSorted(T[]data){
		return isSorted(data, 0, data.length-1);
	}
	public static <T extends Comparable<T>> boolean isSorted(T[]data, int min, int max){
		for (int ii=min+1; ii<=max; ii++) {
			if (less_than(data[ii], data[ii-1]))
				return false;
		}
		return true;
	}

	// Selection Sort
	public static <T extends Comparable<T>> void selectionSort (T[] data) {
		selectionSort (data, 0, data.length-1);
	}

	public static <T extends Comparable<T>> 
		void selectionSort (T[] data, int min, int max) {

		int indexOfSmallest;  // Smallest element found this pass
		
		min = Math.max(min, 0);
		max = Math.min(max, data.length-1);
		
		// ii is the starting point for each pass
		for(int next=min; next <= max; next++ ) {
            indexOfSmallest = next;
            for (int scan=next+1; scan<=max; scan++) {
            	if (less_than(data[scan], data[indexOfSmallest])) {
            		indexOfSmallest = scan;
            	}
            }
            swap(data, indexOfSmallest, next);
		}

	}
	
    public static <T extends Comparable<T>> void insertionSort(T[] data) {
    	insertionSort(data, 0, data.length-1);
    }

    public static <T extends Comparable<T>> void insertionSort(T[] data, int min, int max)
    {
    	int start = Math.max(min,  1);
    	int end = Math.min(max,  data.length-1);
    	
        for (int current = start; current <= end; current++)
        {
            int position = current;
			
            // shift larger values to the right 
            while (position > 0 && greater_than(data[position-1],data[position]))
            {
                swap(data, position, position-1);
                position--;
            }
        }
    }

    public static <T extends Comparable<T>> void bubbleSort(T[] data) {
    	bubbleSort(data, 0, data.length-1);
    }
    public static <T extends Comparable<T>> void bubbleSort(T[] data, int min, int max) {
        int position, scan;
        
		min = Math.max(min, 0);
		max = Math.min(max, data.length-1);
		
        // position is the "stopping point" for each pass
        for (position = max; position >= min; position--)
        {
            for (scan = 0; scan < position; scan++)
            {
                if (greater_than(data[scan],data[scan+1]))
                    swap(data, scan, scan + 1);
            }
        }
    }

    
	public static <T extends Comparable<T>> void mergeSort(T[] data) {
		mergeSort(data, 0, data.length-1);
	}

	private static <T extends Comparable<T>> void mergeSort(T[] data, int min, int max) {
		if (min < max)
		{
			int mid = min + ((max - min) / 2);
			mergeSort(data, min, mid);
			mergeSort(data, mid+1, max);
			merge(data, min, mid, max);
		}
	}
	
	private static <T extends Comparable<T>> void merge(T[] data, int first, int mid, int last) {
		T[] temp = (T[])(new Comparable[data.length]);  // temp array
		
		// The two subarrays have already been sorted
		int first1 = first, last1 = mid;   // endpoints of first subarray
		int first2 = mid+1, last2 = last;  // endpoints of second subarray
		int index = first1;  // next index open in temp array
		
		//  Copy smaller item from each subarray into temp until one
		//  of the subarrays is exhausted
		// while both sub arrays have items left
		while (first1 <= last1 && first2 <= last2)
		{
			if (less_than(data[first1],data[first2]))
			{
				temp[index] = data[first1];
				first1++;
			}
			else
			{
				temp[index] = data[first2];
				first2++;
			}
			index++;
		}
		
		// Only one of the while loops below will execute
		//  Copy remaining elements from first subarray, if any
		while (first1 <= last1)
		{
			temp[index] = data[first1];
			first1++;
			index++;
		}
		
		//  Copy remaining elements from second subarray, if any
		while (first2 <= last2)
		{
			temp[index] = data[first2];
			first2++;
			index++;
		}
		
		//  Copy merged data into original array
		for (index = first; index <= last; index++)
			data[index] = temp[index];
	}

	public static <T extends Comparable<T>> void quickSort(T[] data) {
		quickSort(data, 0, data.length-1);
	}

	private static <T extends Comparable<T>> void quickSort(T[] data, int min, int max) {
		if (min < max)
		{
			// create partitions
			int indexofpartition = partition(data, min, max);
			
			// sort the left partition (lower values)
			quickSort(data, min, indexofpartition - 1);
			
			// sort the right partition (higher values)
			quickSort(data, indexofpartition + 1, max);
		}
	}
	private static <T extends Comparable<T>> void quickSort(T[] data, int min, int max, int cutoff) {
		if (min < max)
		{
			// create partitions
			int indexofpartition = partition(data, min, max);
			//if partition is smaller than cutoff, break the recursionP
			if(indexofpartition <= cutoff) {
				return;
			}
				// sort the left partition (lower values)
				quickSort(data, min, indexofpartition - 1, cutoff);
				
				// sort the right partition (higher values)
				quickSort(data, indexofpartition + 1, max, cutoff);
			
		}
	}

	public static <T extends Comparable<T>> int partition(T[] data, int min, int max) {
		T partitionelement;
		int left, right;
		int middle = min + ((max - min) / 2);
		
		// use the middle data value as the partition element
		partitionelement = data[middle];
		// move it out of the way for now
		swap(data, middle, min);
		
		left = min;
		right = max;
		
		while (left < right)
		{
			// search for an element that is > the partition element
			while (left < right && less_than_equal(data[left],partitionelement))
				left++;
			
			// search for an element that is < the partition element
			while (greater_than(data[right], partitionelement))
				right--;
			
			// swap the elements
			if (left < right)
				swap(data, left, right);
		}
		
		// move the partition element into place
		swap(data, min, right);
		
		return right;
	}

	// Project 7 - Complete the following methods
	
	public static <T extends Comparable<T>> void sort(T[] data) {
		bubbleSort(data);
	}
	
	public static <T extends Comparable<T>> void cutoff_qsort(T[] data) {
		//call method below using arbitrary cutoff, i picked 5
		cutoff_qsort(data, 5);
	}

	public static <T extends Comparable<T>> void cutoff_qsort(T[] data, int cutoff) {
		//call below with beginning and end of array
		cutoff_qsort(data, 0, data.length - 1, cutoff);

	}
	
	private static <T extends Comparable<T>> void cutoff_qsort(T[] data, int min, int max, int cutoff) {
		//i implemented a new quicksort method that compares the partition size to the cutoff and breaks the recursion when the partition is smaller than the cutoff
		quickSort(data, min, max, cutoff);
		bubbleSort(data);
		
//		mergeSort(data);
	}
	
	public static List<Integer> closestPair(Integer[] data) {
		List<Integer> ret = new ArrayList<Integer>();
		quickSort(data);
		//variables
		int curClosest1 = 0, curClosest2 = 0;
		//the biggest gap we can have is the max dist between integers
		int curDistance = Integer.MAX_VALUE;
		
		for(int i = 0; i < data.length - 1; i++) {
			//if two next two each other have a distance of less than the current closest cards
			if(data[i + 1] - data[i] < curDistance) {
				//store the new values
				curClosest1 = data[i+1];
				curClosest2 = data[i];
				curDistance = data[i+1] - data[i];
			}
		}
		//add the vals to the return arrayList
		ret.add(curClosest2);
		ret.add(curClosest1);
		
		return ret;
	}

}
