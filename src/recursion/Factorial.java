package recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        long result = 0;
        if(N == 0) {
            System.out.println(1);
        } else {
            result = factorial(N);
            System.out.println(result);
        }
    }

    public static long factorial(long n) {
        if(n <= 1) {
            return n;
        } else {
            return factorial(n-1) * n;
        }
    }
}
