import java.util.Scanner;
public class Demo7 {
        public static void main (String[] args){
            String name;
            int age;
            int phone_number;
            Scanner sc = new Scanner(System.in);
            name = sc.nextLine();
            age = sc.nextInt();
            phone_number = sc.nextInt();
            System.out.println("name "+name+"and age is "+age+" and phone number is "+phone_number);
            }
        }