import java.util.Scanner;

public class Month {
    Scanner scanner = new Scanner(System.in);

    void switchmethod() {// no return type no parameter

        {
            System.out.println("Enter any number from 1to12 to know which month is that");
        }

        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println(number + "is January");
                break;
            case 2:
                System.out.println(number + "is February");
                break;
            case 3:
                System.out.println(number + " is March");
                break;
            case 4:
                System.out.println(number + "is April");
                break;
            case 5:
                System.out.println(number + " is May");
                break;
            case 6:
                System.out.println(number + " is june");
                break;
            case 7:
                System.out.println(number + " is July");
                break;
            case 8:
                System.out.println(number + " is Augest");
                break;
            case 9:
                System.out.println(number + " is September");
                break;
            case 10:
                System.out.println(number + " is October");
                break;
            case 11:
                System.out.println(number + " is November");
                break;
            case 12:
                System.out.println(number + " is December");
                break;
            default:
                System.out.println("Invalid entry");
        }
    }

    public static void main(String[] args) {
        Month month = new Month();// object of class
        month.switchmethod();// method calling
        System.out.println();

    }

}
