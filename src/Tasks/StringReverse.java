package Tasks;

import java.util.Scanner;

public class StringReverse {

    public static void main (String[] args) {

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter string");
        String s = sc.nextLine();
       // String s = "Dheeraj";

        String rev = "";
        for(int i =s.length()-1;i>=0;i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);
    }
}
