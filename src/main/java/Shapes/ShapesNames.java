package Shapes;

public class ShapesNames{
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Oval oval = new Oval();
        Quad quad = new Quad();
        System.out.println(shape.print(oval));
        System.out.println(shape.print(quad));
    }
}
