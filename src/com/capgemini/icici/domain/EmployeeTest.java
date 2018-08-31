package com.capgemini.icici.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.icici.BankAccount;

class EmployeeTest {
	Employee employee;
	@Test
		void setUp() {
			employee = new Employee("madhuri",157784,30000,0);
	}

}
