package Shapes;

public class ShapesTest{
    public static void main(String[] args) {
        Oval oval = new Oval();
        Circle circle = new Circle();
        Quad quad = new Quad();
        Trapeze trapeze = new Trapeze();
        Triangle triangle = new Triangle();
        System.out.println(oval.print("oval", "Oval"));
        System.out.println(circle.print("circle", "Circle"));
        System.out.println(quad.print("quad", "Quad"));
        System.out.println(trapeze.print("trapeze", "Trapeze"));
        System.out.println(triangle.print("triangle", "Triangle"));
    }
}
