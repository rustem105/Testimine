package testid;

import java.util.Arrays;
import java.util.Collection;
import static junit.framework.Assert.assertEquals;
import klassid.palk;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class palkTest {
    @Parameterized.Parameters
    public static Collection dotsValues(){
        return Arrays.asList(new Object[][]{
            {1000, 13000, 6010, 2800, 18800.0},
            {1199, 14388, 6000, 12, 12710.4},
            {1200, 14400, 6000.0, 8400.0, 12720.0},
            {1900, 18000, 4860.0, 10000.0, 13200.0},
            {2000, 24000, 666.667, 23333.333, 19333.333},
            {2099, 25188, 6.667, 25181.333, 20151.733},
            {2100, 25200, 0.0, 25200.0, 20160.0},
            {2500, 32000, 6000, 29000, 24000.0},
        });
    }
    
    palk PalkTax = new palk();
    
    int palk, expAastaPalk;
    double expTaxFreePalk, expTaxPalk, expTaxProtsent;
    
    public palkTest(int palk, int AastaPalk, double taxFreePalk, double taxPalk, double taxProtsent) {
        this.palk = palk;
        this.expAastaPalk = AastaPalk;
        this.expTaxFreePalk = taxFreePalk;
        this.expTaxPalk = taxPalk;
        this.expTaxProtsent = taxProtsent;
    }
    
    @Test
    public void aastaPalkTest1(){
        int AastaPalk = PalkTax.aastaPalk(palk);
        assertEquals(expAastaPalk, AastaPalk);
    }
    @Test
    public void taxFreePalkTest2(){
        double taxFreePalk = PalkTax.taxFreePalk(palk);
        assertEquals(expTaxFreePalk, taxFreePalk, 0.001);
    }
    @Test
    public void taxPalkTest3(){
        double taxPalk = PalkTax.taxPalk(palk);
        assertEquals(expTaxPalk, taxPalk, 0.001);
    }
    @Test
    public void taxPalkaProtsentTest4(){
        double taxProtsent = PalkTax.taxPalkaProtsent(palk);
        assertEquals(expTaxProtsent, taxProtsent, 0.001);
    }
    
}