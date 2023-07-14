package sort;

import java.util.Scanner;

public class selectSort {
    public static void main(String[] args) {
        int[] arr = {4,5,2,3,1,8,6,9,7};
        //선택 정렬
        for(int i = 0; i < arr.length; i++) {
            for(int k = i+1; k < arr.length; k++) {
                if(arr[i] > arr[k]) {
                    int temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
