package DSA;

public class Queueusingarray2<T> {
	
	    static final int MAX_SIZE = 10;
	    T arr[];
	    int front, rear;

	    Queueusingarray2() {
	        arr = (T[]) new Object[MAX_SIZE];
	        // Initialize instance variable front
	        rear = -1;  // Initialize instance variable rear
	    }

	    public void enqueue(T val) {
	        if (rear == MAX_SIZE - 1)
	            throw new IndexOutOfBoundsException("Queue is full");
	        arr[++rear] = val;
	    }

	    public T dequeue() {
	        if (rear == -1) {
	            throw new IndexOutOfBoundsException("Queue is empty");
	        }
	        T temp=(T) arr[0];
	        
	        for(int i=1;i<=rear;i++) {
	        	arr[i-1]=arr[i];
	        }
	        rear--;
	        return temp;
	        
	    }
	}


