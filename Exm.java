import java.util.*;

public class Exm {
    public static boolean passedOverFifty(int x, int y, int z) {
        int totalStudents = x * y;
        return z > 0.5 * totalStudents;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of sections (x): ");
        int x = scanner.nextInt();
        System.out.print("Enter number of students per section (y): ");
        int y = scanner.nextInt();
        System.out.print("Enter number of students who passed (z): ");
        int z = scanner.nextInt();
        scanner.close();
        System.out.println(passedOverFifty(x, y, z));
    }
}