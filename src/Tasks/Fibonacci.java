package Tasks;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int a = 0, b =1 ;
        int c;
        for(int i = 1; i <=num;i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }

    }
}
