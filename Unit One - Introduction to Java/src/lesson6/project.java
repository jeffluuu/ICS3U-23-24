package lesson6;
import java.util.Scanner;

public class project {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("");

        System.out.println("Enter length");
        double length = scanner.nextDouble();

        System.out.println("Enter shallowLength");
        double shallowLength = scanner.nextDouble();

        System.out.println("Enter transition");
        double transition = scanner.nextDouble();

        System.out.println("Enter shallowheight");
        double shallowHeight = scanner.nextDouble();

        System.out.println("Enter deepheight");
        double deepHeight = scanner.nextDouble();

        System.out.println("Enter width");
        double width = scanner.nextDouble();

        System.out.println("Enter liner cost");
        double linerCost = scanner.nextDouble();

        System.out.println(linerCost);
        /*
        int length = 20;
        int shallowLength = 5;
        int transition = 7;
        int shallowHeight = 3;
        int deepHeight = 8;
        int width = 8;

        int linerCost = 2;
        */

        double heightDifference = deepHeight - shallowHeight;
        double dimensionArea = length * deepHeight;
        double shallowRemovedArea = shallowLength * heightDifference;

        double transitionLength = Math.sqrt(Math.pow(transition, 2) - Math.pow(heightDifference, 2));
        double transitionArea = (transitionLength * heightDifference) / 2;
        double area = dimensionArea - shallowRemovedArea - transitionArea;
        double volume = area * width * 0.9;
        double deepHeightArea = deepHeight * width;
        double shallowHeightArea = shallowHeight * width;
        double shallowLengthArea = shallowLength* width;
        double deepEndArea = (length - shallowLength - transitionLength)*width;
        double newTransitionArea = transition * width;
        double surfaceArea = area * 2 + deepHeightArea + shallowHeightArea + shallowLengthArea + deepEndArea + newTransitionArea;
        double costOfLiner = surfaceArea*linerCost;

        System.out.println("Volume is: " + volume + "m^3");
        System.out.println("Surface Area: " + surfaceArea +"m^2");
        System.out.println("Cost of liner: " + "$" + costOfLiner);
    }    
}
