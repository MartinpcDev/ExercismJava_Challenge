import captainlog.CaptainsLog;
import java.util.Random;

public class MainApplication {

  public static void main(String[] args) {
    CaptainsLog captainsLog = new CaptainsLog(new Random());
    System.out.println(captainsLog.randomPlanetClass());
    System.out.println(captainsLog.randomShipRegistryNumber());
    System.out.println(captainsLog.randomStardate());
  }

}
