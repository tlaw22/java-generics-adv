import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Employee emp = new Employee();
        Accountant acc = new Accountant();
        emp = acc;

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee());
        employees.add(new Employee());
        ArrayList<Accountant> accountants = new ArrayList<>();
        // employees = accountants;
        ArrayList<String> accountants2 = new ArrayList<String>();
        ArrayList<?> employee2 = new ArrayList();  // The<?> is a wildcare stating that we will define the type later.
        employee2 = accountants2;
        // Upper bound
        ArrayList<? extends Employee> employees3 = new ArrayList<>();
        ArrayList<Accountant> accountants3 = new ArrayList<Accountant>();
        employees3 = accountants3;
        // Lower bound
        ArrayList<? super Employee> employees4 = new ArrayList<>();
        ArrayList<Object> accountants4 = new ArrayList<Object>();
        employees4 = accountants4;

        makeEmployeesWork(accountants);
        

    }

    public static void makeEmployeesWork(List<? extends Employee> employees){
        for(Employee emp : (ArrayList<Employee>) employees) {
             emp.work();
        }
    }
}
