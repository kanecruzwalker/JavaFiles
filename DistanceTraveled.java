import java.util.Scanner;

public class DistanceTraveled {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner (System.in);
       
        // User Input Variables
        int guess;

        // Calculation Variables
        int speed;
        int time1;
        int time2;
        int time3;
        int distance1;
        int distance2;
        int distance3;

        // Speed of travel
        speed = 60;
        
        // Different time intervals
        time1 = 5;
        time2 = 8;
        time3 = 12;

        // Distance based on time intervals
        distance1 = speed * time1;
        distance2 = speed * time2;
        distance3 = speed * time3;
        
        // Output
        // used .print() to interact with user
        // saving their guess to compare to actual value
        // future development, boolean, if guess = proper distance congrats, else, the actual distance is
        System.out.print("If you were driving at 60 miles an hour, how far will you have driven if 5 hours have passed?");
        guess = keyboard.nextInt();
        System.out.println("You guessed " + guess + ".The actual distance is " + distance1+ ".");

        System.out.print("If you were driving at 60 miles an hour, how far will you have driven if 8 hours have passed?");
        guess = keyboard.nextInt();
        System.out.println("You guessed " + guess + ". The actual distance is " + distance2 + ".");

        System.out.print("If you were driving at 60 miles an hour, how far will you have driven if 12 hours have passed?");
        guess = keyboard.nextInt();
        System.out.println("You guessed " + guess + ". The actual distance is " + distance3 + ".");
        
        System.out.println("That's all folks. Thanks for playing");
        //Design a program that displays the distance a car will travel if going 
        //60 mph at 5, 8, & 12 hrs.

        // Declare Variables
        // Distance 1, Distance 2, Distance  , Speed , Time 1, Time 2, Time 3

        // Program Logic

        // Outcome
    }
}
