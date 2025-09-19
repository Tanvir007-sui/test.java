import java.util.*;
public class WaterFilling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter B1, B2, B3 (1 for full, 0 for empty): ");
        int B1 = scanner.nextInt();
        int B2 = scanner.nextInt();
        int B3 = scanner.nextInt();
        
        int emptyBottles = 0;
        if (B1 == 0) emptyBottles++;
        if (B2 == 0) emptyBottles++;
        if (B3 == 0) emptyBottles++;
        
        if (emptyBottles >= 2) {
            System.out.println("Water filling time");
        } else {
            System.out.println("Not now");
        }
        
        scanner.close();
    }
    public static String checkWaterFill(int B1, int B2, int B3) {
        int emptyCount = (B1 == 0 ? 1 : 0) + (B2 == 0 ? 1 : 0) + (B3 == 0 ? 1 : 0);
        return emptyCount >= 2 ? "Water filling time" : "Not now";
    }
    public static void testCases() {
        System.out.println("\nTest Cases:");
        System.out.println("B1=0, B2=0, B3=1: " + checkWaterFill(0, 0, 1)); 
        System.out.println("B1=1, B2=0, B3=1: " + checkWaterFill(1, 0, 1)); 
        System.out.println("B1=0, B2=0, B3=0: " + checkWaterFill(0, 0, 0)); 
        System.out.println("B1=1, B2=1, B3=1: " + checkWaterFill(1, 1, 1)); 
        System.out.println("B1=1, B2=0, B3=0: " + checkWaterFill(1, 0, 0)); 
    }
}