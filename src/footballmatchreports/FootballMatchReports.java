package footballmatchreports;

public class FootballMatchReports {

  public static String onField(int shirtNum) {
    String response;

    switch (shirtNum) {
      case 1 -> response = "goalie";
      case 2 -> response = "left back";
      case 3, 4 -> response = "center back";
      case 5 -> response = "right back";
      case 6, 7, 8 -> response = "midfielder";
      case 9 -> response = "left wing";
      case 10 -> response = "striker";
      case 11 -> response = "right wing";
      default -> throw new IllegalArgumentException("1 - 11 range is processed");
    }

    return response;
  }
}
