import java.util.Scanner;
public class scan{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome");
        System.out.println("cual es tu nombre");
        String name = input.next();
        System.out.println("Hola " +name);
    }
}