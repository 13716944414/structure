package hashTable.linkedAddress.linkedList;

import hashTable.Info;

/**
 * @author jiangjiaxin
 * @date 2018-02-02 14:55
 */
public class Test {

    public static void main(String[] args){
        BothWayLinkedList bothWayLinkedList = new BothWayLinkedList();
        bothWayLinkedList.addNodeFromFront(new Info("aaa", "aaa", 1));
        bothWayLinkedList.addNodeFromFront(new Info("bbb", "bbb", 1));
        bothWayLinkedList.addNodeFromFront(new Info("bbb", "bbbbbbb", 1));
        bothWayLinkedList.addNodeFromFront(new Info("ccc", "ccc", 1));

        bothWayLinkedList.addNodeFromRear(new Info("ddd", "ddd", 1));
        bothWayLinkedList.addNodeFromRear(new Info("eee", "eee", 1));
        bothWayLinkedList.addNodeFromRear(new Info("fff", "fff", 1));

        bothWayLinkedList.display();
        //Info info = bothWayLinkedList.find("bbb");
        //System.out.println(info.getName());
    }
}
