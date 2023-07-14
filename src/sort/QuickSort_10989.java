package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class QuickSort_10989 {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(str.nextToken());

        arr = new int[n];
        for(int i = 0; i < n; i++) {
            str = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(str.nextToken());
            arr[i] = num;
        }

        quickSort(0, arr.length-1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void quickSort(int left, int right) {
        if(left < right) {
            int partition = partition(left, right);

            if(left < partition) {
                quickSort(left, partition-1);
            }
            if(partition < right) {
                quickSort(partition, right);
            }

        }
    }

    static int partition(int left, int right) {
        int pivot = arr[(left + right) /2];

        while (left <= right) {
            while (arr[left] < pivot) {
                left++;
            }
            while (pivot < arr[right]) {
                right--;
            }
            if(left <= right) {
                swap(left, right);
                left++;
                right--;
            }
        }
        return left;
    }
    static void swap(int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
