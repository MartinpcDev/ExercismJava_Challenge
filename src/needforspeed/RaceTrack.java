package needforspeed;

public class RaceTrack {

  private final int distance;

  public RaceTrack(int distance) {
    this.distance = distance;
  }

  public boolean canFinishRace(NeedForSpeed car) {
    while (!car.batteryDrained()) {
      car.drive();
    }
    return this.distance <= car.distanceDriven();
  }
}
