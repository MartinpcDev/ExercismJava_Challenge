package timfrommarketing;

public class Badge {

  private String department = "OWNER";

  public String print(Integer id, String name, String department) {
    String isIDString = "";

    if (department != null) {
      this.department = department;
    }
    if (id != null) {
      isIDString = "[" + id + "]" + " - ";
    }

    return isIDString + name + " - " + this.department.toUpperCase();
  }
}
