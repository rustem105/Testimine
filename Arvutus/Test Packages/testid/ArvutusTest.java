package testid;

import klassid.arvutus;
import org.junit.Test;
import static org.junit.Assert.*;


public class ArvutusTest {
    public ArvutusTest() {
    }
       
    @Test
        public void test_Sum() {
        arvutus obj=new arvutus();//sozdanie objekta
        //vqzov metoda Sum
        double tulemus=obj.Sum(5.0, 6.0);
        assertEquals(11.0, tulemus,0.001); //11 eto ozqdaemoe znachenie
    }
        
    @Test
        public void test_Sum1() {
        arvutus obj=new arvutus();//sozdanie objekta
        //vqzov metoda Sum
        double tulemus=obj.Sum(1000.0, 5500.0);
        assertEquals(6500.0, tulemus,0.001); //11 eto ozqdaemoe znachenie
    }
}
