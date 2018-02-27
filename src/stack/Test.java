package stack;

/**
 * @author jiangjiaxin
 * @date 2018-02-02 9:20
 */
public class Test {
    public static void main(String[] args){
        Stack s = new Stack(3);
        s.push(2);
        s.push(1);
        s.push(3);

        System.out.println(s.isEmpty());
        System.out.println(s.isFull());
        s.pop();
        System.out.println(s.isFull());
        //System.out.println(s.pop());
        //System.out.println(s.peek());
    }
}
