package linkedList;

/**
 *    双向链表
 *
 * @author jiangjiaxin
 * @date 2018-02-06 10:43
 * @param
 * @return
 */
public class BothWayLinkedList {

    private Node head;

    public Node end;

    private int element;

    public BothWayLinkedList() {
        this.head = new Node();
    }

    /**
     *    从链表前端插入
     *
     * @author jiangjiaxin
     * @date 2018-02-07 15:50
     * @param
     * @return
     */
    public void addNodeFromFront(String data){
        Node node = new Node(data);
        Node temp = head.getNext();
        if(temp == null){
            head.setNext(node);
            end = node;
        }else{
            node.setNext(head.getNext());
            head.getNext().setPrevious(node);
            head.setNext(node);
        }
        element++;
    }

    /**
     *  从链表后端插入
     *
     * @author jiangjiaxin
     * @date 2018-02-07 15:55
     * @param
     * @return
     */
    public void addNodeFromRear(String data){
        Node node = new Node(data);
        Node temp = head.getNext();
        if(temp == null){
            head.setNext(node);
            end = node;
        }else{
            end.setNext(node);
            node.setPrevious(end);
            end = node;
        }
        element++;
    }

    public Node deleteFirstNode(){
        Node node = head.getNext();
        if(node == null){
            throw new RuntimeException("这是一空链表.");
        }
        if(node.getNext() == null){
            head.setNext(null);
            end = null;
        }else{
            node.getNext().setPrevious(null);
            head.setNext(node.getNext());
        }
        element--;
        return node;
    }

    public Node deleteLastNode(){
        if(head.getNext() == null){
            throw new RuntimeException("这是一空链表.");
        }
        Node node = end;
        if(node.getPrevious() == null){
            head.setNext(null);
            end = null;
        }else{
            end = node.getPrevious();
            node.getPrevious().setNext(null);
            node.setPrevious(null);
        }
        element--;
        return node;
    }

    public Node find(String str){
        Node currentNode = head.getNext();
        while (currentNode != null){
            if(str.equals(currentNode.getData())){
                return currentNode;
            }
            currentNode = currentNode.getNext();
        }
        return null;
    }

    public boolean isEmpty(){
        return head.getNext() == null;
    }

    public int size(){
        return element;
    }

    public void display(){
        Node currentNode = head.getNext();
        while(currentNode != null){
            System.out.print(currentNode.getData() + " ");
            currentNode = currentNode.getNext();
        }
        System.out.println();
    }
}
