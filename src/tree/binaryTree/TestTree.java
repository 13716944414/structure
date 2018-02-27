package tree.binaryTree;

import sun.applet.Main;

/**
 * @author jiangjiaxin
 * @date 2018-02-26 15:42
 */
public class TestTree {

    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        tree.insert(10, "十");
        tree.insert(15, "十五");
        tree.insert(5, "五");
        tree.insert(14, "十四");
        tree.insert(3, "三");
        tree.insert(90, "九十");
        tree.insert(1, "一");

        tree.inOrderTraversal(tree.getRoot());
        System.out.println();
        tree.delete(1);
        tree.inOrderTraversal(tree.getRoot());
    }

}
