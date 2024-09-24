package wizardsandwarriors;

public class Warrior extends Fighter {

  @Override
  public String toString() {
    return "Fighter is a Warrior";
  }

  @Override
  boolean isVulnerable() {
    return false;
  }

  @Override
  int getDamagePoints(Fighter fighter) {
    return fighter.isVulnerable() ? 10 : 6;
  }
}
