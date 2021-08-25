import java.util.*;
public class ifelse{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what was your overall grade percentage?");
        int grade = input.nextInt();

        if (grade > 60){
            System.out.println("Admitted");
        }
        else if (grade > 40){
            System.out.println("you have been wait listed");
        }
        else{
            System.out.println("Please apply again");
        }
    }
}