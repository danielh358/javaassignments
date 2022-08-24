import java.io.File;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("Enter a file path or Q to quit:\n");

            
            
            String filename = input.nextLine();
            if(filename.equals("Q")){
                break;
                
            }
            try{

            
                File directorypath = new File(filename);
                String directory[] = directorypath.list();
                System.out.print("Here is the list of directories:\n");
                for( int i = 0; i < directory.length; i++){
                    System.out.println(directory[i]);

                }
                
            }
            catch(Exception e) {
                System.out.print("Error reading directory. Please try again.\n");
                continue;

            }
        }
        input.close();



    }

}

