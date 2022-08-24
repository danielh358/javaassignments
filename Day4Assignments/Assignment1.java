package Day4Assignments;

//checks if a singleton class (Assignment1) already exists before instantiating. Does double
//checking - first before sync and next after sync.

public class Assignment1 {
    private volatile static Assignment1 instance;
    
    public static Assignment1 getInstance(){

        if(instance == null){
            synchronized(Assignment1.class){
                if(instance == null){
                    instance = new Assignment1();
                }
            }

        }

        return instance;

    }
    
}
