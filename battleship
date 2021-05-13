
/**
 * Game of battelship between 2 people
 *
 * @author (Aidan Schmidt)
 * @version (05/06/2021)
 */
import java.util.Scanner;
import java.util.Arrays;
public class battleship
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    
    int player1Tries = 0;
    int player2Tries = 0;
    
    System.out.println("Welcome to battleship. Enter 1 for an empty space and enter a 2 for where you want to palce your ship\nPlayer 1: Set your battleship in a row.");
    int[] ships = new int[6];
    for(int i = 0; i < 6; i++){
    System.out.println("Enter a 1 or 2 please"+(i+1));
    ships[i] = in.nextInt();
    }
    
    System.out.println("Player 2: enter where you would like to place your ships");
    int[] ships2 = new int[6];
    for(int i = 0; i < 6; i++){
    System.out.println("Enter a 1 or 2 please"+(i+1));
    ships2[i] = in.nextInt();
    }
    
    System.out.println("Player 1: Make a guess of where the ship is");
    int[] shipsGuess = new int[6];
    for(int i = 0; i < 6; i++){
    System.out.println("Enter a 1 or 2 please"+(i+1));
    shipsGuess[i] = in.nextInt();
    }
    boolean status = Arrays.equals(ships2, shipsGuess);
    
    if(status == true){
        System.out.println("Sunk BattleShip");
    }else{
        System.out.println("Miss, try again");
        System.out.println("Player 1: Make a guess of where the ship is");
        player1Tries++;
        for(int i = 0; i < 6; i++){
            System.out.println("Enter a 1 or 2 please"+(i+1));
            shipsGuess[i] = in.nextInt();
    }
}

System.out.println("Player 2: Make a guess of where the ship is");
    int[] shipsGuess2 = new int[6];
    for(int i = 0; i < 6; i++){
    System.out.println("Enter a 1 or 2 please"+(i+1));
    shipsGuess2[i] = in.nextInt();
    }
    boolean status2 = Arrays.equals(ships, shipsGuess2);
    
    if(status2 == true){
        System.out.println("Sunk BattleShip");
    }else{
        System.out.println("Miss, try again");
        System.out.println("Player 1: Make a guess of where the ship is");
        player1Tries++;
        for(int i = 0; i < 6; i++){
            System.out.println("Enter a 1 or 2 please"+(i+1));
            shipsGuess[i] = in.nextInt();
    }
}
}
}
