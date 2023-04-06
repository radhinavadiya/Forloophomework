import java.util.Scanner;
public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a number to see Fibonacci series up tp that number");
        int n = scanner.nextInt();//number input
        int firstnum = 0;
        int secondnum = 1;
        for (int i = 1; i <= n; ++i) {

            int fibonacci = firstnum + secondnum;//0+1
            // addition of first and next number
            firstnum = secondnum;//0=0
            secondnum = fibonacci;//0=(0+1)
            System.out.println(fibonacci);// print 1

        }
    }
}
