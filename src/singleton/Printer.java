package singleton;

public class Printer {

    // one single printer can be shared among group of people

    private static volatile Printer printer = new Printer();    // create an instance

    private Printer(){
        // inside private constructor
        if(printer != null)
            throw new RuntimeException("please use getPrinter method to, get instance o Printer");
        // block reflection framework
    }

    public static Printer getPrinter() {

        if(printer == null){
            synchronized (Printer.class){
                if (printer == null)
                    printer = new Printer();
            }
        }

        // double checkin principle : stop multiple threads until the one is finished.

        return printer;
    }
}
// Double checking / Double looking Singleton Pattern
