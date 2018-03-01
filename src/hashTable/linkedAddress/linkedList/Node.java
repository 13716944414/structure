package hashTable.linkedAddress.linkedList;

import hashTable.Info;

/**
 * @author jiangjiaxin
 * @date 2018-02-02 13:29
 */
public class Node {

    private Info info;

    private Node next;

    private Node previous;

    public Node(){}

    public Node(Info info){
        this.info = info;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public void display(){
        System.out.print(this.info.getName());
    }

    public Node getNext() {
        return next;
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
