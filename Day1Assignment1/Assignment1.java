import java.util.Scanner;

public class Assignment1{
    public static void main(String[] args){
        System.out.print("Input integer amount of rows > 0: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
//Question 1
        System.out.print("\n1:\n");
        int temp = number;
        for(int i=1; i <= number; i++){
            for(int j=1; j <= i; j++){
                System.out.print('*');
            }
            System.out.print('\n');
        }
//Question 2
        System.out.print("\n2:\n");
        for(int i=1; i <= number; i++){
            for(int j=1; j <= temp; j++){
                System.out.print('*');
            }
            System.out.print('\n');
            temp--;
        }
//Question 3
        System.out.print("\n3:\n");
        temp = (int)(number/2);
        for(int j=1; j <= temp +1; j++){
            System.out.print(' ');
        }
        System.out.print("*\n");
        for(int i=1; i <= number/2; i++){
            for(int j=1; j <= temp ; j++){
                System.out.print(' ');
            }
            for(int j=1; j <= i *2 +1; j++){
                System.out.print('*');
            }
            
            System.out.print('\n');
            temp--;
        }
//Question 4
        System.out.print("\n4:\n");
        temp = 0;
        while(temp < (int)number/2){
            for(int j=0; j <= temp; j++){
                System.out.print(' ');
            }
            for(int j=(int)number; j >= temp*2; j--){
                System.out.print('*');
            }
            
            System.out.print('\n');
            temp++;
        }
        for(int j=1; j <= temp +1; j++){
            System.out.print(' ');
        }
        System.out.print("*\n");
        




        input.close();
        
    }
}

