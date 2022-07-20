package factorymethod;

public class HighCapacity extends Performance{
    @Override
    protected void addCategory() {
        motorvehicles.add(new Bmw());
        motorvehicles.add(new Prado());
    }
}
