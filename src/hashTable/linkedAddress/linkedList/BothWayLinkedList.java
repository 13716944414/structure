package hashTable.linkedAddress.linkedList;

import hashTable.Info;

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
    public void addNodeFromFront(Info info){
        Node node = new Node(info);
        Node currentNode = head.getNext();
        if(currentNode == null){
            head.setNext(node);
            end = node;
        }else{
            while(currentNode != null){
                if(currentNode.getInfo().getId().equals(info.getId())){
                    currentNode.setInfo(info);
                    return;
                }
                currentNode = currentNode.getNext();
            }
            if(currentNode == null){
                node.setNext(head.getNext());
                head.getNext().setPrevious(node);
                head.setNext(node);
            }

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
    public void addNodeFromRear(Info info){
        Node node = new Node(info);
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

    public boolean isEmpty(){
        return head.getNext() == null;
    }

    public int size(){
        return element;
    }

    public void display(){
        Node currentNode = head.getNext();
        while(currentNode != null){
            System.out.print(currentNode.getInfo().getName() + " ");
            currentNode = currentNode.getNext();
        }
        System.out.println();
    }

    public Info find(String id){
        Node currentNode = head.getNext();
        if(currentNode == null){
            return null;
        }else{
            while(currentNode != null){
                if(currentNode.getInfo().getId().equals(id)){
                    break;
                }
                currentNode = currentNode.getNext();
            }
        }
        return currentNode == null ? null : currentNode.getInfo();
    }
}
