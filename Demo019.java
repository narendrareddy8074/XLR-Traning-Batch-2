import java.util.Scanner;

public class Demo019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int roundedNumber;

        if (number >= 0) {
            roundedNumber = ((number + 99) / 100) * 100; 
        } else {
            roundedNumber = ((number - 99) / 100) * 100; 
        }

        System.out.println("Rounded to the nearest hundred: " + roundedNumber);
    }
}
