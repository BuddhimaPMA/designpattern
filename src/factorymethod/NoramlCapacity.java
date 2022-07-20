package factorymethod;

public class NoramlCapacity extends Performance{
    @Override
    protected void addCategory() {
        motorvehicles.add(new Aqua());
        motorvehicles.add(new Corolla());
    }
}
