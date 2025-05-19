package Tasks;

import java.util.Scanner;

public class AllPrimeNumber {
    public static void main(String[] args) {
        int num = 100;
        int temp = 0;
        for(int i=1;i<=100;i++) {
            for(int j=2;j<i;j++) {
               if(i%j==0) {
                   temp = temp + 1;
               }
            }
            if(temp == 0){
                System.out.println(i);
            }
            else
            {
                temp = 0;
            }
        }
    }

}
