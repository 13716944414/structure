package linkedList;

/**
 * @author jiangjiaxin
 * @date 2018-02-02 13:29
 */
public class Node {

    private String data;

    private Node next;

    private Node previous;

    public Node(){}

    public Node(String data){
        this.data = data;
    }

    public void display(){
        System.out.print(this.data);
    }

    public String getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
