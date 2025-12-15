package in.ps.productin.exception;

public class EmployeeNotFound extends RuntimeException {
public EmployeeNotFound() {
	// TODO Auto-generated constructor stub
}

 EmployeeNotFound(String message) {
super(message);
System.out.println(message);
}

	
}
