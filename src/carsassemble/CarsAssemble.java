package carsassemble;

public class CarsAssemble {

  private double productionRate;

  public double productionRatePerHour(int speed) {

    if (speed >= 1 && speed <= 4) {
      this.productionRate = speed * 221;
    } else if (speed >= 5 && speed <= 8) {
      this.productionRate = (double) (speed * 221 * 9) / 10;
    } else if (speed == 9) {
      this.productionRate = (double) (speed * 221 * 8) / 10;
    } else if (speed == 10) {
      this.productionRate = (double) (speed * 221 * 77) / 100;
    }

    return this.productionRate;
  }

  public int workingItemsPerMinute(int speed) {
    return (int) this.productionRatePerHour(speed) / 60;
  }
}
