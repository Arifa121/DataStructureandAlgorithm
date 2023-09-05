package DSA;

public class Circularlinkedlistdemo {

	public static void main(String[] args) {
		Circularlinkedlist<Integer> clist1=new Circularlinkedlist<Integer>();
		Circularlinkedlist<String> clist2=new Circularlinkedlist<String>();
		clist1.insertAtBeginning(1);
		clist1.insertAtBeginning(3);
		clist1.display();
		clist1.insertAtEnd(10);
		clist1.display();
		System.out.println("The deleted element is "+ clist1.deleteAtEnd());
		//System.out.println("The deleted element is "+ clist1.deleteAtBegin());
		clist1.display();
		//System.out.println("The deleted element is "+ clist1.deleteAtEnd());
		//System.out.println("The deleted element is "+ clist1.deleteAtBegin());
		clist1.display();
		//System.out.println("The deleted element is "+ clist1.deleteAtEnd());
		clist1.display();
		//System.out.println("The deleted element is "+ clist1.deleteAtEnd());
		clist1.deleteVal(3);
		clist1.deleteVal(1);
		clist1.insertAtBeginning(999999999);
		clist1.deleteVal(100);
		clist1.display();
		clist1.insertAfter(999999999,5);
		clist1.display();
		clist1.display();
	}

}
