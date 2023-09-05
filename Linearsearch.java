package DSA;

public class Linearsearch {
	public static int find(int[] arr, int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
	public static int[] find2d(int[][] arr,int target) {
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col]==target) {
					return new int[] {row,col};
				}
			}
		}
		return new int[] {-1,-1};
	}
	public static int findmax(int[] arr) {
		int max;
		if(arr.length>0)
		     max=arr[0];
		else {
		    System.out.print("since, empty array: ");
		    return -1;
		}
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
	public static int countcharinstring(String str,char c) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==c) {
				count++;
			}
		}
		return count;
	}
	public static int count4digitelement(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>999&&arr[i]<9999) {
				count++;
			}
		}
		return count;
	}

}
