package Tasks;

public class SwapNumberThree {

    public static void main (String[] args) {

        int a = 30, b = 20;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a + " " + b);


    }

}
