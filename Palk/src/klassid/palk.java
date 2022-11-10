package klassid;

public class palk {
    
    public palk() {
    }
    
	public int aastaPalk(int kuuPalk){
            return kuuPalk*12;
	}
	
	public double taxFreePalk(int kuuPalk){   //maksuvaba summa
            if(aastaPalk(kuuPalk) <= 14400){
                return 6000;
            } else if(aastaPalk(kuuPalk) >= 25200){
                return 0;
            } else {
                return 6000 - 6000d/10800d*(aastaPalk(kuuPalk) - 14400);
            }
	}
        
	public double taxPalk(int kuuPalk){       //maksustatav summa
            if(aastaPalk(kuuPalk) < 14400){
                return 14400 - aastaPalk(kuuPalk);
            } else if(aastaPalk(kuuPalk) > 25200){
                return aastaPalk(kuuPalk);
            } else {
                return aastaPalk(kuuPalk) - (6000 - 6000d/10800d*(aastaPalk(kuuPalk) - 14400));
            }
	}
	
	public double taxPalkaProtsent(int kuuPalk){
            return aastaPalk(kuuPalk) - (aastaPalk(kuuPalk) - taxFreePalk(kuuPalk)) * 0.2;
	}
}
