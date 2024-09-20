import java.util.ArrayList;
import java.util.List;
import remotecontrolcompetition.ProductionRemoteControlCar;
import remotecontrolcompetition.TestTrack;

public class MainApplication {

  public static void main(String[] args) {
    ProductionRemoteControlCar prc1 = new ProductionRemoteControlCar();
    ProductionRemoteControlCar prc2 = new ProductionRemoteControlCar();
    prc1.setNumberOfVictories(2);
    prc2.setNumberOfVictories(3);
    List<ProductionRemoteControlCar> unsortedCars = new ArrayList<>();
    unsortedCars.add(prc1);
    unsortedCars.add(prc2);
    List<ProductionRemoteControlCar> rankings = TestTrack.getRankedCars(unsortedCars);
    System.out.println(rankings);
  }
}
