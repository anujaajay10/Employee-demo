package com.UST.employee.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
		@Id
		private String  name;
		private String email;
		private int experience;  
		private String domain;
		public Employee() {
			this.name = name;
			this.email = email;
			this.experience = experience;
			this.domain = domain;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getExperience() {
			return experience;
		}
		public void setExperience(int experience) {
			this.experience = experience;
		}
		public String getDomain() {
			return domain;
		}
		public void setDomain(String domain) {
			this.domain = domain;
		}
		@Override
		public String toString() {
			return "Employee [ name=" + name + ", email=" + email + ", experience=" + experience
					+ ", domain=" + domain + "]";
		}
		
		
	}

		
	