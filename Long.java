import java.util.*;

public class Long {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();

            if (word.length() > 10) {
                
                String abbr = word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1);
                System.out.println(abbr);
            } else {
                
                System.out.println(word);
            }
        }

        sc.close();
    }
}
