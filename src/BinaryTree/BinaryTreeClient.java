package BinaryTree;

public class BinaryTreeClient {

    public static void main(String[] args) {

        // 10 true 20 true 40 false false true 50 false false true 30 false true 70
        // false false
        // 10 true 20 true 40 true 2 false false true 3 false false true -60 false false
        // true -30 true 50 true 60 true 80 false false false true 70 false false true
        // -100 false false
        // 10 true 20 true 40 true 170 false false true 80 false false true 50 false
        // false true 30 true 60 true 90 false false true 100 false false true 70 false
        // false

//		int[] pre = { 10, 20, 40, 50, 30, 70 };
//		int[] in = { 40, 20, 50, 10, 30, 70 };

//		int[] pre = { 100, 50, 25, 70, 60, 55, 65, 80, 90, 200, 150, 300 };
//		int[] in = { 25, 50, 55, 60, 65, 70, 80, 90, 100, 150, 200, 300 };

        int[] pre = { 10, 20, 40, 60, 70, 30, 50 };
        int[] in = { 40, 20, 60, 70, 10, 50, 30 };
        BinaryTree bt = new BinaryTree(pre, in);
        bt.display();

        System.out.println(bt.size());
        System.out.println(bt.max());
        System.out.println(bt.find(60));
        System.out.println(bt.ht());
        System.out.println(bt.leafNodesCount());

        System.out.println(bt.diameter1());
        System.out.println(bt.diameter2());
        System.out.println(bt.diameter3());

        System.out.println(bt.isBalanced1());
        System.out.println(bt.isBalanced2());
        System.out.println(bt.isBalanced3());

//		BinaryTree bt1 = new BinaryTree();
//		bt1.display();
//
//		System.out.println(bt.flipEquivalent(bt1));

        bt.display2();

        bt.preorder();
        bt.preorderI();

        System.out.println(bt.sum());

        System.out.println(bt.maxSubtreeSum1());
        System.out.println(bt.maxSubtreeSum2());
        System.out.println(bt.maxSubtreeSum3());

        bt.verticalTraversal();

        System.out.println(bt.isBST1());
        System.out.println(bt.isBST2());
        System.out.println(bt.isBST3());

        bt.largestBST();

        System.out.println(bt.verticalTraversal2());

    }

}