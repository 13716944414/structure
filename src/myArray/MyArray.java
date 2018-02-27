package myArray;

/**
 * @author jiangjiaxin
 * @date 2018-02-01 14:20
 */
public interface MyArray {
    public void insert(long value);

    public void delete(int index);

    public void update(int index, long value);

    public long get(int index);

    public int indexOf(long value);

    public void bubbleSort();

    public void selectionSort();

    public void insertionSort();

    public void display();
}
