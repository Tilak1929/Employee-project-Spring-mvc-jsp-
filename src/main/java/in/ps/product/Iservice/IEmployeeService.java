package in.ps.product.Iservice;

import java.util.List;

import in.ps.product.entity.Employee;

public interface IEmployeeService {

	Integer saveEmployee(Employee emp);
	List<Employee> getAllEmployees();
	Employee getOneEmployee(Integer id);
	void updateEmployee(Employee emp);
	void deleteEmployee(Integer id);
	
}