import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
       int a= scanner.nextInt();// get first number
        System.out.println("Enter any operator +,-,/,*");//operation according operator
        String operator = scanner.next();
        System.out.println("Enter number");
        int b=scanner.nextInt();//with second num
        switch (operator) {
            case "+":
                System.out.println( a+"+"+b +"=" + (a + b));//addition
                break;
            case "_":
                System.out.println(a+"-"+b +"=" + (a- b));//subtraction
                break;
            case "/":
                System.out.println(a+"/"+b +"=" + (a / b));//division
                break;
            case "*":
                System.out.println(a+"*"+b +"=" + (a * b));//multilication
                break;
        }
    }
}
