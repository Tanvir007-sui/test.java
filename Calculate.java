import java.util.*;

public class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter operation (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double result;

        if (op == '+')
            result = num1 + num2;
        else if (op == '-')
            result = num1 - num2;
        else if (op == '*')
            result = num1 * num2;
        else if (op == '/') {
            if (num2 != 0)
                result = num1 / num2;
            else {
                System.out.println("Error! Division by zero.");
                sc.close();
                return;
            }
        } else {
            System.out.println("Invalid operator.");
            sc.close();
            return;
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}
