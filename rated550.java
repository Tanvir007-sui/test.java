import java.util.*;

public class rated550 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        int pagesFromNKg = N * 1000;
        int notebooks = pagesFromNKg / 100;
        
        System.out.println(notebooks);
        
        scanner.close();
    }
}