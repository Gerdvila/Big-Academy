package swed.it.academy.project;

import java.math.BigDecimal;

public abstract class Shape {
    private BigDecimal area;
    private final BigDecimal side1;
    private final BigDecimal side2;

    public Shape(BigDecimal side1, BigDecimal side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public abstract void calculateArea();

    public void rectangleArea() {
        this.area = (this.side1).multiply(this.side2);
    }

    public BigDecimal getArea() {
        return area;
    }

    public void setArea(BigDecimal area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "The area of your shape is " + this.area + " cm.";
    }
}