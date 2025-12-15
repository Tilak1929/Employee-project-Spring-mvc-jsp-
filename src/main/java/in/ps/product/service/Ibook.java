package in.ps.product.service;

import org.springframework.stereotype.Service;

import in.ps.product.entity.Book;

public interface Ibook {
public Book getoneBook(Integer id);
public Integer saveBook(Book b);
}
