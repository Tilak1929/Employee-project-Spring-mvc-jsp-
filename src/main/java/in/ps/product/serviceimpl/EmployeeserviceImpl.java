package in.ps.product.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ps.product.Iservice.IEmployeeService;
import in.ps.product.entity.Employee;
import in.ps.product.repo.EmpRepo;
@Service
public class EmployeeserviceImpl implements IEmployeeService {
@Autowired
	private EmpRepo repo;
	@Override
	public Integer saveEmployee(Employee emp) {
		
		return repo.save(emp).getEmpId();
	}

	@Override
	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}

	@Override
	public Employee getOneEmployee(Integer id) {
		return repo.findById(id).get();
	}

	@Override
	public void updateEmployee(Employee emp) {
      repo.save(emp);
	}

	@Override
	public void deleteEmployee(Integer id) {
		repo.deleteById(id);

	}

}
