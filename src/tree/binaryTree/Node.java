package tree.binaryTree;

/**
 * @author jiangjiaxin
 * @date 2018-02-26 15:24
 */
public class Node {

    private int number;

    private String name;

    private Node leftChild;

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
