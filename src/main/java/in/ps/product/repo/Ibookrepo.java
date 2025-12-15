package in.ps.product.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ps.product.entity.Book;

public interface Ibookrepo extends JpaRepository<Book, Integer> {

}