package elontoycar;

public class ElonsToyCar {

  private int meters = 0;
  private int battery = 100;

  public static ElonsToyCar buy() {
    ElonsToyCar car = new ElonsToyCar();
    car.meters = 0;
    car.battery = 100;
    return car;
  }

  public String distanceDisplay() {
    return "Driven " + this.meters + " meters";
  }

  public String batteryDisplay() {
    return (this.battery <= 0) ? "Battery empty" : "Battery at " + this.battery + "%";
  }

  public void drive() {
    if (this.battery <= 0) {
      System.out.println("Battery empty");
      return;
    } else {
      this.battery -= 1;
      this.meters += 20;
      System.out.println("Drive " + this.meters + " meters");
    }
  }
}

