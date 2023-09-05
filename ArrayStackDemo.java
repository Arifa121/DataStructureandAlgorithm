package DSA;

public class ArrayStackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayStack<Integer> astack1=new ArrayStack<Integer>();
	/*	astack1.push(1);
		astack1.push(2);
		astack1.push(3);
		System.out.println("peek element "+astack1.peek());
		astack1.push(34);
		astack1.displays();
		System.out.println("popped "+astack1.pop());	
		System.out.println("popped "+astack1.pop());
		astack1.displays();
		System.out.println("popped "+astack1.pop());
		System.out.println("Is stack empty?  "+astack1.isEmpty());
		System.out.println("popped "+astack1.pop());
		System.out.println("Is stack empty?  "+astack1.isEmpty());
		ArrayStack<String> astack2=new ArrayStack<String>();
		astack2.push("arifa");
		astack2.push("shayan");
		astack2.displays(); */
		/*StackusingLinkedlist<Integer> sl1=new StackusingLinkedlist<Integer>();
		sl1.push(1);
		sl1.push(2);
		sl1.push(3);

		System.out.println("popped element: "+sl1.pop()); 
		System.out.println("popped element: "+sl1.pop());
		System.out.println("popped element: "+sl1.pop());
		//System.out.println("popped element: "+sl1.pop());
		sl1.push(3);
		System.out.println("popped element: "+sl1.pop());
		System.out.println("popped element: "+sl1.pop());*/
		QueueusLiL q3=new QueueusLiL();
		q3.enqueue(14);
		q3.enqueue(12);
		q3.enqueue(17);
	    q3.enqueue(8);
	    q3.enqueue(7); 
		System.out.println("dequeued element: "+q3.dequeue());
		System.out.println("dequeued element: "+q3.dequeue());
		System.out.println("dequeued element: "+q3.dequeue());
		System.out.println("dequeued element: "+q3.dequeue());
		System.out.println("dequeued element: "+q3.dequeue());
		
		System.out.println("dequeued element: "+q3.dequeue());
		Queueusingarray<Integer> q=new Queueusingarray<Integer>();
		q.enqueue(4);
		q.enqueue(2);
		q.enqueue(7);
		//q.enqueue(8);
		System.out.println("dequeued element: "+q.dequeue());
		System.out.println("dequeued element: "+q.dequeue());
		System.out.println("dequeued element: "+q.dequeue());
		System.out.println("dequeued element: "+q.dequeue());
		Queueusingarray2<Integer> q1=new Queueusingarray2<Integer>();
		q1.enqueue(33);
		q1.enqueue(12);
		q1.enqueue(723);
		System.out.println("dequeued element: "+q1.dequeue());
		System.out.println("dequeued element: "+q1.dequeue());
		System.out.println("dequeued element: "+q1.dequeue());
		System.out.println("dequeued element: "+q1.dequeue());
		Queueusingarray<String> q2=new Queueusingarray<String>();
		
	}

}
