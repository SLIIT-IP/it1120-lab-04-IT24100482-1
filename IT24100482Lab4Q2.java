import java.util.Scanner;

public class IT24100482Lab4Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        double examMarks = getValidMarks(scanner, "exam");
        
        
        double labMarks = getValidMarks(scanner, "lab submission");
        
        
        double examPercentage = getValidPercentage(scanner, "exam");
        double labPercentage = getValidPercentage(scanner, "lab submission");
        
        
        if (examPercentage + labPercentage != 100) {
            System.out.println("The percentages must add up to 100.");
            scanner.close();
            return;
        }
        
        
        double finalMark = (examMarks * (examPercentage / 100)) + (labMarks * (labPercentage / 100));
        
        
        System.out.printf("The final mark is: %.2f%n", finalMark);
        
        
        scanner.close();
    }
    
   
    private static double getValidMarks(Scanner scanner, String type) {
        double marks;
        while (true) {
            System.out.printf("Enter the %s marks (0-100): ", type);
            marks = scanner.nextDouble();
            if (marks >= 0 && marks <= 100) {
                break;
            } else {
                System.out.println("Invalid marks. Please enter a value between 0 and 100.");
            }
        }
        return marks;
    }
    
    
    private static double getValidPercentage(Scanner scanner, String type) {
        double percentage;
        while (true) {
            System.out.printf("Enter the percentage for %s marks: ", type);
            percentage = scanner.nextDouble();
            if (percentage >= 0 && percentage <= 100) {
                break;
            } else {
                System.out.println("Invalid percentage. Please enter a value between 0 and 100.");
            }
        }
        return percentage;
    }
}
