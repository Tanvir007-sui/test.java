import java.util.*;
public class IiucTvProblem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();

        int subscriptionsNeeded = (N + 5) / 6;
        int totalCost = subscriptionsNeeded * X;

        System.out.println(totalCost);

        scanner.close();
    }
}