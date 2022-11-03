package klassid;

public class KaksPunktiKaugus {
    
   public KaksPunktiKaugus() {
   } 
   public double distance(int x1, int y1, int x2, int y2){
       return Math.abs(Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
   }
}
