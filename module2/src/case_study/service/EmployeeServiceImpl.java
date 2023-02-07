package case_study.service;

import case_study.models.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    public static List<Employee> employeeArrayList = new ArrayList<>();


    @Override
    public void addNew(Employee employee) {
        employeeArrayList.add(employee);
    }


    @Override
    public void addNew() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void display() {

    }
}
