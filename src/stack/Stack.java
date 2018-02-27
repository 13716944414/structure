package stack;

import java.util.LinkedList;
import java.util.List;

/**
 * @author jiangjiaxin
 * @date 2018-02-02 9:06
 */
public class Stack {

    private long[] array = new long[10];

    private int element = -1;

    public Stack(){}

    public Stack(int element){
        array = new long[element];
    }

    public void push(long value){
        array[++element] = value;
    }

    public long pop(){
        return array[element--];
    }

    public long peek(){
        return array[element];
    }

    public boolean isEmpty(){
        return element == -1;
    }

    public boolean isFull(){
        return element == array.length - 1;
    }

    public void display(){
        if(element != -1){
            while (element != -1){
                System.out.println(this.pop());
            }
        }

    }
}
