package swed.it.academy.project;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;


// var side1 can not be NULL therefore it's a primitive type.
public class IOManager {

    static final Scanner scanner = new Scanner(System.in);
    private static int userChoice;

    private static double side1;

    private static BigDecimal side2;

    public static int getUserChoice() {
        return userChoice;
    }

    public static double getSide1() {
        return side1;
    }

    public static BigDecimal getSide2() {
        return side2;
    }

    public static void chooseShape() {
        System.out.println("What shape are do you want to calculate ?");
        System.out.println("1 Square");
        System.out.println("2 Triangle");
        System.out.println("3 Circle");

        try {
            userChoice = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input please enter 1, 2 or 3.");
            scanner.nextLine();
            chooseShape();
        }

    }

    public static void inputData() throws UnknownShapeException {
        switch (userChoice) {
            case 1:
                System.out.println("Enter the length of the square side:");
                try {
                    side1 = scanner.nextDouble();
                    if (side1 < 0) {
                        System.out.println("Side length must be greater than 0. Please enter a valid number.");
                        scanner.nextLine();
                        inputData();
                    }
                } catch (InputMismatchException e) {

                    System.out.println("Incorrect input please enter a value greater than 0.");
                    scanner.nextLine();
                    inputData();
                }
                break;

            case 2:
                try {
                    System.out.println("What is the length of the triangle side?");
                    side1 = scanner.nextDouble();
                    System.out.println("What is the length of any other triangle side?");
                    side2 = scanner.nextBigDecimal();
                    if (side1 < 0 || (side2.compareTo(BigDecimal.valueOf(0)) == 0 || (side2.compareTo(BigDecimal.valueOf(0)) == -1))) {
                        System.out.println("Incorrect input please enter a value greater than 0.");
                        scanner.nextLine();
                        inputData();
                    }
                } catch (InputMismatchException e) {

                    System.out.println("Incorrect input please enter a value greater than 0 ");
                    scanner.nextLine();
                    inputData();
                }
                break;
            case 3:
                System.out.println("Please enter radius of your circle.");
                try {
                    side1 = scanner.nextDouble();
                    if (side1 < 0) {
                        System.out.println("Side length must be greater than 0. Please enter a valid number.");
                        scanner.nextLine();
                        inputData();
                        return;
                    }
                } catch (InputMismatchException e) {

                    System.out.println("Incorrect input please enter a value greater than 0.");
                    scanner.nextLine();
                    inputData();
                }
                break;
            default:
                scanner.close();
                throw new UnknownShapeException("Unknown shape please enter a valid one next time.");
        }
        scanner.close();
    }

    public static void showCalculatedArea(String shapeRep) {
        System.out.println(shapeRep);
        System.out.println("--------------------");
    }

}
