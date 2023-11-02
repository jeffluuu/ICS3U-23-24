package codingbat;

public class order {
    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if(!bOk){
         if(c > b && b > a) return true; 
        }else{
         if(c > b) return true; 
        }
        return false;
      }
      
}
