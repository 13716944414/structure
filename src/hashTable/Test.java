package hashTable;

/**
 * @author jiangjiaxin
 * @date 2018-02-27 15:44
 */
public class Test {

    public static void main(String[] args){
        HashTable ht = new HashTable(3);
        ht.insert(new Info("abc", "abc"));
        ht.insert(new Info("cba", "cba"));
        ht.insert(new Info("ddd", "ddd"));

        ht.delete("abc");
        for(Info info : ht.arr){
            if(info != null){
                System.out.println(info.getName());
            }
        }

//        System.out.println(ht.find("abc").getName());
//        System.out.println(ht.find("ddd").getName());
    }
}
