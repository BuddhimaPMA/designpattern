package buildpattern;

public class Application {
    public static void main(String[] args) {

        Mobile1 mobile1 = new Mobile1("Apple");
        System.out.println(mobile1);

        // reverce telecoping...
        Mobile2 mobile2 = new Mobile2("Nokia");
        System.out.println(mobile2);

        // Build Pattern Applied
        Mobile.Builder builder = new Mobile.Builder();
        Mobile mobile = builder.setName("Apple").setColor("red").build();
        System.out.println("mobile :"+mobile);
    }

}
