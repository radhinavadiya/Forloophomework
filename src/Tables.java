import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);//object creation
        System.out.println("enter number to get see table of that number");//get number
        int i = obj.nextInt();
        System.out.println("Table of " + i);
        for (int j = 1; j <= 12; j++) {
            System.out.println(i + "*" + j + "=" + i * j);

        }
    }

}

