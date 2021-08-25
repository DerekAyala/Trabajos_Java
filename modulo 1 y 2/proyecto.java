import java.util.Scanner;
public class proyecto{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what's your name");
        String nombre = input.next();
        System.out.println("Nice to meet you "+ nombre +", where are you travelling to?");
        String lugar = input.next();
        System.out.println("Great! "+lugar+" sounds like a great trip");
        days(input);
    }
    public static void days(Scanner input){
        System.out.println("\nHow many days are you going to spend travelling");
        int dias = input.nextInt();
        System.out.println("How much money,in USD, are you goin to spend on your trip");
        int dinelos = input.nextInt();
        System.out.println("What is the three letter currency symbol for your travel destination");
        String three = input.next();
        System.out.println("how many "+three+" are there in 1 USD\n");
        double con = input.nextDouble();

        int horas = dias * 24;
        int minutos = horas * 60;
        System.out.println("if you are travelling for "+dias+" days is the same as "+ horas +" hours or "+minutos+" minutes");
        double ddias = dinelos/dias;
        double fin = con*dinelos;
        System.out.println("if you are going to spend $"+dinelos+" USD that means per day you can spend up to $"+ddias+"USD");
        System.out.println("your total budget is in MXM is "+fin+" MXM , which per day is "+fin/dias+" MXM");

    }
}