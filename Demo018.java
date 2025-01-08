import java.util.Scanner;
public class Demo018 {
    public static void main(String[]args){

        int a;
        int b;

        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter the first Num: ");
        a = s1.nextInt();

        System.out.print("Enter the second Num: ");
        b = s1.nextInt();

        int result = a + b;
        System.out.println("The Sum " + a + " and " + b + " is: " + result);
    }
}