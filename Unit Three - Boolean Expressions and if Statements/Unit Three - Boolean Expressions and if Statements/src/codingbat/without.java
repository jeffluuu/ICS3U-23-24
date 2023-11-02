package codingbat;

public class without {
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if(die1 == die2 && noDoubles){
          if(die1 == 6 || die2 == 6){
            if(die1 == 6){
              return(die2 + 1);
            }else if(die2 == 6){
              return(die1 + 1);
            }
          }
          return die1+die2+1;
        }
        return die1+die2;
      }
      
}
