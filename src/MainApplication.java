import loglevels.LogLevels;

public class MainApplication {

  public static void main(String[] args) {
    String message = LogLevels.logLevel("[WARNING]:   \tTimezone not set\r\n");
    System.out.println("'" + message + "'");
  }
}
