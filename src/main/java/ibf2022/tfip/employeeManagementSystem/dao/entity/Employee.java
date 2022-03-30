package ibf2022.tfip.employeeManagementSystem.dao.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "customers")
@Getter @Setter @NoArgsConstructor
public class Employee {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	@Column(name="firstname")
	private String firstName;
	@Column(name="lastname")
	private String lastName;
	@Column(name="department")
	private String department;
	@Column(name="position")
	private String position;
	@Column(name="datejoined")
	private Date dateJoined;


	public Employee(Long id, String firstName, String lastName, String department, String position, Date dateJoined) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.position = position;
		this.dateJoined = dateJoined;
	}
	public Employee(String firstName, String lastName, String department, String position, Date dateJoined) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.position = position;
		this.dateJoined = dateJoined;
	}
	
	

}
