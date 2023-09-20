import java.util.Scanner;
import java.util.Random;
class main
{
    public static void main(String[] args)
    {
        Scanner reader= new Scanner(System.in);
        String play="yes";
        while(play.equals("yes"))
        {
            Random rand= new Random();
            int randNum= rand.nextInt(75);
            int guess=-1;
            int tries=0;
            System.out.print("HEY! WELCOME TO MY NUMBER GUESSING NAME");
            while(guess!=randNum)
            {
                System.out.print("Guess a number between 1 and 75:");
                guess=reader.nextInt();
                tries++;
                if(guess==randNum)
                {
                    System.out.println("Hooray!! you guessed the correct number");
                    System.out.println("it took you"+ tries +"tries to guess the number");
                    if(tries<5)
                    {
                        System.out.println("you get 5 points");
                    }
                    else
                    {
                        System.out.println("you get 3 points");
                    }
                    System.out.print("would you like to play again? Yes or No: ");
                    play=reader.next().toLowerCase();
                }
                else if(guess>randNum)
                {
                    System.out.println("number too high, try again");
                }
                else
                {
                    System.out.println("number too low, try again");
                }
            }
        }
        reader.close();
    }
}
