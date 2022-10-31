package developer;

public class DeveloperLogic {
    
    public DeveloperLogic() {
    }
    
    public int calculateHourRate(developer developer) {
        return developer.getSalary() / 20 / 8;
    }

    public int calculateAnnualSalary(developer developer) {
        return developer.getSalary() * 12;
    }
}
