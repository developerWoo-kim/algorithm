import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class beck_1037 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(str.nextToken());

        int[] arr = new int[n];
        str = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str.nextToken());
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

        if(n == 1) {
            System.out.println(arr[0]*2);
        } else {
            int A = arr[arr.length-1];
            int B = arr[0];


            System.out.println((A * B / gcd(A, B))*2);
        }

    }

    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
