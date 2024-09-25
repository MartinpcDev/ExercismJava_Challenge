import loglevels.LogLine;

public class MainApplication {

  public static void main(String[] args) {
    LogLine logLine = new LogLine("[TRC]: Line 84 - System.out.println(\\\"Hello World\\\");");
    System.out.println(logLine.getLogLevel());
    System.out.println(logLine.getOutputForShortLog());
  }

}
