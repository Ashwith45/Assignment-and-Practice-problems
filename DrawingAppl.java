abstract class Shape{
    abstract void draw();
}
class Circle extends Shape{
 public void draw() {
    System.out.println("Drawing a Circle !!");
 }
}
class Rectangle extends Shape{
    public void draw() {
        System.out.println("Drawing a Rectangle !!");
    }

}





public class DrawingAppl {
    public static void main(String[] args) {

        Shape[] obj = new Shape[2];
        obj[0] = new Circle();
        obj[0].draw();
        obj[1] = new Rectangle();
        obj[1].draw();

        
    }
    
}
