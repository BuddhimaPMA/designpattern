package factorymethod;

public class GenerateCategory {
    public static Performance addPerformance (VehicleCategory vehicleName){

        switch (vehicleName){
            case HIGH:
                return new HighCapacity();
            case NORMAL:
                return new NoramlCapacity();

            default:
                return null;
        }
    }
}
