package entities;

import entities.enums.Color;

public class Rectangle2 extends Shape {

    private Double width;
    private Double height;

    public Rectangle2 () {
        super();
    }

    public Rectangle2(Color color, Double height, Double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return width * height;
    }
}
