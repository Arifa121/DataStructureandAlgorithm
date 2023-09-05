package DSA;

import java.util.Iterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> list1=new LinkedList<Integer>();
		LinkedList<String> list2=new LinkedList<String>();
        
	    
		list1.insertAtBeginning(3);
		list1.insertAtBeginning(9);
		list1.display();
		//System.out.println();
		list1.insertAtpos(1, 5);
		list1.insertAtpos(2, 1);
		list1.insertAtpos(6, 5);
		list1.display();
		//System.out.println();
		list1.deleteAtpos(2);
		list1.display();
		list1.deleteAtpos(0);
		//System.out.println();
		list1.display();
		list1.deleteAtpos(2);
		list1.display();
		//list1.deleteAtbeginning();
		list1.insertAtBeginning(4);
		list1.insertAtBeginning(7);
		list1.insertAtBeginning(2);
		list1.display();
		list1.get(4);
		list1.get(5);
	    list1.get(6);
	    list1.deleteAtend();
	    list1.display();
	    list1.update(2,10);
	    list1.display();
	    list1.update(0,100);
	    list1.update(3,100);
	    list1.display();
	    list1.insertAtEnd(48);
	    list1.display();
		list1.search(10);
		list1.search(394);
		System.out.println("is element 4 is present in list?"+list1.iscontains(4));
		list2.insertAtBeginning("ayisha");
		list2.insertAtBeginning("arifa");
		list2.insertAtBeginning("fathima");
		list2.insertAtBeginning("arifa");
		list2.display();
		list2.deleteAtend();
		list2.deleteAtbeginning();
		list2.display();
		for(int a: list1) {
			System.out.print(a+" ");
		}
		System.out.println();
		Iterator<String> it=list2.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
	    list1.reverse();
	    list1.display();
	}

}
