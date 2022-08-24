import java.util.Scanner;
import java.io.FileReader;

public class Assignment3 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int totalEcount = 0;

        while(true){
            System.out.print("Enter a file path or Q to quit:\n");
            
            String filename = input.nextLine();
            if(filename.equals("Q")){
                break;
                
            }
            try{

            
                FileReader filer = new FileReader(filename);
                int i;
                while((i = filer.read()) != -1){
                    if(i == 'e' || i == 'E'){
                        totalEcount++;
                    }

                }
                filer.close();

                
                System.out.printf("The total amount of the letter E in the file is %d \n", totalEcount);
                
            }
            catch(Exception e) {
                System.out.print("Error reading directory. Please try again.\n");
                continue;

            }
        }
        input.close();



    }
    
}
