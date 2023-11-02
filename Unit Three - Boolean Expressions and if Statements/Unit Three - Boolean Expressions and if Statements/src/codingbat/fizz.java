package codingbat;

public class fizz {
    public String fizzString(String str) {
        if(str.substring(0,1).equals("f") && str.substring(str.length()-1).equals("b")) return "FizzBuzz";
        if(str.substring(0,1).equals("f")) return "Fizz";
        if(str.substring(str.length()-1).equals("b")) return "Buzz";
        return str;
      }
      
}
