package recursion;

import java.util.Scanner;

public class recursion_25501 {

    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            count = 0;
            String str = sc.next();
            System.out.print(palindromeCheck(str) + " " + count);
        }
    }

    public static int palindromeCheck(String str) {
        return recursion(str, 0, str.length()-1);
    }

    public static int recursion(String str, int left, int right) {
        count++;
        if(left >= right) return 1;
        if(str.charAt(left) != str.charAt(right)) {
            return 0;
        } else {
            return recursion(str, left+1, right-1);
        }
    }
}
