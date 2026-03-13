import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = -1;
        while (age < 0|| age > 150) {
            System.out.print("Enter your age: ");
            age = sc.nextInt();
        }
        System.out.println("Your age is: " + age);
        sc.close();
    }
}