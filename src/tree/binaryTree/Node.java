package tree.binaryTree;

/**
 * @author jiangjiaxin
 * @date 2018-02-26 15:24
 */
public class Node {

    /**
     *    学号
     *
     * @author jiangjiaxin
     * @date 2018-02-27 14:27
     * @param
     * @return
     */
    private int number;

    /**
     *    姓名
     *
     * @author jiangjiaxin
     * @date 2018-02-27 14:27
     * @param
     * @return
     */
    private String name;

    /**
     *    左子节点
     *
     * @author jiangjiaxin
     * @date 2018-02-27 14:27
     * @param
     * @return
     */
    private Node leftChild;

    /**
     *    右子节点
     *
     * @author jiangjiaxin
     * @date 2018-02-27 14:27
     * @param
     * @return
     */
    private Node rightChild;

    public Node(int number) {
        this.number = number;
    }

    public Node(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}
