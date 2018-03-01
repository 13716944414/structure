package hashTable.linkedAddress;

import hashTable.Info;
import hashTable.linkedAddress.linkedList.BothWayLinkedList;

import java.math.BigInteger;

/**
 * 哈希表-链表地址法
 *
 * @author jiangjiaxin
 * @date 2018-03-01 16:16
 * @param
 * @return
 */
public class HashTable {

    BothWayLinkedList[] arr = new BothWayLinkedList[100];

    public HashTable(int maxSize) {
        this.arr = new BothWayLinkedList[maxSize];
    }

    public void insert(Info paramInfo){
        String id = paramInfo.getId();
        int hashVal = this.hashCode(id);
        if(arr[hashVal] == null){
            arr[hashVal] = new BothWayLinkedList();
        }
        arr[hashVal].addNodeFromFront(paramInfo);
    }

    public Info find(String id){
        int hashVal = this.hashCode(id);
        if(arr[hashVal] == null){
            return null;
        }else{
            arr[hashVal].display();
            return arr[hashVal].find(id);
        }
    }

    private int hashCode(String id){
        BigInteger hashVal = new BigInteger("0");
        BigInteger multiplier = new BigInteger("31");
        int power = id.length() - 1;
        for(int i = id.length(); i > 0; i--){
            BigInteger letter = new BigInteger(id.charAt(id.length() - i) - 0 +"");
            hashVal = hashVal.add(letter.multiply(this.product(multiplier, i)));
            //hashVal += letter * (multiplier ^ (power - i));
        }
        BigInteger[] divideAndRemainder =  hashVal.divideAndRemainder(new BigInteger(arr.length + ""));
        return Integer.parseInt(divideAndRemainder[1].toString());
    }

    private BigInteger product(BigInteger val, int power){
        if(power == 0){
            return new BigInteger("1");
        }else if(power == 1){
            return val;
        }else{
            for(int i = 1; i < power; i++){
                val = val.multiply(val);
            }
            return val;
        }
    }
}
