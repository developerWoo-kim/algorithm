package sort;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {3,9,4,7,5,0,1,6,8,2};
        quickSort(arr);
        for(int num : arr) {
            System.out.print(num + ", ");
        }
    }

    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length -1);
    }

    public static void quickSort(int[] arr, int left, int right) {
        if(left < right) {
            int part = partition(arr, left, right);

            if(left < part -1) {
                quickSort(arr, left, part-1);
            }
            if(part < right) {
                quickSort(arr, part, right);
            }

        }
    }
    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[(left + right) /2];
        while (left <= right) {
            while (arr[left] < pivot) left++;
            while (arr[right] > pivot) right--;
            if(left <= right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return left;
    }
    public static void swap(int[] arr, int start, int end) {
        int tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
    }
}
