package in.ps.product.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ps.product.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer> {

}
