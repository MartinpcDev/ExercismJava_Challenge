import carsassemble.CarsAssemble;

public class MainApplication {

  public static void main(String[] args) {
    CarsAssemble carsAssemble = new CarsAssemble();
    System.out.println(carsAssemble.productionRatePerHour(1));
    System.out.println(carsAssemble.workingItemsPerMinute(1));
  }
}
