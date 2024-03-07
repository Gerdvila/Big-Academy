package swed.it.academy.project;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Triangle extends Shape {
    public Triangle(BigDecimal side1, BigDecimal side2) {
        super(side1, side2);
    }

    @Override
    public void calculateArea() {
        super.rectangleArea();
        BigDecimal triangleArea = super.getArea().divide(BigDecimal.TWO,2,RoundingMode.HALF_UP);
        super.setArea(triangleArea);
    }
}
