import java.util.Scanner;

public class DisplayNum_sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//scanner object
        System.out.println("Enter a number to see sum up to that number");
        int num = scanner.nextInt();
        int result = 0;
        for (int i = 1; i <= num; i++) {// up to entered number
            result = result + i;
            System.out.println(i);// displays numbers
        }
        System.out.println(result);//displays sum
    }
}
