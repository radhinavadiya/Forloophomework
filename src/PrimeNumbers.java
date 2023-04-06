import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        {
            System.out.println("Enter any number to check if it is prime number");//instruction
        }
        int a = scanner.nextInt();// get input
        int count = 0;//variable creation
        for (int i = 1; i <= a; i++) {
            if (a % i == 0)
                count++;//increment
        }
        if (count == 2) {
            System.out.println("It is prime number");// display result
        } else {
            System.out.println("It is not prime number");// display result
        }
    }
}
