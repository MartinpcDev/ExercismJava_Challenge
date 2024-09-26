package bookingupforbeauty;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AppointmentScheduler {

  public LocalDateTime schedule(String appointmentDateDescription) {
    String[] words = appointmentDateDescription.split(" ");
    String[] dates = words[0].split("/");
    String[] dateTimes = words[1].split(":");
    LocalDate date = LocalDate.of(Integer.parseInt(dates[2]), Integer.parseInt(dates[0]),
        Integer.parseInt(dates[1]));
    return date.atTime(Integer.parseInt(dateTimes[0]),
        Integer.parseInt(dateTimes[1]), Integer.parseInt(dateTimes[2]));
  }

  public boolean hasPassed(LocalDateTime appointmentDate) {
    return appointmentDate.isBefore(LocalDateTime.now());
  }

  public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
    return appointmentDate.isAfter(appointmentDate.withHour(11).withMinute(59).withSecond(59))
        && appointmentDate.isBefore(appointmentDate.withHour(18));
  }

  public String getDescription(LocalDateTime appointmentDate) {
    return "You have an appointment on " + appointmentDate.getDayOfWeek().toString().substring(0, 1
    ) + appointmentDate.getDayOfWeek().toString().substring(1).toLowerCase()
        + ", "
        + appointmentDate.getMonth().toString().substring(0, 1) +
        appointmentDate.getMonth().toString().substring(1).toLowerCase() + " "
        + appointmentDate.getDayOfMonth() + ", "
        + appointmentDate.getYear() + ", at " + (appointmentDate.getHour() > 12 ?
        appointmentDate.getHour() - 12 : appointmentDate.getHour()) + ":"
        + (appointmentDate.getMinute() < 10 ? "0" + appointmentDate.getMinute()
        : appointmentDate.getMinute()) + (
        appointmentDate.isAfter(appointmentDate.withHour(11).withMinute(59).withSecond(59)) ? " PM."
            : " AM.");
  }

  public LocalDate getAnniversaryDate() {
    return LocalDate.of(2024, 9, 15);
  }
}
