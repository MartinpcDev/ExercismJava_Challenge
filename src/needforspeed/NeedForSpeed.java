package needforspeed;

public class NeedForSpeed {

  private final int speed;
  private int battery;
  private int meters;
  private final int batteryDrain;

  public NeedForSpeed(int speed, int batteryDrain) {
    this.battery = 100;
    this.speed = speed;
    this.batteryDrain = batteryDrain;
  }

  public boolean batteryDrained() {
    return this.battery >= 0 && this.battery < this.batteryDrain;
  }

  public int distanceDriven() {
    return this.meters;
  }

  public void drive() {
    if (this.battery > 0) {
      this.meters += this.speed;
      this.battery -= this.batteryDrain;
    }
  }

  public static NeedForSpeed nitro() {
    return new NeedForSpeed(50, 4);
  }
}
