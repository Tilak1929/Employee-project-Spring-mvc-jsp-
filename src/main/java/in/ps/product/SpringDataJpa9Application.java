package in.ps.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ps.product.entity.Book;
import in.ps.product.repo.Ibookrepo;

@SpringBootApplication
public class SpringDataJpa9Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringDataJpa9Application.class, args);
		Ibookrepo ib=context.getBean(Ibookrepo.class);
		Book b=new Book();
		b.setBookAuthor("sonith");
		b.setBookName("washroom contol");
		b.setBookPrice(30000.00);
		b.setPageNumber("10");
		ib.save(b);
	}

}
