package testid;

import klassid.temp;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pupil
 */
public class TempTest {
    
    public TempTest() {
    }
    
    @Test
    public void temp_Testimine(){
        temp obj=new temp();
        double tulemus=obj.TF(45.0);
        assertEquals(113.0, tulemus, 0.1); 
    }
    
    @Test
    public void temp_Testimine1(){
        temp obj=new temp();
        double tulemus=obj.TF(-5.0);
        assertEquals(23.0, tulemus, 0.1); 
    }
    
    @Test
    public void temp_Testimine2(){
        temp obj=new temp();
        double tulemus=obj.TF(24.00);
        assertEquals(75.2, tulemus, 0.1); 
    }
    
    @Test
    public void temp_Testimine3(){
        temp obj=new temp();
        double tulemus=obj.TF(-32.0);
        assertEquals(-25.6, tulemus, 0.1);
    }
    
    @Test
    public void temp_Testimine4(){
        temp obj=new temp();
        double tulemus=obj.TF(15.0);
        assertEquals(59.0, tulemus, 0.1); 
    }
    
    @Test
    public void temp_Testimine5(){
        temp obj=new temp();
        double tulemus=obj.TF(-75.0);
        assertEquals(-103.0, tulemus, 0.1); 
    }
}
