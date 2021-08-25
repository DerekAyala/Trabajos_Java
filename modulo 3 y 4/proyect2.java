
import java.util.*;
public class proyect2 {
    public static Maze myMap = new Maze();

    public static void main(String[] args) {
        intro();
        userMover();
    }
    public static void intro() {
        System.out.println("Welcome to Maze Runner!\n" +
        "Here is your current position:");
        myMap.printMap();
    }
    public static void userMover() {
        int move = 0;
        while (myMap.didIWin() == false) {
            boolean correct = true;
            System.out.println("Where would you like to move? (R, L, U, D)");
            Scanner input = new Scanner(System.in);
            String dir = input.next();
            while (correct == true) {
                if (dir.equalsIgnoreCase("R") || dir.equalsIgnoreCase("L") || dir.equalsIgnoreCase("U") ||dir.equalsIgnoreCase("D")) {
                    correct = false;    
                } else {
                    System.out.println("Where would you like to move? (R, L, U, D)");
                    dir = input.next();
                }
            }
            if (myMap.isThereAPit(dir)== true) {
                System.out.println("Watch out! There's a pit ahead, jump it?");
                String decision = input.next();
                if (decision.startsWith("y")) {
                    myMap.jumpOverPit(dir);
                    myMap.printMap();
                    continue;
                }
            }
            boolean via = false;
            if (dir.equalsIgnoreCase("R")) {
                via = myMap.canIMoveRight();
            }else if (dir.equalsIgnoreCase("L")) {
                via = myMap.canIMoveLeft();
            }else if (dir.equalsIgnoreCase("U")) {
                via = myMap.canIMoveUp();
            }else {
                via = myMap.canIMoveDown();
            }
            if (via == true) {
                if (dir.equalsIgnoreCase("R")) {
                    myMap.moveRight();
                }
                if (dir.equalsIgnoreCase("L")) {
                    myMap.moveLeft();
                }
                if (dir.equalsIgnoreCase("U")) {
                    myMap.moveUp();
                }
                if (dir.equalsIgnoreCase("D")) {
                    myMap.moveDown();
                }
                myMap.printMap();

            }else {
                System.out.println("Sorry, you’ve hit a wall.");
                myMap.printMap();
            }
            move += 1;
            moveMessage(move);
        }
        System.out.println("Congratulations, you made it out alive" + 
        " and you did it in " + move + " moves!");
    }   
    public static void moveMessage(int move) {
        if (move == 50) {
            System.out.println("Warning: You have made 50 moves, you have 50 remaining before the maze exit closes");
        }else if(move ==75) {
            System.out.println("Alert! You have made 75 moves, you only have 25 moves left to escape.");
        }else if (move == 90) {
            System.out.println("DANGER! You have made 90 moves, you only have 10 moves left to escape!!");
        }else if (move == 100) {
            System.out.println("Oh no! You took too long to escape, and now the maze exit is closed FOREVER >:[");
        }else if ( move == 101) {
            System.out.println("Sorry, but you didn't escape in time- you lose!");
            return;
        }

    }

}