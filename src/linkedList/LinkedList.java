package linkedList;

/**
 * @author jiangjiaxin
 * @date 2018-02-02 13:42
 */
public class LinkedList {

    private Node head;

    private int element;

    public LinkedList() {
        this.head = new Node();
    }

    public void addNode(String data){
        Node node = new Node(data);
        node.setNext(head.getNext());
        head.setNext(node);
        element++;
    }

    public Node deleteheadNode(){
        Node temp = head.getNext();
        if(temp == null){
            throw new RuntimeException("这是一空链表.");
        }
        head.setNext(temp.getNext());
        element--;
        return temp;
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

    public void bubbleSort(){
        Node currentNode = head.getNext();
        while (currentNode != null){
            Node currentNextNode = currentNode.getNext();
            while (currentNextNode != null){
                if(currentNode.getData().compareTo(currentNextNode.getData()) < 0){
                    String temp = currentNode.getData();
                    currentNode.setData(currentNextNode.getData());
                    currentNextNode.setData(temp);
                }
                currentNextNode = currentNextNode.getNext();
            }
            currentNode = currentNode.getNext();
        }
    }

    public void selectionSort(){
        Node currentNode = head.getNext();
        while (currentNode != null){
            Node minNode = currentNode;
            Node tempNode = currentNode.getNext();
            while (tempNode != null){
                if(minNode.getData().compareTo(tempNode.getData()) > 0){
                    minNode = tempNode;
                }
                tempNode = tempNode.getNext();
            }
            if(minNode != currentNode){
                String tempStr = currentNode.getData();
                currentNode.setData(minNode.getData());
                minNode.setData(tempStr);
            }
            currentNode = currentNode.getNext();
        }

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
