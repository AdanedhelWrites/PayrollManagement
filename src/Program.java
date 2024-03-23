import java.io.IOException;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        try {
        List<Employee> employees = FileReader.readFile("employee.json");
        Payroll.createPayroll(employees, "March 2024");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}