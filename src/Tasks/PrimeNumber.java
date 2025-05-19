package Tasks;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        boolean isPrime = true;
        if (num == 1) {
             isPrime = false;

        }
        else {
            for(int i =2;i<=num-1;i++){
                if(num%i == 0){
                    isPrime = false;
                    break;
                }

            }
            if(isPrime){
                System.out.println("number is prime");
            }
            else {
                System.out.println("number is not prime");
            }
        }
    }
}
