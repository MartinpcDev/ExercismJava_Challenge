package loglevels;

public enum LogLevel {
  TRACE("TRC"),
  DEBUG("DBG"),
  INFO("INF"),
  WARNING("WRN"),
  ERROR("ERR"),
  FATAL("FTL"),
  UNKNOWN("UKN");

  private final String message;

  LogLevel(String message) {
    this.message = message;
  }

  public String getMessage() {
    return this.message;
  }

  public static int getNumber(String message) {
    int number = 0;
    switch (message) {
      case "UNKNOWN" -> {
        return number;
      }
      case "TRACE" -> number = 1;
      case "DEBUG" -> number = 2;
      case "INFO" -> number = 4;
      case "WARNING" -> number = 5;
      case "ERROR" -> number = 6;
      case "FATAL" -> number = 42;
    }

    return number;
  }
}
