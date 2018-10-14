package HomeWork;

import java.util.Scanner;

/**
 * Created by andrz on 09/10/2018.
 */
public class Fibonacci {

    public static void main(String[] args) {
       // Scanner con = new Scanner(System.in);
        //int n = con.nextInt();
        System.out.println(fibonacci(8));
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
