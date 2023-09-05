package DSA;

public class QueueusLiL {
	Node front,rear;
	class Node{
		int data;
		Node next;
		Node(int val){
			data=val;
			next=null;
		}
	}
	QueueusLiL(){
		front=null;
		rear=null;
	}
	
	public void enqueue(int val) {
		Node newnode=new Node(val);
		if(rear==null) {
			front=newnode;
			rear=newnode;
			return;
		}
		else {
			rear.next=newnode;
			rear=newnode;
		}	
	}
	public int dequeue() {
		if(front==null) {
			throw new IndexOutOfBoundsException("queue is empty or underflow");
		}
		int temp=front.data;
		front=front.next;
		if(front==null) {
			rear=null;
		}
		return temp;
	}
      
}
