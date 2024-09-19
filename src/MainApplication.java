import needforspeed.NeedForSpeed;
import needforspeed.RaceTrack;

public class MainApplication {

  public static void main(String[] args) {
    NeedForSpeed car = new NeedForSpeed(10, 2);
    RaceTrack race = new RaceTrack(100);
    System.out.println(race.canFinishRace(car));
    System.out.println(car.distanceDriven());
    System.out.println(car.batteryDrained());
  }
}
