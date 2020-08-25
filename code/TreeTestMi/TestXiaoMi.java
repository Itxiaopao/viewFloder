package TreeTestMi;

import java.util.concurrent.LinkedBlockingQueue;

public class TestXiaoMi {
    /**
     *      1
     *   2     3
     * 4  5  6   7
     *  8  9  10
     * 8是4的右子树
     * 9是5的右子树
     * 10是6的右子树
     * <p>
     * 输出顺序  1 2 3 4 5 6 7 8 9 10
     */
    public static void main(String[] args) {
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        TreeNode treeNode = initTreeNode();
//        printNode(treeNode);
        queue.offer(Integer.valueOf(treeNode.getKey()));
        pushQueue(queue, treeNode.getLeft(), treeNode.getRight());
        while (true) {
            Integer poll = queue.poll();
            if (null == poll) {
                break;
            }
            System.out.print(poll+" ");
        }
    }

    public static void pushQueue(LinkedBlockingQueue<Integer> queue, TreeNode leftNode, TreeNode rightNode) {
        if (null != leftNode) {
            queue.offer(Integer.valueOf(leftNode.getKey()));
        }
        if (null != rightNode) {
            queue.offer(Integer.valueOf(rightNode.getKey()));
        }
        if (null != leftNode) {
            pushQueue(queue, leftNode.getLeft(), leftNode.getRight());
        }
        if (null != rightNode) {
            pushQueue(queue, rightNode.getLeft(), rightNode.getRight());
        }
    }

    private static TreeNode initTreeNode() {
        TreeNode one = new TreeNode("1", null, null, null);
        TreeNode two = new TreeNode("2", null, null, one);
        TreeNode three = new TreeNode("3", null, null, one);
        TreeNode four = new TreeNode("4", null, null, two);
        TreeNode five = new TreeNode("5", null, null, two);
        TreeNode six = new TreeNode("6", null, null, three);
        TreeNode seven = new TreeNode("7", null, null, three);
        TreeNode eight = new TreeNode("8", null, null, four);
        TreeNode nine = new TreeNode("9", null, null, five);
        TreeNode ten = new TreeNode("10", null, null, six);

        one.setLeft(two);
        one.setRight(three);
        two.setLeft(four);
        two.setRight(five);
        three.setLeft(six);
        three.setRight(seven);
        four.setRight(eight);
        five.setRight(nine);
        six.setRight(ten);
        return one;
    }
    /**
     *      1
     *   2     3
     * 4  5  6   7
     *  8  9  10
     * 8是4的右子树
     * 9是5的右子树
     * 10是6的右子树
     * <p>
     * 输出顺序  1 2 3 4 5 6 7 8 9 10
     *
     * 先序(根左右): 1 2 4 8 5 9 3 6 10 7
     * 中序(左根右): 4 8 2 5 9 1 6 10 3 7
     * 后续(左右根): 8 4 9 5 2 10 6 7 3 1
     */
    public static void printNode(TreeNode treeNode) {
        if(null != treeNode.getLeft()){
            printNode(treeNode.getLeft());
        }
        if(null != treeNode.getRight()){
            printNode(treeNode.getRight());
        }
        if(null != treeNode) {
            System.out.print(treeNode.getKey()+" ");
        }else {
            return;
        }
    }
}
