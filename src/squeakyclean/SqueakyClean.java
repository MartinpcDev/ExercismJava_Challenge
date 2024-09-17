package squeakyclean;

public class SqueakyClean {

  public static String clean(String identifier) {
    if (identifier.contains(" ")) {
      identifier = identifier.replace(" ", "_");
    }
    if (identifier.contains("-")) {
      String[] words = identifier.split("-");
      StringBuilder identifierBuilder = new StringBuilder(words[0]);
      for (int i = 1; i < words.length; i++) {
        identifierBuilder.append(words[i].substring(0, 1).toUpperCase())
            .append(words[i].substring(1));
      }
      identifier = identifierBuilder.toString();
    }
    if (identifier.contains("1") || identifier.contains("0") || identifier.contains("3")
        || identifier.contains("4") || identifier.contains("7")) {
      identifier = identifier.replace("0", "o")
          .replace("1", "l")
          .replace("3", "e")
          .replace("4", "a")
          .replace("7", "t");
    }
    identifier = identifier.replaceAll("[^a-zA-Z_]", "");
    return identifier;
  }
}
