import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 3 or 5 to  know division numbers"); // instruction  to get input
        int a = scanner.nextInt();// get input
        if (a == 3) {
            for (int i = 1; i <= 100; i++) {

                if (i%3 == 0) {
                    System.out.println(i);// display result if input is 3
                }
            }
        } else if (a == 5) {
            for (int i = 1; i <= 100; i++) {
                if (i % 5 == 0) {
                    System.out.println(i);// display result if input is 5
                }
            }
        }
        else{
            System.out.println("Invalid entry");//error display
        }
    }
}


