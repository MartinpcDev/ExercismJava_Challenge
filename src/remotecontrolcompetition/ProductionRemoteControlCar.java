package remotecontrolcompetition;

public class ProductionRemoteControlCar implements RemoteControlCar,
    Comparable<ProductionRemoteControlCar> {

  private int units;
  private int numberOfVictories;

  public void drive() {
    this.units += 10;
  }

  public int getDistanceTravelled() {
    return this.units;
  }

  public int getNumberOfVictories() {
    return this.numberOfVictories;
  }

  public void setNumberOfVictories(int numberOfVictories) {
    this.numberOfVictories = numberOfVictories;
  }

  @Override
  public int compareTo(ProductionRemoteControlCar car) {
    return Integer.compare(car.getNumberOfVictories(), this.numberOfVictories);
  }

  @Override
  public String toString() {
    return "ProductionRemoteControlCar{" +
        "units=" + units +
        ", numberOfVictories=" + numberOfVictories +
        '}';
  }
}
