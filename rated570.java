import java.util.*;

public class rated570 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        
        int needed = N - X;
        int packets = (needed + 3) / 4;
        
        if (needed <= 0) {
            packets = 0;
        }
        
        System.out.println(packets);
        
        scanner.close();
    }
}