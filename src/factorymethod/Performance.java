package factorymethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Performance {
    protected List<Motorvehicle> motorvehicles = new ArrayList<>();

    public Performance(){
        addCategory();
        // call abstract method from constructor to implement in extended classes
    }

    protected abstract void addCategory();

    @Override
    public String toString() {
        return "Performance{" +
                "motorvehicles=" + motorvehicles +
                '}';
    }
}
