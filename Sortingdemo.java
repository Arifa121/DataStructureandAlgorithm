package DSA;

import java.util.Arrays;

public class Sortingdemo {
	public static void main(String args[]) {
		
		System.out.println("---------selection sort:-----------");
		int[] arr= {2,5,1,23,0,8,6};
		Sorting.selectionsort(arr);
		System.out.println(Arrays.toString(arr));
		int[] arr1= {22,53,1,213,10,8,61};
		Sorting.maxselection(arr1);
		System.out.println(Arrays.toString(arr1));
		System.out.println();
		
		System.out.println("----------bubbblee sort:-------------");
		int[] arr2= {212,513,11,2113,110,18,161};
		Sorting.bubblessort(arr2);
		System.out.println(Arrays.toString(arr2));
		System.out.println();
		
		System.out.println("--------insertion sort:--------------");
		int[] arr3= {212,513,11,2113,110,18,161};
		Sorting.insertionsort(arr3);
		System.out.println(Arrays.toString(arr3));
		System.out.println();
		
		System.out.println("-----------merge sort:----------------");
		int[] arr4= {212,513,11,2113,110,18,161};
		arr4=Sorting.mergesort(arr4);
		System.out.println(Arrays.toString(arr4));
		int[] arr5= {2,53,11,1,0,18,161};
		Sorting.mergesortinplace(arr5,0,arr5.length);
		System.out.println(Arrays.toString(arr5));
		System.out.println();
		
		System.out.println("quick sort:-");
		int[] arr6= {2,53,11,1,0,18,161};
		Sorting.quicksort(arr5,0,arr6.length-1);
		System.out.println(Arrays.toString(arr5));
		System.out.println();
	}

}
