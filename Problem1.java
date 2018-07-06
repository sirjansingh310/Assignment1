package Assignment1;



abstract  class Shape{
    abstract public double getPerimeter();
    abstract public double getArea();
}
 class Circle extends Shape{
   int radius;
   Circle(int radius){
       this.radius = radius;
   }
   @Override
   public double getPerimeter(){
       return 2*(3.14159)*radius;
   }

    @Override
    public double getArea() {
        return (3.14159)*radius*radius;
    }
}
 class Square extends Shape{
    int side;
    Square(int side){
        this.side = side;
    }
    @Override
    public double getPerimeter(){
        return 4*side;
    }

    @Override
    public double getArea() {
        return side*side;
    }
}
public class Problem1 {
    public static void main(String[] args){
        Circle c = new Circle(10);
        Square s = new Square(10);
        System.out.println(c.getPerimeter()+" "+s.getPerimeter());
        System.out.println(c.getArea()+" "+s.getArea());

    }
}