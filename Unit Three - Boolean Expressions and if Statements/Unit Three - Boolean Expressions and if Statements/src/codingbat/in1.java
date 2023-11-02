package codingbat;

public class in1 {
    public boolean in1To10(int n, boolean outsideMode) {
        if(outsideMode){
          return (n <= 1 || n >= 10); 
        }else{
          return (n >= 1 && n <= 10);
        }
      }
      
}
