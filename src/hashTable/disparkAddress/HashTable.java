package hashTable.disparkAddress;

import hashTable.Info;

import java.math.BigInteger;

/**
 *  哈希表-开放寻址法
 *
 * @author jiangjiaxin
 * @date 2018-03-01 16:15
 * @param
 * @return
 */
public class HashTable {

    public Info[] arr = new Info[100];

    public HashTable(int maxSize) {
        this.arr = new Info[maxSize];
    }

    public void insert(Info info){
        boolean flag = false;
        String id = info.getId();
        int index = this.hashCode(id);
        while(arr[index] != null && !arr[index].getId().equals(id)){
            if(flag && index == this.hashCode(id)){
                index = -1;
                System.out.println(id + ":插入失败.哈希表已满");
                break;
            }
            index++;
            if(index == arr.length){
                index %= arr.length;
                flag = true;
            }
        }
        if(index != -1){
            arr[index] = info;
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

    public Info find(String id){
        boolean flag = false;
        int index = this.hashCode(id);
        while(arr[index] != null){
            if(arr[index].getId().equals(id)){
                return arr[index];
            }
            if(flag && index == this.hashCode(id)){
                return new Info("", "没找到");
            }
            index++;
            if(index == arr.length){
                index %= arr.length;
                flag = true;
            }
        }
        return new Info("", "");
    }

    public Info delete(String id){
        boolean flag = false;
        int index = this.hashCode(id);
        while(true){
            if(flag && index == this.hashCode(id)){
                return null;
            }
            if(arr[index] == null){
                continue;
            }
            if(arr[index].getId().equals(id)){
                Info temp = arr[index];
                arr[index] = null;
                return temp;
            }
            index++;
            if(index == arr.length){
                index %= arr.length;
                flag = true;
            }
        }


    }
}
