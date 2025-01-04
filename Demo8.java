import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {
        String name;
        int age;
        long phno;
        String reply;
        String loginid = "";
        String pwd = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Malla reddy university");
        System.out.println("Have you visited our site earlier? (yes/no)");
        reply = sc.nextLine();
        
        if (reply.equals("no")) {
            System.out.println("Login here");
            System.out.println("Enter your id and password:");
            loginid = sc.nextLine();
            pwd = sc.nextLine();
            // Example of checking login credentials
            if (loginid.equals("vineesh") && pwd.equals("12345")) {
                System.out.println("Login successful");
            } else {
                System.out.println("Invalid login credentials");
            }
        } else {
            System.out.println("You are our valued customer");
        }
    }
}
