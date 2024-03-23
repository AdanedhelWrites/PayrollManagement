import java.util.List;

public class Payroll {
    public static void createPayroll(List<Employee> employeeList, String month){
        for (Employee employee : employeeList){
            double baseFee = employee.calculateSalary();
            double effort = employee.workingHour > 180 ? (employee.workingHour - 180) * 500 * 1.5 : 0;
            double totalPay = baseFee + effort;
            employee.saveToJSON(month,baseFee,effort,totalPay);
        }
        showTheReport(employeeList);
    }
    public static void showTheReport(List<Employee> employeeList){
        System.out.println("Payroll Report");
        for (Employee employee : employeeList){
            if (employee instanceof Officer){
                System.out.println("Isim: " + employee.name + " " + employee.surname);
                System.out.println("Payroll: " + employee.calculateSalary());
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        }
        System.out.println("Employees Working Less Than 150 Hours");
        for (Employee employee : employeeList){
            if (employee.workingHour < 150){
                System.out.println(employee.name + " " + employee.surname + "'s Working Hour is: " + employee.workingHour);
            }
        }
    }
}
