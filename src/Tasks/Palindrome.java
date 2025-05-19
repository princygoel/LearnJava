package Tasks;

public class Palindrome {
    public static void main(String[] args) {
        int num = 1331;
        int temp = num;

        int rem, rev=0;
            while(temp!= 0){
                    rem = temp%10;
                    rev = rev *10 + rem;
                    temp = temp/10;
            }
            if(num == rev) {
                System.out.println("Number is palindrome");
            }
            else
            {
                System.out.println("Number is not palindrome");
            }
    }
}
