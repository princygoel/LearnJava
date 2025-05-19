package Tasks;

public class AddNumbers {

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
    public static void main(String[] args ){
        AddNumbers ad = new AddNumbers();
        int result = ad.sum(28,29);
        System.out.println(result);



    }
}
