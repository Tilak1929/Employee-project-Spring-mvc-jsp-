package in.ps.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.ps.product.Iservice.IEmployeeService;
import in.ps.product.entity.Employee;
@Controller
@RequestMapping("/employee")//base path for url
public class EmployeeController {
	@Autowired
	private IEmployeeService service;
	
	//1.show registerpage
	// /register + Get
	@GetMapping("/register")
	public String showFrom() {
		return "empRegister";
	}
	
	//2. read form data
	//save+post
	@PostMapping("/save")
	public String readForm(@ModelAttribute Employee employee,Model model) {
		System.out.println(employee);
		
	Integer id=	service.saveEmployee(employee);
	String message ="Employee"+ id+"created";
	model.addAttribute("message",message);
	return "empRegister";
	}
	
	@GetMapping("/all")
	public String showall(Model model) {
		List<Employee> emp=service.getAllEmployees();
		model.addAttribute("emp",emp);
		model.addAttribute("msg", "all");
		return "showdata";
	}
	
	
	
	@GetMapping("/search")
	public String show(@RequestParam("id") Integer id,Model model) {
		Employee res=service.getOneEmployee(id);
		model.addAttribute("emp", res);
		model.addAttribute("msg", "search");

		return "showdata";
	}
	
}
