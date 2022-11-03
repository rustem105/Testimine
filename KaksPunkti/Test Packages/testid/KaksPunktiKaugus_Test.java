package testid;

import java.util.Arrays;
import java.util.Collection;
import klassid.KaksPunktiKaugus;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class KaksPunktiKaugus_Test {
   @Parameters 
   public static Collection punktiVäärtused(){
        return Arrays.asList(new Object[][]{
            {80, 251, -69, 87, 221.578}, {-28, 14, 5, 8, 11.485}, {55, 44, 373, -22, 324.776}, {0, -351, 2, 3, 43.333}, {883, 1, -75, 82, 961.418}, {6, -686, 5, 55, 5.555},
        });
    }

    KaksPunktiKaugus tdd = new KaksPunktiKaugus();
    int x1, y1, x2, y2;
    double expDistance;

    public KaksPunktiKaugus_Test(int x1, int y1, int x2, int y2, double expDistance) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.expDistance = expDistance;
    }
    
    @Test
    public void PunktiKauguseTestimine1(){
        double distance = tdd.distance(x1, y1, x2, y2);
        assertEquals(expDistance, distance, 0.001);
    }
}
