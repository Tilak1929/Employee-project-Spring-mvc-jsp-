package in.ps.product.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.ps.product.entity.Book;
import in.ps.product.exception.BookNotFoundException;
import in.ps.product.service.Ibook;

@Controller
@RequestMapping("/bookmain")

public class BookController {
	@Autowired
	private Ibook service;
	
	@GetMapping("/book")
	public String getBookById(@RequestParam(value="id",required= false ,defaultValue = "1") Integer id,Model model) {
		System.out.println("ID="+id);
		String message=null;
		Book book=null;
		try {
			book=service.getoneBook(id);
			message="Book is present";
		}
		catch(BookNotFoundException e){
			System.out.println("Book not found");
			message=e.getMessage();
		}
		model.addAttribute("book",book);
		model.addAttribute("msg",message);
		return "index1";
	}
	@GetMapping("/register")
	public String showForm() {
		return "Register";
	}
	
	@PostMapping("/save")
	public String readForm(@ModelAttribute Book b, Model model) {
		System.out.println(b);
		Integer id=service.saveBook(b);
		String message="Book"+id+"created";
		model.addAttribute("meesage",message);
		return "Register";
	}
	
	@GetMapping("/booklanding")
	public String showBook() {
		return "index";
	}
	
}