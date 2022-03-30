package ibf2022.tfip.employeeManagementSystem.controllers;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ibf2022.tfip.employeeManagementSystem.dao.entity.Employee;

@RestController
@Validated
@RequestMapping(path="/1", produces=MediaType.APPLICATION_JSON_VALUE)
public class EmployeeController {
	
	@GetMapping("/employees")
	public ResponseEntity<String> getAllEmployees(){ //TODO custom validation logic
		//TODO
		return ResponseEntity.ok("");
		
	}
	@GetMapping("/employee")
	public ResponseEntity<String> getEmployeeById(@RequestParam String id ){ //TODO custom validation logic
		//TODO
		return ResponseEntity.ok("");
		
	}
	
	@PostMapping("/employee/create")
	public ResponseEntity<String> addEmployee(@RequestBody Employee employee){ //TODO custom validation logic
		//TODO
		return ResponseEntity.ok("");
	}
	
	@PutMapping("/employee/{id}")
	public ResponseEntity<String> updateEmployee(@PathVariable String id, @RequestBody Employee employee){ //TODO custom validation logic
		//TODO
		return ResponseEntity.ok("");
	}
	
	@DeleteMapping("/employee/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable String id){ //TODO custom validation logic
		//TODO
		return ResponseEntity.ok("");
	}

}
