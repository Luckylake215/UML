package UML;
public abstract class Rectangle extends Shape{
    protected double width=0.0;
    protected double length=0.0;

    public Rectangle(){}
    public Rectangle(double length, double width,  String color, boolean filled){
        this.width=width;
        this.length=length;
        this.color=color;
        this.filled=filled;

    }

    public void setWidth(float userWidth) {
        if (userWidth < 0.0 || userWidth > 20.0) {
            throw new IllegalArgumentException(Float.toString((float) width));
        } else {
            width = userWidth;
        }
    }

    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    }

    public void setLength(float userLength) {
        if (userLength < 0.0 || userLength > 20.0) {
            throw new IllegalArgumentException(Float.toString((float) length));
        } else {
            length = userLength;
        }
    }

    public abstract void setWidth(double side);

    public abstract void setLength(double length);

    @Override
    public String toString(){return this.length+this.width+this.color+this.filled;}
    @Override
    public double getArea(){return this.length*this.width;}
    @Override
    public double getPerimetr(){return(this.length+this.width)*2;}

}