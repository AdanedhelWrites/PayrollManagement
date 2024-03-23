public class Officer extends Employee{
    private EPosition position;

    public Officer(String name, String surname, int workingHour, EPosition position) {
        super(name, surname, workingHour);
        this.position = position;
    }

    @Override
    public double calculateSalary() {
        if (position == EPosition.JUNIOR){
            double hourlyFee = 200;
            double baseFee = Math.min(180, this.workingHour);
            double plusEffortFee = this.workingHour > 180 ? (this.workingHour - 180) * hourlyFee * 1.5 : 0;
            return  baseFee * hourlyFee + plusEffortFee;
        } else if (position == EPosition.MID) {
            double hourlyFee = 320;
            double baseFee = Math.min(180, this.workingHour);
            double plusEffortFee = this.workingHour > 180 ? (this.workingHour - 180) * hourlyFee * 1.5 : 0;
            return  baseFee * hourlyFee + plusEffortFee;
        }else {
            double hourlyFee = 450;
            double baseFee = Math.min(180, this.workingHour);
            double plusEffortFee = this.workingHour > 180 ? (this.workingHour - 180) * hourlyFee * 1.5 : 0;
            return  baseFee * hourlyFee + plusEffortFee;
        }
    }
}
