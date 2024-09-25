package loglevels;

public class LogLine {

  private final String message;

  public LogLine(String message) {
    this.message = message;
  }

  public LogLevel getLogLevel() {
    switch (getMessageLevel(message)) {
      case "TRACE", "INFO", "WARNING", "ERROR", "FATAL", "DEBUG" -> {
        return LogLevel.valueOf(getMessageLevel(message));
      }
      default -> {
        return LogLevel.UNKNOWN;
      }
    }

  }

  public String getOutputForShortLog() {
    return LogLevel.getNumber(getMessageLevel(message)) + ":" + message.split(
        ":")[1].trim();
  }

  private String getMessageLevel(String message) {
    String level = message.split(":")[0]
        .trim()
        .replace("[", "")
        .replace("]", "");

    switch (level) {
      case "TRC" -> {
        return "TRACE";
      }
      case "DBG" -> {
        return "DEBUG";
      }
      case "INF" -> {
        return "INFO";
      }
      case "WRN" -> {
        return "WARNING";
      }
      case "ERR" -> {
        return "ERROR";
      }
      case "FTL" -> {
        return "FATAL";
      }
      default -> {
        return "UNKNOWN";
      }
    }
  }
}
