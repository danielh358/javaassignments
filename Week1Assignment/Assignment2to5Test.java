import static org.junit.Assert.*;
import java.lang.ArithmeticException;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;
import java.lang.StringBuilder;
public class Assignment2to5Test{  

    List<Integer> test1 = List.of(34,12,34,12,42,43);
    List<Integer> test2 = List.of(0,5,4,1,8);
    List<Integer> test3 = List.of(0);
    List<Integer> testrepeats = List.of(34,12,12,12, 12,42,43);
    List<String> test4 = List.of("xxwasxx", "old", "X", "","doubleXX");

    @Test  
    public void testrightDigit(){ 

        List<Integer> test1a = List.of(4,2,4,2,2,3);
        assertEquals(test1a, Assignment2to5.rightDigit(test1));
        assertEquals(test2, Assignment2to5.rightDigit(test2));
    }
    
    @Test
    public void doubling(){
       List<Integer> test1b = List.of(68,24,68,24,84,86);
       List<Integer> test2b = List.of(0,10,8,2,16);
       assertEquals(test1b, Assignment2to5.doubling(test1));
       assertEquals(test2b, Assignment2to5.doubling(test2));

    }

    @Test
    public void testnoX(){
       List<String> test3a = List.of("was","old","","","double");
       assertEquals(test3a, Assignment2to5.noX(test4));
    }

    @Test
    public void testgroupSumClump(){
        assertEquals(true,Assignment2to5.groupSumClump(0, test1, 46));
        assertEquals(false,Assignment2to5.groupSumClump(0, test1, 4500));
        assertEquals(false,Assignment2to5.groupSumClump(0, testrepeats, 46));
        assertEquals(false,Assignment2to5.groupSumClump(0, test3, 1));

 
    }
}  
