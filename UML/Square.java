package UML;

public abstract class Square extends Rectangle {
    protected double side = 0;

    public void Square(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = false;
    }

    public Square() {
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
    }

    @Override
    public void setLength(double length) {
        this.length = side;
    }

    @Override
    public String toString() {
        return "Shape:Square,side=" + this.side + ",color=" + this.color;
    }
}
