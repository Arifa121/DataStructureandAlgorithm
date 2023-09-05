package DSA;

import java.util.Arrays;

public class Sorting {
	public static void selectionsort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			//int min=arr[i];
			int minindex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minindex]) {
					//min=arr[j];
					minindex=j;
			    }
			}
				int temp=arr[i];
				//arr[i]=min;
				arr[i]=arr[minindex];
				arr[minindex]=temp;
			
			
		}
	}
    public static void maxselection(int[] arr) {
    	for(int i=arr.length-1;i>=0;i--) {
    		int maxindex=i;
    		for(int j=i-1;j>=0;j--) {
    			if(arr[j]>arr[maxindex]) {
    				maxindex=j;
    			}
    		}
    		int temp=arr[i];
    		arr[i]=arr[maxindex];
			arr[maxindex]=temp;
    		
    		
    	}
    }
    public static void bubblessort(int[] arr) {
    	for(int i=1 ;i<arr.length;i++) {
    		for(int j=0;j<arr.length-i;j++){
    			if(arr[j]>arr[j+1]) {
    				int temp=arr[j];
    				arr[j]=arr[j+1];
    				arr[j+1]=temp;
    			}
    		}
    	}
    }
    public static void insertionsort(int[] arr) {
    	//{212,513,11,2113,110,18,161};
    	for(int i=1;i<arr.length;i++) { //number choosing 
    		for(int j=i;j>0;j--) {
    			if(arr[j]<arr[j-1]) {
    				int temp=arr[j];
    				arr[j]=arr[j-1];
    				arr[j-1]=temp;
    				
    			} 
    			else {
    				break; //inner loop stop                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
    			}
    		}
    	}
    }
    public static int[] mergesort(int[] arr) {
    	//{212,513,11,2113,110,18,161};
    	if(arr.length==1) {
    		return arr;
    	}
    	else {
    		int mid=(arr.length)/2;
    		int[] left=mergesort(Arrays.copyOfRange(arr, 0, mid));
    		int[] right=mergesort(Arrays.copyOfRange(arr, mid, arr.length));
    	    return join(left,right);
    	}
    }
    public static int[] join(int[] first,int[] second) {
    	int[] joined=new int[first.length+second.length];
    	int i=0,j=0,k=0; 
    	while(i<first.length&&j<second.length) {
    			if(first[i]<second[j]) 
    				joined[k++]=first[i++];	
    			
    			else
    				joined[k++]=second[j++];
    			
    		}
    	while(i<first.length) 
    		joined[k++]=first[i++];
    	
    	while(j<second.length) 
    		joined[k++]=second[j++];       
    	
    	
    	return joined;
    	}
    public static void mergesortinplace(int[] arr,int start, int end) {
    	//{212,513,11,2113,110,18,161};
    	if(end-start==1) {
    		return;
    	}
    	else {
    		int mid=(start+end)/2;
    		mergesortinplace(arr, start, mid);
    		mergesortinplace(arr, mid, end);
    	    joininplace(arr,start,mid,end);
    	}
    }
    public static void joininplace(int[] arr,int start,int mid,int end) {
    	int[] joined=new int[end-start];
    	int i=start,j=mid,k=0; 
    	while(i<mid&&j<end) {
    			if(arr[i]<arr[j]) 
    				joined[k++]=arr[i++];	
    			
    			else
    				joined[k++]=arr[j++];
    	   
    		}
    	while(i<mid) 
    		joined[k++]=arr[i++];
    	
    	while(j<end) 
    		joined[k++]=arr[j++];  
    	for( k=0;k<joined.length;k++) {
    		arr[start+k]=joined[k];
    	}
    }
    
    public static void quicksort(int[] arr,int low,int high) {
    	if(low>=high) {
    		return;
    	}
    	int start=low;
    	int end=high;
    	int mid=(start+end)/2;
    	int pivot=arr[mid];
    	while(start<=end) {
    		while(arr[start]<pivot)
    			start++;
    		while(arr[end]>pivot)
    			end--;
    		if(start<=end) {
    			int temp=arr[start];
    			arr[start]=arr[end];
    			arr[end]=temp;
    			start++;
    			end--;	
    		}
    	}
    	quicksort(arr,low,end);
    	quicksort(arr,start,high);
    }
  }

