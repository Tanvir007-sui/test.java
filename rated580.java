import java.util.*;

public class rated580 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int P = scanner.nextInt();
        int Q = scanner.nextInt();
        int R = scanner.nextInt();
        int S = scanner.nextInt();
        
        int sumOthers;
        boolean monopoly = false;
        
        if (P > Q + R + S) monopoly = true;
        else if (Q > P + R + S) monopoly = true;
        else if (R > P + Q + S) monopoly = true;
        else if (S > P + Q + R) monopoly = true;
        
        if (monopoly) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}