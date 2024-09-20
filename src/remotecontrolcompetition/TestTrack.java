package remotecontrolcompetition;

import java.util.List;

public class TestTrack {

  public static void race(RemoteControlCar car) {
    car.drive();
  }

  public static List<ProductionRemoteControlCar> getRankedCars(
      List<ProductionRemoteControlCar> cars) {
    cars.sort(ProductionRemoteControlCar::compareTo);
    return cars;
  }
}
