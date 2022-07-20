package factorymethod;

public class Application {
    public static void main(String[] args) {
        Performance aPerformance = GenerateCategory.addPerformance(VehicleCategory.HIGH);
        System.out.println(aPerformance);
        Performance apPerformance1 =GenerateCategory.addPerformance(VehicleCategory.NORMAL);
        System.out.println(apPerformance1);
    }
}
