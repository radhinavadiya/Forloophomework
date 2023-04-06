import java.util.Scanner;

public class Factorial_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number to see factorial number");// instruction
        int number = scanner.nextInt();// get input
        int result = 1; // variable creation
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        System.out.println("The factorial of " + number + " is " + result);// display result
    }
}
