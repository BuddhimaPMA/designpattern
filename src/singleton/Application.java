package singleton;

public class Application {

    public static void main(String[] args) {
        Printer printer = Printer.getPrinter();
        System.out.println(printer);
        Printer printer1 = Printer.getPrinter();
        System.out.println(printer1);
    }

}
