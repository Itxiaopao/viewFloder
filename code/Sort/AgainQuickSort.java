package Sort;

public class AgainQuickSort {
    public static void main(String[] args) {
        int[] ints = new int[]{81, 5, 5, 9, 100, 10, 80, 30, 0, 12, 81};
//        int[] ints = new int[]{81,5, 81};
        quickSort(ints, 0, ints.length - 1);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    public static void quickSort(int[] ints, int left, int right) {
        if (left < right) {
            int partition = partition(ints, left, right);
            quickSort(ints, 0, partition);
            quickSort(ints, partition + 1, right);
        }
    }

    public static int partition(int[] ints, int left, int right) {
        int pivot = ints[left];
        int pivotIndex = left;
//        int[] ints = new int[]{81, 5, 9, 100, 10, 80, 30, 0, 12, 81};
        while (left < right) {
            while (left < right && ints[right] >= pivot) {
                right--;
            }
            while (left < right && ints[left] < pivot) {
                left++;
            }
            if (left < right) {
                swap(ints, left, right);
            }
        }

        swap(ints, pivotIndex, left);
        return left;
    }

    public static void swap(int[] ints, int left, int right) {
        int temp = ints[left];
        ints[left] = ints[right];
        ints[right] = temp;
    }
}
