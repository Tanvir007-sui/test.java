import java.util.*;
public class AssignmentCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        if (X + 3 <= 10) {
            System.out.println("Yes, he can complete on time.");
        } else {
            System.out.println("No, he cannot complete on time.");
        }

        sc.close();
    }
}
