import java.util.*;

public class capitalize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input word
        String word = sc.nextLine();
        
        // Capitalize the first character and keep the rest unchanged
        String result = word.substring(0,1).toUpperCase() + word.substring(1);
        
        // Output
        System.out.println(result);
        
        sc.close();
    }
}
