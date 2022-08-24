import static org.junit.Assert.*;
import java.lang.ArithmeticException;

import org.junit.Test;

public class LineTest{  

    Line test1 = new Line(0.0,0.0,1.0,1.0);
    Line test2 = new Line(0.0,0.0,3.0,4.0);
    Line test3 = new Line(0.0,0.0,1.0,0.0);
    Line test4 = new Line(0.0,0.0,1.0,2.0);
    Line test5 = new Line(4.0,4.0,5.0,5.0);
    Line test6 = new Line(0.0,1.0,0.0,2.0);
    Line test7 = new Line(0.0,0.0,-10.0,-30);
    ArithmeticException e = new ArithmeticException();
    
    @Test  
    public void testgetSlope(){  
        assertEquals(1,test1.getSlope(),.0001);
        assertEquals(2,test4.getSlope(),.0001);
        
    }
    
    @Test
    public void testgetDistance(){
        assertEquals(5,test2.getDistance(),.0001);

    }

    @Test
    public void testparallelto(){
        assertTrue(test1.parallelTo(test5));
    }
}  

