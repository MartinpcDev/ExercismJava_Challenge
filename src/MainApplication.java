import elontoycar.ElonsToyCar;

public class MainApplication {

  public static void main(String[] args) {
    ElonsToyCar car = ElonsToyCar.buy();
    System.out.println(car.distanceDisplay() + " - " + car.batteryDisplay());
    car.drive();
    car.drive();
    car.drive();
    System.out.println(car.distanceDisplay() + " - " + car.batteryDisplay());
  }
}
