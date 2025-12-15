package in.ps.product.Iserviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ps.product.entity.Book;
import in.ps.product.exception.BookNotFoundException;
import in.ps.product.repo.Ibookrepo;
import in.ps.product.service.Ibook;
@Service
public class Bookserviceimpl implements Ibook {
	@Autowired
	private Ibookrepo repo;


	public Book getoneBook(Integer id) {
		
		return repo.findById(id).orElseThrow(()->new BookNotFoundException(id+"not exist"));
	}


	@Override
	public Integer saveBook(Book b) {
		// TODO Auto-generated method stub
		return repo.save(b).getBookId();
	}

}
