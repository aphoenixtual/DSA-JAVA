package LinkedList;

public class LinkedListasQueueClient {
    public static void main(String[] args) throws Exception {

        LinkedListasQueue queue=new LinkedListasQueue();
        queue.enqueue(10);
        queue.display();

        queue.enqueue(20);
        queue.display();

        queue.enqueue(30);
        queue.display();

        queue.enqueue(40);
        queue.display();

        queue.enqueue(50);
        queue.display();

        System.out.println(queue.dequeue());
        queue.display();

        System.out.println(queue.dequeue());
        queue.display();


        System.out.println(queue.front());

        System.out.println(queue.size());



    }
}
