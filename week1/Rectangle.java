public class Rectangle extends Shape{
    private double height;
    private double width;

    public Rectangle(String color, double height, double width){
        super(color);
        this.height = height;
        this.width = width;
    }

    public double getHeight(){
        return this.height;
    }

    public double getWidth(){
        return this.width;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double area(){
        return this.height * this.width;
    }

    public double perimeter(){
        return 2 * (this.height + this.width);
    }
}
