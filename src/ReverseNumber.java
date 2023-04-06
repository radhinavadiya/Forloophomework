import java.util.Scanner;
public class ReverseNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// scanner object
        System.out.println("enter any numbers to reverse it");// instruction
        int a = scanner.nextInt();// get input
        int reverse = 0;

        for (; a != 0; a = a / 10) {
            int remeanir = a % 10;// divide by 10 to get remainder
            reverse = reverse * 10 + remeanir;
        }
        System.out.println(reverse);
    }
}
