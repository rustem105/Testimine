package testid;

import org.junit.Test;
import klassid.ruut;
import static org.junit.Assert.assertEquals;

public class RuutjuuredTest {

    
    public RuutjuuredTest() {
    }
    
    @Test
    public void test_sum(){
        ruut ruut = new ruut();
        float[] rootsArray = ruut.quadraticEquation(1, 3, 2);
        assertEquals(-1, rootsArray[0], 0.001);
        assertEquals(-2, rootsArray[1], 0.001);
    }
}
