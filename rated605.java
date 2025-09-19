import java.util.*;

public class rated605 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        
        int eligibleVoters = 0;
        
        for (int i = 0; i < N; i++) {
            int age = scanner.nextInt();
            if (age >= X) {
                eligibleVoters++;
            }
        }
        
        System.out.println(eligibleVoters);
        
        scanner.close();
    }
}