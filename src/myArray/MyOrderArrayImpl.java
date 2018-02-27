package myArray;

/**
 * @author jiangjiaxin
 * @date 2018-02-01 11:06
 */
public class MyOrderArrayImpl extends BaseArray implements MyArray{
    public MyOrderArrayImpl() {
    }

    public MyOrderArrayImpl(int element) {
        super(element);
    }

    @Override
    public void insert(long value) {
        int i;
        for(i = 0; i < super.element; i++){
            if(super.array[i] > value){
                break;
            }
        }
        for(int j = super.element; j > i; j--){
            super.array[j] = super.array[j - 1];
        }
        super.array[i] = value;
        super.element++;
    }
}
