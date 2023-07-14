package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Fibonacci_11444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        BigInteger n = new BigInteger(str.nextToken());

        System.out.println(fibonacci(n));
    }

    static BigInteger fibonacci(BigInteger num) {
        if(num.compareTo(new BigInteger("1")) == 0 ||
                num.compareTo(new BigInteger("1")) == -1) return num;
        return fibonacci(num.subtract(new BigInteger("2"))).add(fibonacci(num.subtract(new BigInteger("1"))));
    }
}
