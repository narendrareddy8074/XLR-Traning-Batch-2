public class Demo6 {
    public static void main(String[] args) {
        String name = "Mnreddy";
        String pwd = "Mnreddy@04";
        
        // Corrected string comparison using .equals() and proper parentheses
        while (name.equals("Mnreddy") && pwd.equals("Mnreddy@04")) {
            System.out.println("Hello Mnreddy Welcome to Mallareddy University");
            break; // Exit the loop after printing the message
        }
    }
}
