package swed.it.academy.project;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle extends Shape {

    public Circle(BigDecimal side1) {
        super(side1,side1);
    }

    @Override
    public void calculateArea() {
        super.rectangleArea();

        BigDecimal circleArea = super.getArea().multiply(BigDecimal.valueOf(Math.PI));
        circleArea = circleArea.setScale(2, RoundingMode.UP);

        super.setArea(circleArea);
    }
}
