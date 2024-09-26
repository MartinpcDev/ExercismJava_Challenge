import bookingupforbeauty.AppointmentScheduler;
import java.time.LocalDateTime;

public class MainApplication {

  public static void main(String[] args) {
    AppointmentScheduler scheduler = new AppointmentScheduler();
    System.out.println(scheduler.isAfternoonAppointment(LocalDateTime.of(2019, 9,
        1, 18, 0, 0)));
    System.out.println(scheduler.getDescription(LocalDateTime.of(2019, 3,
        29, 15, 0, 0)));
    System.out.println(scheduler.getAnniversaryDate());
  }

}
