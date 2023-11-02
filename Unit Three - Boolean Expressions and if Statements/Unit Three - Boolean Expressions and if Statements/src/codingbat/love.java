package codingbat;

public class love {
    public boolean love6(int a, int b) {
        if(a == 6 || b == 6) return true;
        if(Math.abs(a - b) == 6 || a + b == 6) return true;
        return false;
      }
}
