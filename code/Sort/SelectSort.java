package Sort;

public class SelectSort {
    /**
     * 时间复杂度：O(N^2)
     * 空间复杂度: O(1)
     * 稳定性： 不稳定
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] ints = new int[]{81, 5, 9, 10, 1, 80, 30, 12};
        for (int i = 0; i < ints.length - 1; i++) {
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[i] > ints[j]) {
                    int temp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = temp;
                }
            }
        }
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
