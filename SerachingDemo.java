package DSA;

import java.util.Arrays;

public class SerachingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[]{1,6,2,7,100,3,35};
		int arr1[][]={
				{1,2,3,4,5,8},
				{4,22,32,42,52,81},
				{111,122,123,124,35,68}
				
		};
		int arr3[]=new int[]{1,3,5,7,100,222,305};
		int arr4[]=new int[]{100,99,88,66,33,22};
		int[] result=Linearsearch.find2d(arr1,68);  
		int[] result1=Linearsearch.find2d(arr1,0);
		System.out.println(Arrays.toString(result1));
		System.out.println(Linearsearch.find(arr,8));
		System.out.println(Linearsearch.find(arr,9));
		System.out.println(Linearsearch.findmax(arr));
		System.out.println("binary search:"+BinarySearch.search(arr4, 33));
		System.out.println(Linearsearch.countcharinstring("aashifaa",'a'));
		int arr2[]=new int[]{1,6,2,7,1000,3223,3533};
		System.out.println(Linearsearch.count4digitelement(arr2));
		
		

	}

}
