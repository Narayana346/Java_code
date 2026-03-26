package design_patten.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Manger implements Employee{
    List<Employee> employees = new ArrayList<>();
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }
    @Override
    public void showDetails() {
        for(Employee employee:employees){
            employee.showDetails();
        }
    }
}
