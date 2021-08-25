import java.util.*;
public class combi{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out .println("Does player one choose rock , paper or scissors? ");
        String playerone = input.next();
        System.out .println("Does player one choose rock , paper or scissors? ");
        String playertwo = input.next();

        if (playerone.equalsIgnoreCase("rock")){
            if (playertwo.equalsIgnoreCase("scissors")){
                System.out.println("Player one wins");
            }
            else if (playertwo.equalsIgnoreCase("paper")){
                System.out.println("Player two wins");
            }
            else{
                System.out.println("tie");
            }
        }
        else if (playerone.equalsIgnoreCase("paper")){
            if (playertwo.equalsIgnoreCase("rock")){
                System.out.println("Player one wins");
            }
            else if (playertwo.equalsIgnoreCase("scissors")){
                System.out.println("Player two wins");
            }
            else{
                System.out.println("tie");
            }
        }
        else if (playerone.equalsIgnoreCase("scissors")){
            if (playertwo.equalsIgnoreCase("paper")){
                System.out.println("Player one wins");
            }
            else if (playertwo.equalsIgnoreCase("rock")){
                System.out.println("Player two wins");
            }
            else{
                System.out.println("tie");
            }
        }
    }
}