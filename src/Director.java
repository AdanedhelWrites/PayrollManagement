public class Director extends Employee{
    public Director(String name, String surname, int workingHour) {
        super(name, surname, workingHour);
    }
    @Override
    public double calculateSalary() {
        double hourlyFee = 500;
        double bonusFee = 5000;
        double payment = hourlyFee * this.workingHour;
        return payment + bonusFee;
    }
}
