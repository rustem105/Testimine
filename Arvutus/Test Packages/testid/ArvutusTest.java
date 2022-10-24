package testid;
import klassid.arvutus;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArvutusTest {

    public ArvutusTest() {
        
    }
    @Test
    public void test_Sum(){
        arvutus obj = new arvutus();//sozdanie objekta
        //vyzov metoda sum
        double tulemus = obj.Sum(5.0,6.0);
        assertEquals(11, tulemus, 0.001); //11 eto ozidaemoe znachenie
    }
    
    @Test
    public void test_Sum1(){
        arvutus obj = new arvutus();//sozdanie objekta
        //vyzov metoda sum
        double tulemus = obj.Sum(10.0,20.0);
        assertEquals(30, tulemus, 0.001);
    }
    
    @Test
    public void test_Subtraction(){
        arvutus obj = new arvutus();//sozdanie objekta
        //vyzov metoda Subtraction
        double tulemus = obj.Subtraction(6.0,4.0);
        assertEquals(2, tulemus, 0.001);
    }
    
    @Test
    public void test_Multiplication(){
        arvutus obj = new arvutus();//sozdanie objekta
        //vyzov metoda multiplication
        double tulemus = obj.Multiplication(2.0,4.0);
        assertEquals(8, tulemus, 0.001);
    }
    
    @Test
    public void test_Division(){
        arvutus obj = new arvutus();//sozdanie objekta
        //vyzov metoda division
        double tulemus = obj.Division(6.0,2.0);
        assertEquals(3, tulemus, 0.001);
    }
}