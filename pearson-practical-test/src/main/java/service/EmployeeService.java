package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repository.EmployeeRepository;

import model.Employee;


@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	//get all the employees
	public List<Employee> getAllEmployees(){
		List<Employee> employees = new ArrayList<Employee>();  
		employeeRepository.findAll().forEach(employee -> employees.add(employee));  
		return employees; 
	}
	
	//get a employee 
	public Employee getEmployeeById(int empId){  
		
		return employeeRepository.findById(empId).get();  
	}
	
	//add a employee
	public void CreateAemployee(Employee employee) {
		
		employeeRepository.save(employee);
		
	}
	
	//delete a employee
	public void deleteAemployee(int id) {
		
		employeeRepository.deleteById(id);
	}
	
}
