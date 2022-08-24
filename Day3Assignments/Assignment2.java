import java.io.FileWriter;
import java.util.Scanner;

public class Assignment2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("Enter a file path or Q to quit:\n");

            
            
            String filename = input.nextLine();
            if(filename.equals("Q")){
                break;
                
            }
            try{
                            
                FileWriter filew = new FileWriter(filename, true);
                System.out.print("Enter a string of text to add the text file:\n");
                String textAdd = input.nextLine();
                filew.write(textAdd);
                filew.close();

                
                
            }
            catch(Exception e) {
                System.out.print("Error reading file. Please try again.\n");
                continue;

            }
        }
        input.close();



    }
    
}
