package Shapes;

public class Shapes {

    private String name;

    public String getName() {
        return name;
    }

    public Shapes() {
    }

    public String print(Shapes shape) {
        return "Shape's name is " + shape.getName();
    }
}


