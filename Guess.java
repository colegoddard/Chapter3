// ****************************************************************
//   Guess.java
//
//   Play a game where the user guesses a number from 1 to 10
//              
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
 
public class Guess
{
    public static void main(String[] args)
        {
          int numToGuess;           //Number the user tries to guess
          int guess;                //The user's guess
 
          Scanner scan = new Scanner(System.in);
          Random generator = new Random();
 
          //randomly generate the  number to guess
          numToGuess = generator.nextInt(10) + 1;
          
          //print message asking user to enter a guess
          System.out.println("Guess a number 0-10");
          
          //read in guess
          guess = scan.nextInt();
          int guessCount = 1;
          int highGuess = 0;
          int lowGuess = 0;
          
          while (guess != numToGuess)  //keep going as long as the guess is wrong
          {
                  //print message saying guess is wrong
                  System.out.println("Your guess of " + guess + " is incorrect");
                  if (guess > numToGuess) {
                      System.out.println("Your guess was too high");
                      highGuess += 1;
                  }
                  if (guess < numToGuess) {
                      System.out.println("Your guess was too low");
                      lowGuess += 1;
                  }
                  
                  //get another guess from the user
                  System.out.println("Guess another number 0-10");
                  guess = scan.nextInt();
                  guessCount += 1;
          }
 
          //print message saying guess is right
          System.out.println("You guessed " + guess + ",and the generated number was " + numToGuess + ",so your guess was correct");
          System.out.println("You took " + guessCount + " guesses to guess the generated number");
          System.out.println(highGuess + " of your guesses were too high");
          System.out.println(lowGuess + " of your guesses were too low");
    }
}
 
