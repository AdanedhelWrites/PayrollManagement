import java.io.IOError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    public static List<Employee> readFile(String FileUrl) throws IOException{
        List<Employee> employees = new ArrayList<>();
        employees.add(new Director("Turin","Turambar",200));
        employees.add(new Officer("Adanedhel","Anor",200, EPosition.JUNIOR));
        employees.add(new Officer("Galadriel","Silmarillion",200, EPosition.SENIOR));
        employees.add(new Officer("Elrond","Peredhil",200, EPosition.MID));
        employees.add(new Officer("Arwen","Peredhil",200, EPosition.JUNIOR));
        employees.add(new Officer("Saruman","Curunir",140, EPosition.JUNIOR));
        return employees;
    }
}
