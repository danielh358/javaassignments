import static org.junit.Assert.*;
import java.lang.ArithmeticException;

import org.junit.Test;

public class Assignment1Test{  

    PO isOdd = (int x) -> (x%2 ==1) ? true:false;
    PO isPrime = (int x) -> {
        if(x ==1){
            return false;
        }
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
    ArithmeticException e = new ArithmeticException();
    
    @Test  
    public void testisOdd(){  
        assertEquals(false,isOdd.PeformOperation(2));
        assertEquals(true,isOdd.PeformOperation(1));        
    }
    
    @Test
    public void testisPalindrome(){
        assertEquals(true, isPalindrome.PeformOperation(2002));
        assertEquals(true,isPalindrome.PeformOperation(0));
        assertEquals(false, isPalindrome.PeformOperation(321));

    }

    @Test
    public void testisPrime(){
        assertEquals(true,isPrime.PeformOperation(7));
        assertEquals(false,isPrime.PeformOperation(4));
        assertEquals(false,isPrime.PeformOperation(1));
    }
}  

