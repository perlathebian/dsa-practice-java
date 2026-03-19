abstract class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    abstract double area(); 

    abstract double perimeter();
    
    void describe() { 
        System.out.println(color + " shape, area=" + area()); 
    }
}