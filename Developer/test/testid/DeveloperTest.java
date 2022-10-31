package testid;


import developer.DeveloperLogic;
import developer.developer;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DeveloperTest {
    developer dvlog = new developer(
    "Nikolai", 
    "Efremov", 
    "Kokk", 
    2400);
    DeveloperLogic devlogic = new DeveloperLogic();
    
    public DeveloperTest() {
    }
    
    @Test
    public void EesnimiTest1(){
        String name = dvlog.getFirsName();
        assertEquals("Nikolai", name);
    }
    @Test
    public void PerekonnanimiTest2(){
        String lastname = dvlog.getLastName();
        assertEquals("Efremov", lastname);
    }
    @Test
    public void ErialaTest3(){
        String speciality = dvlog.getSpecialty();
        assertEquals("Kokk", speciality);
    }
    @Test
    public void PalkTest3(){
        int salary = dvlog.getSalary();
        assertEquals(2400, salary);
    }
    @Test
    public void TunniPalkTest4(){
        int hourRate = dvlog.calculateHourRate(dvlog);
        assertEquals(15, hourRate);
    }
    
    @Test
    public void AastaPalk5(){
        int annualSalary = dvlog.calculateAnnualSalary(dvlog);
        assertEquals(28800, annualSalary);
    }
}

