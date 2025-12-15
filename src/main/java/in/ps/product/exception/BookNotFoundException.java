package in.ps.product.exception;

public class BookNotFoundException extends RuntimeException{

	public BookNotFoundException(String message) {
		super(message);
		System.out.println("iniside the class");
	}
}
