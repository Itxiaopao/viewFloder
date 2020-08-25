package Sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] ints = new int[]{81, 5, 9, 100, 10, 80, 30, 12, 0, 81};

        quickSort(ints, 0, ints.length - 1);

        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    public static void quickSort(int[] ints, int left, int right) {
        if (left < right) {
            int mid = partition(ints, left, right);
            quickSort(ints, left, mid);
            quickSort(ints, mid + 1, right);
        }
    }

    public static int partition(int[] ints, int left, int right) {
        System.out.println("一次调用,left:" + left + ",right:" + right);
        int pivot = ints[left];
        int pivotIndex = left;
        while (left != right) {
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
        swap(ints,left,pivotIndex);
        return left;
    }

    private static void swap(int[] ints, int left, int right) {
        int temp = ints[left];
        ints[left] = ints[right];
        ints[right] = temp;
    }



































    /*public static void quickSort(int[] ints, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            //找出基准
            int partition = partition(ints, startIndex, endIndex);
            //分成两边递归进行
            quickSort(ints, startIndex, partition - 1);
            quickSort(ints, partition + 1, endIndex);
        }
    }

    //找基准
    private static int partition(int[] arr, int startIndex, int endIndex) {
        int pivot = arr[startIndex];//基准
        int left = startIndex;
        int right = endIndex;
        while (left != right) {
            while (left < right && arr[right] > pivot) {
                right--;
            }
            while (left < right && arr[left] <= pivot) {
                left++;
            }
            //找到left比基准大，right比基准小，进行交换
            if (left < right) {
                swap(arr, left, right);
            }
        }
        //第一轮完成，让left和right重合的位置和基准交换，返回基准的位置
        swap(arr, startIndex, left);
        return left;
    }

    //两数交换
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }*/

}
