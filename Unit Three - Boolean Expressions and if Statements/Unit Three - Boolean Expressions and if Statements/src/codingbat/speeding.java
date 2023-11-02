package codingbat;

public class speeding {
    public int caughtSpeeding(int speed, boolean isBirthday) {
        int birthdayBoost = 0;
        if(isBirthday){
          birthdayBoost+=5;
        }
        int lowerBound = 61 + birthdayBoost;
        int higherBound = 80 + birthdayBoost;
        int ticket2Bound = 81 + birthdayBoost;
        if(speed >= lowerBound &&speed <= higherBound){
          return 1;
        }else if(speed >= ticket2Bound){
          return 2;
        }
        return 0;
      }
      
}
