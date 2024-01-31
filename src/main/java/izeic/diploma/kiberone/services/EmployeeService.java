package izeic.diploma.kiberone.services;

import izeic.diploma.kiberone.models.Employee;
import izeic.diploma.kiberone.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAll(){
        return employeeRepository.findAll(Sort.by(Sort.Order.by("surname")));
    }

    public Employee save(Employee employee){
        return  employeeRepository.save(employee);
    }

    public void delete(int id){
        employeeRepository.deleteById(id);
    }

}
