import java.util.Random;
import java.util.Scanner;
public class Assignment2{
    public static void main(String[] args){
        int tries = 1;
        Random rgen = new Random();
        int answer = rgen.nextInt(101) +1;
        
        while(tries <6){
            System.out.print("Enter a number between 1 and 100:\n");
            Scanner input = new Scanner(System.in);
            int guess = input.nextInt();
            if(guess <= answer + 10 && guess >= answer -10){
                System.out.printf("The correct answer is: %d%n", answer);
                input.close();
                tries = 6;
            }
            else{
                if(tries == 5){
                    System.out.printf("Sorry. The answer is: %d%n", answer);
                    tries ++;
                    input.close();
                }
                else if(tries <5){
                    System.out.print("Try again!\n");
                    tries++;
                }
            }


        }

    }
}