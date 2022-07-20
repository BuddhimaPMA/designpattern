package buildpattern;

public class Mobile1 {
    private String name;
    private String color;
    private String processor;


    // Telescoping Constructor ....
    public Mobile1(String name){
        this.name=name;
    }

    public Mobile1(String name, String color){
        this(name);
        this.color=color;
    }

    public Mobile1(String name, String color, String processor){
        this(name, color);
        this.processor=processor;
    }

    @Override
    public String toString() {
        return "Mobile1{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }
}
