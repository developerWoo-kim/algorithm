package sort;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = arr.length-1; i > 0; i--) {
            for(int k = 0; k < i; k++) {
                if(arr[k] > arr[k+1]) {
                    int temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;
                }
            }
        }
        for(int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }
    }
}
