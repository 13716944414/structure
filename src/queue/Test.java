package queue;

import java.util.Stack;

/**
 * @author jiangjiaxin
 * @date 2018-02-02 10:17
 */
public class Test {

    public static void main(String[] args){
        Queue queue = new Queue(3);
        queue.insert(2);
        queue.insert(1);
        queue.insert(3);

        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());

        queue.removeAll();

        queue.insert(5);
        queue.insert(8);
        queue.insert(4);

        queue.removeAll();

    }
}
