import java.util.Scanner;

public class SumOfRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any two number from 1 to 20 to know the sum of that range");
        int initialnum = scanner.nextInt();// Starting number
        int endingnum = scanner.nextInt();//endingnum number
        int sum = 0;
        if (endingnum <= 20 && initialnum >= 1) {// condition checking
            for (int i = initialnum; i <= endingnum; ++i) {
                sum = sum + i;
            }
            System.out.println(sum);// result display
        } else {
            System.out.println("invalid entry");// error display
        }

    }
}

