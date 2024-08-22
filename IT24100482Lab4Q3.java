import java.util.Scanner;

public class IT24100482Lab4Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number here : ");
        int input = in.nextInt();

        String result = (input > 0) ? "Positive" : (input < 0) ? "Negative" : "Zero";

        System.out.println(result);

    }
}