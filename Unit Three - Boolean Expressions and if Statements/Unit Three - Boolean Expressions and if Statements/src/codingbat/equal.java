package codingbat;

public class equal {
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (a <= b && b <= c && equalOk) return true;
        if(a < b && b < c) return true;
        return false;
      }
      
}
