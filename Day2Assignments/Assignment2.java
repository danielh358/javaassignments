import java.util.Random;

public class Assignment2 {
    public static void main(String[] args){
        Random rgen = new Random();
        int testarray[][] = new int[5][5];
        for(int i = 0; i <5; i++){
            for( int j = 0; j <5; j++){
                int value = rgen.nextInt(1000);
                testarray[i][j] = value;
                
            }
        }
        int max = testarray[0][0];
        for(int i = 0; i <5; i++){
            for( int j = 0; j <5; j++){
                if(testarray[i][j] > max) {
                    max = testarray[i][j];
                }
                
            }
        }

        System.out.printf("The max is %d%n", max);





        

    
    }
    
}
