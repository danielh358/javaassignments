import java.util.Scanner;
import java.util.ArrayList;
interface PO
{
    boolean PeformOperation(int x);
  
    default void noOperartion()
    {
    }
}

public class Assignment1 {

    public static void main(String[] args){
        PO isOdd = (int x) -> (x%2 ==1) ? true:false;
        PO isPrime = (int x) -> {
            if(x==1) return false;
            boolean prime = true;
            for(int i = x/2;i>1;i--){
                if(x%i == 0){
                    prime = false;
                }
            }
            return prime;
        };
        PO isPalindrome = (int x) ->{
            boolean palindrome = true;
            char[] checking = Integer.toString(x).toCharArray();
            for(int i = 0 ;i<checking.length/2;i++){
                if(checking[i] != checking[checking.length -1 -i]){
                    palindrome=false;

                }
            }
            return palindrome;
        };

        //Sample output
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter a number of integers to be tested.");
        int loops = getInput.nextInt();
        ArrayList<Integer> totalTest = new ArrayList<Integer>();
        ArrayList<Integer> totalInput = new ArrayList<Integer>();
        for(int i=0; i<loops; i++){
            System.out.println("Enter test to run: 1 for odd, 2 for prime, 3 for palindrome.");
            int test = getInput.nextInt();
            System.out.println("Enter an integer to test.");
            int input = getInput.nextInt();
            totalTest.add(test);
            totalInput.add(input);
            
        }

        for(int i=0; i <loops; i++){
            int finaltest = totalTest.get(i);
            int finalinput = totalInput.get(i);
            if(finaltest == 1){
                if(isOdd.PeformOperation(finalinput)){
                    System.out.println("ODD");
                }
                else{
                    System.out.println("EVEN");
                }
            }
            else if(finaltest == 2){
                if(isPrime.PeformOperation(finalinput)){
                    System.out.println("PRIME");
                }
                else{
                    System.out.println("COMPOSITE");
                }
            }
            else{
                if(isPalindrome.PeformOperation(finalinput)){
                    System.out.println("PALINDROME");
                }
                else{
                    System.out.println("NOT PALINDROME");
                }

            }
        }

        

        getInput.close();


    }
    
}
