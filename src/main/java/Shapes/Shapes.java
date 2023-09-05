package Shapes;

public class Shapes {

    private String name;

    public String getName() {
        return name;
    }

    public Shapes(){
        this.name = getName();
    }

    public String print(String className, String name){
        return "Shape " + className + ", name is " + name;
    }
}
