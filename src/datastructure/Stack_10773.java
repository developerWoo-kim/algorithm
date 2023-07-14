package datastructure;

import java.util.Scanner;

public class Stack_10773 {
    static int[] arr;
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        arr = new int[n];
        for(int i = 0; i < n; i++) {
            int number = sc.nextInt();
            check(number);
        }

        long sum = 0;
        for(int i : arr) {
            sum += i;
        }
        System.out.println(sum);
    }

    static void check(int num) {
        if(num == 0) {
            if(count != 0) {
                arr[count-1] = 0;
                count--;
            }
        } else {
            arr[count] = num;
            count++;
        }
    }
}
