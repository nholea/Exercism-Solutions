public class SalaryCalculator {

    public double multiplierPerDaysSkipped(int daysSkipped) {
        return daysSkipped <5 ? 1 : 0.85;
    }

    public int multiplierPerProductsSold(int productsSold) {
        return productsSold <20 ? 10 : 13;
    }

    public double bonusForProductSold(int productsSold) {
       return productsSold * multiplierPerProductsSold(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        Double baseSalary = 1000.00;
        Double max_Salary = 2000.00;
        double finalSalary = baseSalary * multiplierPerDaysSkipped(daysSkipped) + bonusForProductSold(productsSold);

        return finalSalary < max_Salary ? finalSalary : max_Salary;
    } 
}
