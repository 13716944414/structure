package linkedList;

/**
 * @author jiangjiaxin
 * @date 2018-02-02 14:55
 */
public class Test {

    public static void main(String[] args){
        BothWayLinkedList bothWayLinkedList = new BothWayLinkedList();
        bothWayLinkedList.addNodeFromFront("3");
        bothWayLinkedList.addNodeFromFront("2");
        bothWayLinkedList.addNodeFromFront("1");

        bothWayLinkedList.addNodeFromRear("6");
        bothWayLinkedList.addNodeFromRear("7");
        bothWayLinkedList.addNodeFromRear("8");

        bothWayLinkedList.display();
    }
}
