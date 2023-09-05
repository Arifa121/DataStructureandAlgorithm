package DSA;

public class StackusingLinkedlist<T> {
		class Node{
			T data;
			Node next;
			Node(T val){
				data=val;
				next=null;		
			}
		}
		Node top;
		StackusingLinkedlist(){
		    top=null;
		}
		public void push(T val) {
			Node newnode=new Node(val);
			newnode.next=top;
			top=newnode;
		}
		public T pop() {
			if(top==null) {
				throw new IndexOutOfBoundsException("stack is empty or underflow");
			}
			else {
				Node temp=top;
				top=temp.next;
				return temp.data;
				
			}
		}

	}


