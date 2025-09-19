import java.util.*;
public class StrictAvg {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers (A, B, and C), separated by spaces:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double average = (a + b) / 2.0;

        System.out.println("The average of A and B is: " + average);

        if (average > c) {
            System.out.println("Result: Yes, the average of A and B (" + average + ") is strictly greater than C (" + c + ").");
        } else {
            System.out.println("Result: No, the average of A and B (" + average + ") is not strictly greater than C (" + c + ").");
        }

        input.close();
    }
}