package DSA;
public class Queueusingarray<T> {
    static final int MAX_SIZE = 10;
    T arr[];
    int front, rear;

    Queueusingarray() {
        arr = (T[]) new Object[MAX_SIZE];
        front = -1; // Initialize instance variable front
        rear = -1;  // Initialize instance variable rear
    }

    public void enqueue(T val) {
        if (rear == MAX_SIZE - 1)
            throw new IndexOutOfBoundsException("Queue is full");

        if (front == -1)
            front++;
        arr[++rear] = val;
    }

    public T dequeue() {
        if (front == -1) {
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        else if(front>rear)
        	throw new IndexOutOfBoundsException("Queue is empty");
        return arr[front++];
    }
}
