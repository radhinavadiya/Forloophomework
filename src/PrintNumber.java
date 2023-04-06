import java.util.Scanner;
public class PrintNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in); // object creation
        System.out.println("Enter a starting number from you want to see range up to 10 numbers");
        int range=scanner.nextInt();// get input
        for (int i=range; i<=range+10; i++){// limit up to 10
        System.out.println(i);}// print result
    }
}
