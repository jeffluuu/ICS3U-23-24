package lesson1;
public class BooleanExamples {
    public static void main(String[] args) {
        boolean isHappy = true;
        boolean hasBlueShoes = false;

        System.out.println(isHappy);
        System.out.println(hasBlueShoes);

        System.out.println(4>3);
        System.out.println(4<3);

        System.out.println(4>=3);
        System.out.println(4<=3);

        System.out.println(4==3);

        String str = "Hello";
        System.out.println("Hi".equals(str)); 
        System.out.println("Hello".equals(str));

        System.out.println(4!=3);
        System.out.println(!isHappy);

        System.out.println(!"Hello".equals(str));
    }
}
