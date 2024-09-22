import salarycalculator.SalaryCalculator;

public class MainApplication {

  public static void main(String[] args) {
    SalaryCalculator calculator = new SalaryCalculator();
    System.out.println(calculator.finalSalary(0, 77));
  }
}
