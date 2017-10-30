// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
public class Rock
{
    public static void main(String[] args)
    {
        String personPlay = "";    //User's play -- "R", "P", or "S"
        String computerPlay = "";  //Computer's play -- "R", "P", or "S"
        int computerInt;      //Randomly generated number used to determine
                              //computer's play
        Random generator = new Random();
        Scanner player = new Scanner(System.in);
        
        //Get player's play -- note that this is stored as a string
        //Make player's play uppercase for ease of comparison
        System.out.print ("Enter R (Rock), P (Paper), or S (Scissors)");
        personPlay = player.next();
        personPlay = personPlay.toUpperCase();
        
        System.out.print ("Enter your play: R, P, or S");
        personPlay = player.next();
        
        //Generate computer's play (0,1,2)
        computerInt = generator.nextInt(3) + 1;
        
        //Translate computer's randomly generated play to string
        if (computerInt == 1) {
            computerPlay = "R";
        }
        if (computerInt == 2) {
            computerPlay = "P";
        }
        if (computerInt == 3) {
            computerPlay = "S";
        }
        
        //Print computer's play
        System.out.println("The computer plays " + computerPlay);
        
        System.out.println("You played " + personPlay);
        
        //See who won.
        if (computerPlay.equals("S") && personPlay.equals("S")){
            System.out.println("It's a tie");
        }
        if (computerPlay.equals("R") && personPlay.equals("R")){
            System.out.println("It's a tie");
        }
        if (computerPlay.equals("P") && personPlay.equals("P")){
            System.out.println("It's a tie");
        }
        if (computerPlay.equals("S") && personPlay.equals("P")){
            System.out.println("Computer Wins");
        }
        if (computerPlay.equals("R") && personPlay.equals("S")){
            System.out.println("Computer Wins");
        }
        if (computerPlay.equals("P") && personPlay.equals("R")){
            System.out.println("Computer Wins");
        }
        if (computerPlay.equals("P") && personPlay.equals("S")){
            System.out.println("Player Wins");
        }
        if (computerPlay.equals("S") && personPlay.equals("R")){
            System.out.println("Player Wins");
        }
        if (computerPlay.equals("R") && personPlay.equals("P")){
            System.out.println("Player Wins");
        }
    }
}
