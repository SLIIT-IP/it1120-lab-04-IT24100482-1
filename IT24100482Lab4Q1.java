import java.util.Scanner;

public class IT24100482Lab4Q1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number here: ");
        int input = in.nextInt();

        if (input > 0) {
            System.out.println("Positive");
        } else if (input < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}