import java.util.*;

public class rated575 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char X = scanner.next().charAt(0);
        
        if (X == 'A' || X == 'B' || X == 'C') {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
} 