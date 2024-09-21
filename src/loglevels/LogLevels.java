package loglevels;

public class LogLevels {

  public static String message(String logLine) {
    return cleanString(logLine).split(":")[1].trim();
  }

  public static String logLevel(String logLine) {
    return cleanString(logLine).split(":")[0]
        .trim()
        .replace("[", "")
        .replace("]", "")
        .toLowerCase();
  }

  public static String reformat(String logLine) {
    return message(logLine) + " (" + logLevel(logLine) + ")";
  }

  private static String cleanString(String word) {
    return word.trim().replace("\r", "")
        .replace("\n", "")
        .replace("\t", "");
  }
}
