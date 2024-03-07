package swed.it.academy.project;

import java.math.BigDecimal;

public class Square extends Shape {
    public Square(BigDecimal side) {
        super(side, side);
    }

    @Override
    public void calculateArea() {
        super.rectangleArea();
    }
}
