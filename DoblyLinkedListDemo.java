package DSA;

public class DoblyLinkedListDemo {
	public static void main(String args[]) {
		DoublyLinkedList<Integer> dlist1=new DoublyLinkedList<Integer>();
		
        
	    
		dlist1.insertAtBeginning(3);
		dlist1.insertAtBeginning(9);
		dlist1.insertAtBeginning(19);
		dlist1.insertAtBeginning(43);
		//dlist1.display();
		//dlist1.deleteAtpos(0);
		dlist1.display();
		System.out.println("length of dlist1 is "+dlist1.length());
		//list1.insertAtpos(0, 10);
		//list1.display();
		/*dlist1.deleteAtpos(0);
		dlist1.display();
		dlist1.revdisplay();
		dlist1.insertAtpos(0,4);
		dlist1.insertAtBeginning(5);
		dlist1.insertAtBeginning(3);
		dlist1.display();
		dlist1.deleteAtpos(0);*/
		//dlist1.deleteAtbeginning();
		
		System.out.println(dlist1.iscontains(2));
		System.out.println(dlist1.iscontains(3));
		dlist1.search(19);
		dlist1.deleteAtpos(2);
		dlist1.display();
		System.out.println("length of dlist1 is "+dlist1.length());
		//dlist1.deleteAtbeginning();
		dlist1.display();
		//dlist1.deleteAtbeginning();
		//dlist1.insertAtpos(4, 89);
		//list1.display();
		//dlist1.display();
		//dlist1.insertAtpos(6, 629);
		dlist1.deleteAtend();
		dlist1.display();
		dlist1.deleteAtbeginning();
		dlist1.display();
		dlist1.deleteAtbeginning();
		dlist1.display();
		System.out.println("length of dlist1 is "+dlist1.length());
		dlist1.insertAtBeginning(43);
		System.out.println("length of dlist1 is "+dlist1.length()); // 
	}

}
