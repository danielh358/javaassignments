import java.util.Scanner;

public class Assignment1{
    public static void main(String[] args){
        
        System.out.print("Enter a number:\n");
        Scanner input1 = new Scanner(System.in);
        int sum = input1.nextInt();
        int input2 = 0;
        boolean finished = false;

        while(!finished){
            System.out.print("\nEnter a number to add, or enter a non-number to finish:\n");
            try{
                input2 = input1.nextInt();
            }
            catch(Exception e){
                System.out.printf("The sum is %d%n", sum);
                finished = true;

            }
            sum += input2;

            }
        input1.close();
        


    }
}