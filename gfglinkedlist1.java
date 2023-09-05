package DSA;

public class gfglinkedlist1 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.insertAtBeginning(1);
		l.insertAtEnd(2);
		l.insertAtEnd(3);
		l.insertAtEnd(4);
		l.insertAtEnd(7);
		l.display();
		l.reverse();
		l.display();
		l.revsearchelebyindex(0);
	}

}
