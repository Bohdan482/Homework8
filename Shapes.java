package Shapes;

public class Shapes {

    private String name;

    public String getName() {
        return name;
    }

    public Shapes(){
        this.name = getName();
    }

    public String print(String name){
        return "Shape's name is " + name;
    }
}
