package BinaryandGenericTree;

public class BinaryTree {
    private class Node{
        int data;
        Node left;
        Node right;
        Node(int data,Node left, Node right){
            this.data =data;
            this.left =left;
            this.right =right;
        }

       Node root = null;
        int size =0;

    }
}
