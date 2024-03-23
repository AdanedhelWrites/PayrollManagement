import java.io.FileWriter;
import java.io.IOException;

public abstract class Employee {
    protected String name;
    protected String surname;
    protected int workingHour;

    public Employee(String name, String surname, int workingHour) {
        this.name = name;
        this.surname = surname;
        this.workingHour = workingHour;
    }

    abstract double calculateSalary();

    void saveToJSON(String month, double baseFee, double effort, double totalPay){
        String fileName= this.name + "-" + this.surname + "-" + month + ".json";
        try(FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write("{\n");
            fileWriter.write("{\"payroll\": \"" + month + "\",\n");
            fileWriter.write("{\"employee\": {\n");
            fileWriter.write("{\"name\": \"" + this.name + "\",\n");
            fileWriter.write("{\"working_hour\": " + this.workingHour + ",\n");
            fileWriter.write("{\"payment_details\": {\n");
            fileWriter.write("{\"base_fee\": \"TL" + String.format("%.2f", baseFee) + "\"\n");
            fileWriter.write("{\"effort\": \"TL" + String.format("%.2f", effort) + "\",\n");
            fileWriter.write("{\"total_payment\": \"TL" + String.format("%.2f", totalPay) + "\"\n");
            fileWriter.write(" }\n");
            fileWriter.write(" }\n");
            fileWriter.write("}");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}