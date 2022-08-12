package GenericTree;

public class GenericTreeClient {

    // 10 3 20 2 50 0 60 0 30 0 40 1 70 0
    public static void main(String[] args) {

        GenericTree gt = new GenericTree();
        gt.display();

//		System.out.println(gt.size());
//		System.out.println(gt.max());
//		System.out.println(gt.ht());
//		System.out.println(gt.find(600));

//		gt.mirror();
//		gt.display();
//
//		gt.printAtLevel(2);
//		gt.linearize();
//		gt.display();

		gt.display2();

        gt.preorder();
        gt.postorder();

        gt.levelOrder();

        gt.levelOrderLineWise();
        gt.levelOrderZigZag();
    }
}
