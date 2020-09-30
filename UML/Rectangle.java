package UML;
public abstract class Rectangle extends Shape{
    protected double width=0.0;
    protected double length=0.0;
    public Rectangle(){}
    public Rectangle(double length, double width, String color, boolean filled){
        this.width=width;
        this.length=length;
        this.color=color;
        this.filled=filled;
    }

    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    }
    public double getWidth(){return width;}
    public void setWidth(double width){this.width=width;}
    public double getLength(){return length;}
    public void setLength(double length){this.length=length;}
    @Override
    public String toString(){return this.length+this.width+this.color+this.filled;}
    @Override
    public double getArea(){return this.length*this.width;}
    @Override
    public double getPerimetr(){return(this.length+this.width)*2;}
}
