package queue;

public class Main {

    public static void main(String[] args) {

        Queue myQueue = new Queue(2);
        myQueue.enqueue(1);
        myQueue.enqueue(3);
        myQueue.enqueue(34);
        myQueue.enqueue(42);
        myQueue.enqueue(24);

        myQueue.dequeue();
        myQueue.printQueue();
    }

}
