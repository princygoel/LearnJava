package Tasks;

import java.util.Scanner;

public class FactRecursion {
    int res;
    public static void main (String[] args) {
        int fact;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        FactRecursion ob = new FactRecursion();
        fact = ob.calFact(num);
        System.out.println(fact);

    }
    int calFact(int num) {

        if(num>=1) {

           return (num*calFact(num-1));

        }
            return 1;
    }
}
