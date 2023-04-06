import java.util.Scanner;

public class Sum_Of_Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//scanner object
        System.out.println("Enter any number");
        float num = scanner.nextFloat();// input
        float result = 1;// variable declaration
        for (int i = 1; i < num; i++) {
            result = result + 1 / num;//divide by input number
        }
        System.out.println(result);// display result

    }

}


