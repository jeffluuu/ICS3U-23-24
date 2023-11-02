package codingbat;

public class lessby {
    public boolean lessBy10(int a, int b, int c) {
        return(a - 10 >= b || a - 10 >= c || b - 10 >= a || b - 10 >= c || c - 10 >= a || c -10 >= b);
      }
      
}
