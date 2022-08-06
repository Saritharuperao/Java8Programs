package com.ciq.ems.entity;


	

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	import org.hibernate.annotations.Columns;

	@Entity
	@Table(name = "Employ")
	public class Employee {

		@Id // primary key
		@GeneratedValue(strategy = GenerationType.AUTO) // auto increment
	//@column(name="eid")	
		private int id;
		@Column(name = "ename", nullable = false) // nullable means not null
		private String name;
		@Column(name = "esalary", nullable = false)
		private double salary;
		@Column(name = "email", unique = true, nullable = false)
		private String email;

		public Employee() {
			super();
		
		}

		public Employee(int id, String name, double salary, String email) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.email = email;
		}

		public Employee(String name, double salary, String email) {
			super();
			this.name = name;
			this.salary = salary;
			this.email = email;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", email=" + email + "]";
		}

	}


