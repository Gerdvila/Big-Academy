package swed.it.academy.project;

import java.math.BigDecimal;

public class AreaCalculator {

    public static void main(String[] args) {
        runCalculator();
    }

    private static void runCalculator() {
        talkToUser();
        outputResult();
    }

    private static void talkToUser() {

        IOManager.chooseShape();

        try {
            IOManager.inputData();
        } catch (UnknownShapeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void outputResult() {
        Shape shape =
                switch (IOManager.getUserChoice()) {
                    case 1 -> {
                        yield new Square(BigDecimal.valueOf(IOManager.getSide1()));
                    }
                    case 2 -> {
                        yield new Triangle(BigDecimal.valueOf(IOManager.getSide1()), IOManager.getSide2());
                    }
                    case 3 -> {
                        yield new Circle(BigDecimal.valueOf(IOManager.getSide1()));
                    }
                    default -> {
                        yield null;
                    }

                };
        if (shape != null ){
            shape.calculateArea();
            IOManager.showCalculatedArea(shape.toString());
        }


    }

}

