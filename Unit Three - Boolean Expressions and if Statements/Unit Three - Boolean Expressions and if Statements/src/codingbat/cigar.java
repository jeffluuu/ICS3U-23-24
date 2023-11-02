package codingbat;

public class cigar {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if(cigars >= 40){
          if(isWeekend){
            return true;
          }else{
            return cigars <= 60;
          }
        }
        return false;
      }
      
}
