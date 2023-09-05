
/* list implementation using array - generic
 * 
 */

package DSA;

import java.util.*;
class DynamicArray<T> implements Iterable<T>{//variables - method
	private T arr[];
	private static final int initialcapacity=3;
	private int size;
	private int sizes;
	private int capacity;
	@SuppressWarnings("unchecked") //annotation meta data maari thaa it not significant 
	DynamicArray(){ //constructor will call when when object is creating for dynamic array class
		size=sizes=0;
		arr=(T[])new Object[initialcapacity];
		capacity=initialcapacity;
	}
	public void add(T val) {
		if(size==capacity) {
			expandArray();
		}
		else {
		 arr[size++]=val;  //or arr[size++]=val;
		 sizes++;
		} 
	}
	private void expandArray(){
		capacity=capacity*2;
		arr= java.util.Arrays.copyOf(arr, capacity);
	}
	public void display() {
		int h=length();
		System.out.print( "Current Length of the list: "+h);
		System.out.print( " Elements in the list are: ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	 }
	public void insertAt(int pos,T val) {
		if(size==capacity) {
			expandArray();		
		}
		for(int i=size-1;i>=pos;i--) 
			arr[i+1]=arr[i];
		arr[pos]=val;
		size++;
		sizes++;
	}
	public void insertAtbegin(T val) {
		int pos=0;
		insertAt(pos,val);
	}
	public void deleteAtPos(int pos) {
		 for(int i=pos+1;i<size;i++) 
			 arr[i-1]=arr[i];
		 size--;
		 sizes--;    
		 if(capacity > initialcapacity && capacity > 2*size) {
			 shirinkArray();
		 }
	}
	private void shirinkArray() {
		capacity/=2;
		arr=java.util.Arrays.copyOf(arr, capacity);
	}
	public void deleteAtEnd() {
		if(sizes<=0) {
			System.out.println("list is empty");
		}
		else {
			int pos=sizes-1;
			deleteAtPos(pos);
		}
	}
	public void deleteAtBegin() {
		if(sizes<=0) {
			System.out.println("list is empty");
		}
		else {
		  int pos=0;
		  deleteAtPos(pos);
		}
	}
	public int length() {
		return size;
	}
	public void getIndex(int index) {
		System.out.println(arr[index]);
	}
	public void search(T val) {
		int count=0;
			for(int i=0;i<size;i++) {
				if(arr[i]==val) {
					System.out.println(val+" element found at index "+i);
					count++;
				}
			}
			if(count==0) {
				System.out.println(val+" not present in the list ");
			}
			
		}
	public void clear(){
		size=0;
	}
	@Override
	public Iterator<T> iterator(){
		return new Iterator<T>() { //enna kuduthurkana new iterator nu solli object onnu venum andha class ingaye define panra   
			int index=0;
			public T next() {
				return arr[index++];
			}
			
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return index < size;
			}
			
		};
		
	}
	
	}
public class ListDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int val,pos;
		DynamicArray<Integer> l1=new DynamicArray<Integer>();
		while(true) {
			System.out.println("---------------------------------------LIST MENU------------------------------------------");
			System.out.println();
			System.out.println("1.INSERT AT END");
			System.out.println("2.INSERT AT BEGIN");
			System.out.println("3.DISPLAY");
			System.out.println("4.INSERT AT SPECIFIED POSITION");
			System.out.println("5.DELETE FROM SPECIFIED POSITION");
			System.out.println("6.DELETE AT BEGIN");
			System.out.println("7.DELETE AT END");
			System.out.println("8.LENGTH OF ARRAY");
			System.out.println("9.GET INDEX");
		    System.out.println("10.SEARCH AN ELEMENT");
		    System.out.println("11.CLEAR");
			System.out.println("12.EXIT");
			System.out.println();
			System.out.println("------------------------------------------------------------------------------------------");
			System.out.println("ENTER YOUR CHOICE");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:System.out.println("Enter the data: ");
			       val=sc.nextInt();
			       l1.add(val);
			       break;
			case 2:System.out.println("Enter the data: ");
			       val=sc.nextInt();
				   l1.insertAtbegin(val);
				   break;
			case 3://l1.display();
			       for(int e: l1) {
			    	   System.out.println(e);
			       }
			       break;
			case 4:System.out.println("Enter the position starts at 0: ");
			       pos=sc.nextInt();
			       if(pos<0) {
			    	   System.out.println("Invalid position); ");
			    	   break;
			       }
				   System.out.println("Enter the data: ");
				   val=sc.nextInt();
				   l1.insertAt(pos,val);
				   break;
			case 5:int l=l1.length();
			       int v=l-1;
			       if(l<=0) {
			    	   System.out.println("list is empty");
			    	   break;
			       }else {
			    	   System.out.println("Enter the position starts at 0 to " +v+": ");
			           pos=sc.nextInt();
			           if(pos<0) {
			    	      System.out.println("Invalid position); ");
			    	       break;
			           }
			    	   l1.deleteAtPos(pos);
			           break;
			       }
			case 6:l1.deleteAtBegin();
			      break;
			case 7:l1.deleteAtEnd();
			       break;
			case 8:int m=l1.length(); 
			       System.out.println("Current Length of the list is "+ m);
			       break;
			case 9:l=l1.length();
		           v=l-1;
		           if(l<=0) {
			    	   System.out.println("list is empty");
			    	   break;
			       }else {
		               System.out.println("Enter index from 0 to "+v+":");
		               int index=sc.nextInt();
		        	   l1.getIndex(index);
		        	   break;
		           }
			case 10:l=l1.length();
	                v=l-1;
	                if(l<=0) {
		    	       System.out.println("list is empty");
		    	        break;
		             }else {
		            	 System.out.println("Enter the element to be search: ");
		            	  val=sc.nextInt();
				           l1.search(val);
			              break;
		             }
			case 11:l1.clear();
			        break;
			case 12:System.exit(0);
			default:System.out.println("Invalid option");
			}
			
		}
		

	}

}
