package Sort;

public class BubbleSort {
    /**
     * 时间复杂度: O(N^2)
     * 空间复杂度: O(1)
     * @param args
     */
    public static void main(String[] args) {
        int[] ints = new int[]{81, 5, 9, 10, 1, 80, 30, 12};
        for (int i = 0; i < ints.length - 1; i++) {
            for (int j = 0; j < ints.length - i - 1; j++) {
                if (ints[j] > ints[j + 1]) {
                    int temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
