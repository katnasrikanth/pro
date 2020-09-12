package com.melvault.Route;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.melvault.Entity.Employee;
import com.melvault.repository.Emprepository;

@RestController
@RequestMapping("/api")
public class EmpRoute {
	
	@Autowired
	private Emprepository emprepository;
	
	@PostMapping("/employee")
	public Employee save(Employee emp) {
		
		return emprepository.save(emp);
				}
	
	@GetMapping("/All")
	public List<Employee> getAll(){
		return emprepository.findAll();
	}

}
