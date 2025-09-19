import java.util.*;

public class OddOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first digit (a): ");
        int a = scanner.nextInt();

        System.out.println("Enter the second digit (b): ");
        int b = scanner.nextInt();

        System.out.println("Enter the third digit (c): ");
        int c = scanner.nextInt();

        int oddOne;
        if (a == b) {
            oddOne = c;
        } else if (a == c) {
            oddOne = b;
        } else { 
            oddOne = a;
        }

        System.out.println("The odd one out is: " + oddOne);
        
        scanner.close();
    }
}