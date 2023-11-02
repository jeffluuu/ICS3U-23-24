package codingbat;

public class squirrel {
    public boolean squirrelPlay(int temp, boolean isSummer) {
        if(60 <= temp && temp <= 100 && isSummer) return true;
        if(60 <= temp && temp <= 90) return true;
        return false;
      }
      
}
