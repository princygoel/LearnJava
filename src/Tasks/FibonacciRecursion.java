package Tasks;

import java.util.Scanner;

public class FibonacciRecursion {
    static int a = 0, b = 1, c ;
    public static void main(String[] args ) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        System.out.print(a + " " + b);
        FibonacciRecursion fb = new FibonacciRecursion();
        fb.printFib(num);
    }
        void printFib(int i) {
            if(i>=1) {
                c = a + b;
                System.out.print(" "+c);
                a = b;
                b = c;
                printFib(i-1);
            }
        }


}
