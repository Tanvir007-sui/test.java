import java.util.*;

public class WorkHour {
    public static int calculateTotalHours(int x, int y) {
        int weekdayHours = x * 5; 
        int wednesdayHours = y;   
        return weekdayHours + wednesdayHours;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hours per day (X): ");
        int x = scanner.nextInt();
        System.out.print("Enter hours on Wednesday (Y, Y<=X): ");
        int y = scanner.nextInt();
        scanner.close();
        System.out.println(calculateTotalHours(x, y));
    }
}