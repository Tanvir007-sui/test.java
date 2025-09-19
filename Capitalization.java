import java.util.*;
public class Capitalization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word to capitalize:");
        String word = scanner.nextLine();
        
        if (word == null || word.isEmpty()) {
            System.out.println("Input cannot be empty.");
            scanner.close();
            return;
        }

        String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1);
        System.out.println("The capitalized word is: " + capitalizedWord);
        
        scanner.close();
    }
}