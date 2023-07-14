package recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++) {
            sb.append(fibonacci(i));
            if(i < n) {
                sb.append(" + ");
            }
        }
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {
        if(n <= 1) {
            return n;
        } else {
            return fibonacci(n-2) + fibonacci(n-1);
        }
    }
}
