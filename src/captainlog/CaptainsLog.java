package captainlog;

import java.util.Random;

public class CaptainsLog {

  private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R',
      'T', 'Y'};

  private Random random;

  public CaptainsLog(Random random) {
    this.random = random;
  }

  public char randomPlanetClass() {
    return PLANET_CLASSES[random.nextInt(PLANET_CLASSES.length)];
  }

  public String randomShipRegistryNumber() {
    return "NCC-" + random.nextInt(1000, 10000);
  }

  public double randomStardate() {
    return random.nextDouble(41000.0, 42000.0);
  }
}
