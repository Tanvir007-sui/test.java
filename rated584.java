import java.util.*;
public class rated584 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        
        int minTemp = Math.max(A, C);
        int maxTemp = B;
        
        if (minTemp <= maxTemp) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}