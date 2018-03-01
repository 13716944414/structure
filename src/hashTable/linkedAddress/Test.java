package hashTable.linkedAddress;

import hashTable.Info;

/**
 * @author jiangjiaxin
 * @date 2018-03-01 16:54
 */
public class Test {

    public static void main(String[] args){
        HashTable ht = new HashTable(100);
        ht.insert(new Info("aaa", "aaa", 1));
        ht.insert(new Info("bbb", "bbb", 1));
        ht.insert(new Info("bbb", "bbbbbbbb", 1));
        ht.insert(new Info("bbb", "bbbbbbbbcccccccc", 1));
        ht.insert(new Info("ccc", "ccc", 1));

        Info info = ht.find("bbb");
        if(info == null){
            System.out.println("null");
        }else{
            System.out.println(info.getName());
        }
    }

}
