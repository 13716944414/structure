package myArray;

/**
 * @author jiangjiaxin
 * @date 2018-02-01 10:28
 */
public class Test {
    public static void main(String[] args){
        MyArray array = new MyArrayImpl(10);
        array.insert(3);
        array.insert(1);
        array.insert(2);
        array.insert(4);
        array.insert(9);
        array.insert(-1);
        //System.out.println(array.indexOf(2));
        array.insertionSort();
        array.display();
    }
}
