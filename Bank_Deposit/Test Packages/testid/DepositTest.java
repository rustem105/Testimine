

package testid;

import static junit.framework.Assert.assertEquals;
import klassid.deposit;
import org.junit.Test;

public class DepositTest {
    public DepositTest() {
    }
    
    @Test
    public void test_deposiit(){
        deposit dep = new deposit();
        double[] test = dep.deposit(5);
        assertEquals(1102.5, test[0], 0.01);
        assertEquals(2, test[1], 0.0);
    }
    
}

