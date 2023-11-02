package codingbat;

public class alarm {
    public String alarmClock(int day, boolean vacation) {
        boolean inBound = 1 <= day && day<=5;
        if(vacation){
          if(inBound) return "10:00";
          return "off";
        }
        if(inBound) return "7:00";
        return "10:00";
      }
}
