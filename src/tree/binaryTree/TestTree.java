package tree.binaryTree;

/**
 * @author jiangjiaxin
 * @date 2018-02-26 15:42
 */
public class TestTree {

    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        tree.insert(10, "十");
        tree.insert(5, "五");
        tree.insert(4, "四");
        tree.insert(9, "九");
        tree.insert(100, "一百");
        tree.insert(50, "五十");
        tree.insert(25, "二十五");
        tree.insert(75, "七十五");
        tree.insert(150, "一百五十");
        tree.insert(125, "一百二十五");
        tree.insert(110, "一百一十");
        tree.insert(130, "一百三十");
        tree.insert(200, "二百");
        tree.insert(115, "一百一十五");


        tree.delete(100);
        tree.inOrderTraversal(tree.getRoot());
    }

}
