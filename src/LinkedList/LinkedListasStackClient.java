package LinkedList;

public class LinkedListasStackClient {
    public static void main(String[] args) throws Exception {

        LinkedListasStack stack = new LinkedListasStack();

        stack.push(10);
        stack.display();

        stack.push(20);
        stack.display();

        stack.push(30);
        stack.display();

        stack.push(40);
        stack.display();

        stack.push(50);
        stack.display();

        System.out.println(stack.pop());
        stack.display();

        System.out.println(stack.pop());
        stack.display();

        System.out.println("Top of the stack " + stack.top());

        System.out.println(stack.size());

    }
}
