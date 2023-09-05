package Shapes;

public class ShapesTest{
    public static void main(String[] args) {
        Oval oval = new Oval();
        Circle circle = new Circle();
        Quad quad = new Quad();
        Trapeze trapeze = new Trapeze();
        Triangle triangle = new Triangle();
        System.out.println(oval.print(oval.getName()));
        System.out.println(circle.print(circle.getName()));
        System.out.println(quad.print(quad.getName()));
        System.out.println(trapeze.print(trapeze.getName()));
        System.out.println(triangle.print(triangle.getName()));
    }
}
