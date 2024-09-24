package wizardsandwarriors;

public class Wizard extends Fighter {

  private boolean spell = false;

  void prepareSpell() {
    this.spell = true;
  }

  @Override
  boolean isVulnerable() {
    return !this.spell;
  }

  @Override
  int getDamagePoints(Fighter fighter) {
    return this.spell ? 12 : 3;
  }

  @Override
  public String toString() {
    return "Fighter is a Wizard";
  }
}
