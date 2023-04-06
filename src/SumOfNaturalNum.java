import java.util.Scanner;

public class SumOfNaturalNum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number to know the sum up to that number");// instruction to get input
        int i = scanner.nextInt();// object creation
        int sum = 0;
        for (int j = 0; j <= i; ++j) {

            sum = sum + j;//add the next number
        }
        {
            System.out.print("The total of number 1 to " + i + " =" + sum);// print sum
        }
    }
}