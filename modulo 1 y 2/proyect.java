import java.util.*;

public class proyect{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's play a game called \" Odds and Evens\"");
        System.out.println("what's your name? ");
        String name = input.nextLine();
        System.out.println("hi " + name + " ,Which do you choose? (O)dds or (E)vens ");
        String choose = input.next();
        if (choose.equalsIgnoreCase("O")){
            System.out.println(name + " choose Odds , computer go Evens");
        }
        else if (choose.equalsIgnoreCase("E")){
            System.out.println(name + " choose Evens , computer go Odds");
        }
        System.out.println("------------------------------------");
        
        System.out.println("how many \"fingers\" do you put out");
        int fingers = input.nextInt();
        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("The computer plays "+ computer +" fingers");
        System.out.println("------------------------------------");

        int suma = fingers + computer;
        System.out.println(fingers + " + " + computer + " = "+suma);
        boolean oddOrEven = suma % 2 == 0;

        if(oddOrEven==true){
            System.out.println(suma+" is ... even");
            if (choose.equalsIgnoreCase("E")){
                System.out.println("that means "+ name +" wins");
            }
            else if (choose.equalsIgnoreCase("O")){
                System.out.println("that means computer wins");
            }
        }
        else{
            System.out.println(suma+" is ... odd");
            if (choose.equalsIgnoreCase("O")){
                System.out.println("that means "+ name +" wins");
            }
            else if (choose.equalsIgnoreCase("E")){
                System.out.println("that means computer wins");
            }
        }
        System.out.println("------------------------------------");

    }
}