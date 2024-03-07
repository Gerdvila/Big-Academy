package swed.it.academy.project;

import java.math.BigDecimal;
import java.util.Scanner;

public class IOManager {

    static final Scanner scanner = new Scanner(System.in);
    private static int userChoice;

    private static double side1;
    // Could be optional due to the fact that some shapes only use constructor with 1 value.
    private static BigDecimal side2;

    public static int getUserChoice(){
        return userChoice;
    }
    public static double getSide1(){
        return side1;
    }
    public static BigDecimal getSide2(){
        return side2;
    }
    public static void chooseShape() {
        System.out.println("What shape are do you want to calculate ?");
        System.out.println("1 Square");
        System.out.println("2 Triangle");
        System.out.println("3 Circle");

        userChoice = scanner.nextInt();

    }

    public static void inputData() throws UnknownShapeException {
        switch (userChoice) {
            case 1:
                System.out.println("What is the length of the square side?");
                side1 = scanner.nextDouble();
                break;
            case 2:
                System.out.println("What is the length of the triangle side?");
                side1 = scanner.nextDouble();
                System.out.println("What is the length of any other triangle side?");
                side2 = scanner.nextBigDecimal();
                break;
            case 3:
                System.out.println("Please enter radius of your circle.");
                side1 = scanner.nextDouble();
                break;
            default:
                scanner.close();
                throw new UnknownShapeException("Unknown shape please enter a valid one next time.");
        }
        scanner.close();
    }
    public static void showCalculatedArea(String shapeRep){
        System.out.println(shapeRep);
        System.out.println("--------------------");
    }

}
