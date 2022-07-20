package buildpattern;

public class Mobile {
    private final String name;
    private final String color;
    private final String processor;

    public Mobile(Builder builder) {
        // assigning sub class values
        this.name=builder.name;
        this.color=builder.color;
        this.processor=builder.processor;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getProcessor() {
        return processor;
    }
    // Nested class....
    static class Builder{
        private String name;
        private String color;
        private String processor;

        public Mobile build(){
            // this will return new Mobile by passing this.
            return new Mobile(this);
        }

        public Builder setName(String name){
            this.name=name;
            return  this;

        }

        public  Builder setColor(String color){
            this.color=color;
            return  this;

        }

        public  Builder setProcessor(String processor){
            this.processor=processor;
            return  this;

        }
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }
}
