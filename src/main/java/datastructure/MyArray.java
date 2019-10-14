package datastructure;

/**
 * @author liujin
 * @datetime 2019/9/29 10:37
 */
public class MyArray {

    private int[] intArray;

    /**
     * 数组有效长度,有几个元素长度就多少
     */
    private int elems;

    /**
     * 数组的大小
     */
    private int length;

    public MyArray() {
        this.elems = 0;
        this.length = 50;
        this.intArray = new int[length];
    }

    public MyArray(int length) {
        elems = 0;
        this.length = length;
        intArray = new int[length];
    }

    /**
     * 获取数组有效长度
     */
    public int getSize() {
        return elems;
    }

    /**
     * 遍历打印元素
     */
    public void display() {
        for (int i = 0; i < elems; i++) {
            System.out.println(intArray[i]);
        }
    }

    public boolean add(int value) {
        if (elems == length) {
            return false;
        } else {
            intArray[elems] = value;
            elems++;
        }
        return true;
    }

    /**
     * 根据下标获取元素
     * @param i
     * @return
     */
    public int get(int i) {
        if (i < 0 || i > elems) {
            System.out.println("数组下标越界");
        }
        return intArray[i];
    }

    /**
     * 查找元素返回对应的下标
     * @param value
     * @return
     */
    public int find(int value) {
        for (int i = 0; i < elems; i++) {
            if (value == intArray[i]) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 删除元素
     * @param value
     * @return
     */
    public boolean delete(int value) {
        int k = find(value);
        if (k == -1) {
            return false;
        } else {
            if (k == elems -1) {
                elems--;
            } else {
                for (int i = k; i < elems; i++) {
                    intArray[i] = intArray[i+1];
                }
                elems--;
            }
            return true;
        }
    }

    /**
     * 修改数据
     * @param value
     * @return
     */
    public boolean modify(int value, int newValue) {
        int k = find(value);
        if (k == -1) {
            return false;
        }
        intArray[k] = newValue;
        return true;
    }

    public static void main(String[] args) {
        MyArray m = new MyArray(5);
        m.add(1);
        m.add(2);
        m.add(3);
        m.add(4);
        m.add(5);

        System.out.println(m.add(6));
    }
}
