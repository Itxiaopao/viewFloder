package Sort;

/**
 * 插入排序
 * 关键字：一部分有序一部分无序，无序区向有序去插入
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] ints = new int[]{81, 5, 9, 10, 1, 80, 30, 12};
        for (int i = 1; i < ints.length; i++) {
            int k = i - 1;
            int temp = ints[i];
            while(k >= 0 && ints[k] > temp){
                ints[k + 1] =  ints[k];
                k--; //k减下去了,处理的事当前元素的下一个和当前元素的上一个
            }
            ints[k+1] = temp;
        }
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }


}
