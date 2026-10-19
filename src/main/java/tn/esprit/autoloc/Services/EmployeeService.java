package tn.esprit.autoloc.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Entities.Employee;
import tn.esprit.autoloc.Repositories.EmployeeRepository;

import java.util.List;
@AllArgsConstructor
@Service
public class EmployeeService implements IEmployeeService{
    EmployeeRepository employeeRepo;
    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
       return employeeRepo.save(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepo.deleteById(id);
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepo.findById(id).get();
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }
}
