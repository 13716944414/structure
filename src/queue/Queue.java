package queue;

/**
 * @author jiangjiaxin
 * @date 2018-02-02 9:37
 */
public class Queue {
    private long[] array = new long[10];
    private int element = 0;
    private int front = 0;
    private int rear = 0;

    public Queue(){}

    public Queue(int element){
        array = new long[element];
    }

    public void insert(long value){
        if(rear == array.length){
            rear = 0;
        }
        array[rear++] = value;
        element++;
    }

    public long remove(){
        long value = array[front++];
        if(front == array.length){
            front = 0;
        }
        element--;
        return value;
    }

    public long peek(){
        return array[front];
    }

    public boolean isEmpty(){
        return this.element == 0;
    }

    public boolean isFull(){
        return this.element == array.length;
    }

    public void removeAll(){
        while (!this.isEmpty()){
            System.out.println(this.remove());
        }
    }



}
