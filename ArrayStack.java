package DSA;

public class ArrayStack<T> {
	
		private static final int MAX_SIZE=30;
		private T arr[]=(T[])new Object[MAX_SIZE];
		private int top;
		ArrayStack() {
			top=-1;
		}
		public void push(T val) {
			if(top==MAX_SIZE-1) {
			    throw new IndexOutOfBoundsException("stack is full or overflow");
			}
			arr[++top]=val;
		}
		public T pop() {
			if(top==-1) {
				throw new IndexOutOfBoundsException("stack is empty or underflow");
			}
			return arr[top--];
		}
	/*	public void display() {
			for(int ele: arr) {
				System.out.print(ele+" ");
			}
			System.out.println();
		}*/
		public void displays() {
			for(int i=0;i<=top;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		public T peek() {
			return arr[top];
		}
		public boolean isEmpty() {
			if(top==-1) 
			      return true;
			return false;
			
		}
}

	
