package codingbat;

public class date {
    public int dateFashion(int you, int date) {
        if((you > 2 && date > 2) && (you >= 8 || date >= 8)) return 2;
        if(you <= 2 || date <= 2) return 0; return 1;
      }
      
}
