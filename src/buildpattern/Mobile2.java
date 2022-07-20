package buildpattern;

public class Mobile2 {
    private String name;
    private String color;
    private String processor;
    
    public Mobile2(String name, String color, String processor){
        this.name=name;
        this.color=color;
        this.processor=processor;
    }
    
    public Mobile2(String name, String color){
        this(name,color,null);
    }

    public Mobile2(String name) {
        this(name,null,null);
    }

    @Override
    public String toString() {
        return "Mobile2{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }
}
