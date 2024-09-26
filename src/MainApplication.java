import wizardsandwarriors.Character;
import wizardsandwarriors.Destination;
import wizardsandwarriors.GameMaster;
import wizardsandwarriors.TravelMethod;

public class MainApplication {

  public static void main(String[] args) {
    Character character = new Character();
    character.setCharacterClass("Wizard");
    character.setLevel(4);
    character.setHitPoints(28);

    System.out.println(new GameMaster().describe(character));

    Destination destination = new Destination();
    destination.setName("Muros");
    destination.setInhabitants(732);
    System.out.println(new GameMaster().describe(destination));
    System.out.println(new GameMaster().describe(TravelMethod.WALKING));
    System.out.println(new GameMaster().describe(character, destination, TravelMethod.HORSEBACK));
    System.out.println(new GameMaster().describe(character, destination));
  }

}
