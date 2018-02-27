package myArray;

/**
 * @author jiangjiaxin
 * @date 2018-02-01 11:04
 */
public class BaseArray{

    protected long[]  array = new long[50];
    protected int element;

    public BaseArray(){}

    public BaseArray(int element) {
        this.array = new long[element];
    }

    public void insert(long value){
        this.array[element] = value;
        element++;
    }

    public void delete(int index){
        if(index < 0 || index > this.element){
            throw new ArrayIndexOutOfBoundsException("数组下标越界");
        }else{
            for(int i = index; i < element; i++){
                this.array[i] = this.array[i + 1];
            }
            this.element--;
        }
    }

    public void update(int index, long value){
        if(index < 0 || index > this.element){
            throw new ArrayIndexOutOfBoundsException("数组下标越界");
        }else{
            this.array[index] = value;
        }
    }

    public long get(int index){
        if(index < 0 || index >= this.element){
            throw new ArrayIndexOutOfBoundsException("数组下标越界");
        }else{
            return this.array[index];
        }
    }

    public int indexOf(long value){
        int i;
        for(i = 0; i < element; i++){
            if(this.array[i] == value){
                break;
            }
        }
        if(i >= this.element){
            return -1;
        }
        return i;
    }

    /**
     *    冒泡排序
     *
     * @author jiangjiaxin
     * @date 2018-02-01 17:09
     * @param
     * @return
     */
    public void bubbleSort() {
        for(int i = 0; i < this.element - 1; i++){
            for (int j = i + 1; j < this.element; j++){
                if(this.array[i] > this.array[j]){
                    long temp = this.array[i];
                    this.array[i] = this.array[j];
                    this.array[j] = temp;
                }
            }
        }
    }

    /**
     *    选择排序
     *
     * @author jiangjiaxin
     * @date 2018-02-01 17:09
     * @param
     * @return
     */
    public void selectionSort(){
        int sortedIndex = 0;
        int minValueIndex = 0;
        for(int i = sortedIndex; i < this.element; i++){
            for(int j = i + 1; j < this.element; j++){
                if(this.array[minValueIndex] > this.array[j]){
                    minValueIndex = j;
                }
            }
            long temp = this.array[sortedIndex];
            this.array[sortedIndex] = this.array[minValueIndex];
            this.array[minValueIndex] = temp;
            sortedIndex++;
            minValueIndex = sortedIndex;
        }
    }

    /**
     *    插入排序
     *
     * @author jiangjiaxin
     * @date 2018-02-01 17:08
     * @param
     * @return
     */
    public void insertionSort(){
        for(int i = 0; i < this.element; i++){
            int currentIndex = i;
            for(int j = currentIndex; j > 0; j--){
                if(this.array[currentIndex] < this.array[j - 1]){
                    long temp = this.array[currentIndex];
                    this.array[currentIndex] = this.array[j - 1];
                    this.array[j - 1] = temp;
                    currentIndex = j - 1;
                }
            }
        }
    }

    public void display(){
        System.out.print("[ ");
        for(long l : array){
            System.out.print(l + " ");
        }
        System.out.print("]");
    }


}
