package salarycalculator;

public class SalaryCalculator {

  public double salaryMultiplier(int daysSkipped) {
    return daysSkipped >= 5 ? 0.85 : 1.0;
  }

  public int bonusMultiplier(int productsSold) {
    return productsSold >= 20 ? 13 : 10;
  }

  public double bonusForProductsSold(int productsSold) {
    return bonusMultiplier(productsSold) * productsSold;
  }

  public double finalSalary(int daysSkipped, int productsSold) {
    return daysSkipped != 0
        ? (1000.0 * salaryMultiplier(daysSkipped)) + bonusForProductsSold(productsSold)
        : (2000.0 * salaryMultiplier(daysSkipped)) + bonusForProductsSold(productsSold);
  }
}
