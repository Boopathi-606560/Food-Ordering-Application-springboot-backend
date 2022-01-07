package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class UserDetail {
		
		
		
		@Column(name = "first_name")
		private String firstName;

		@Column(name = "last_name")
		private String lastName;
		
		@Column(name = "email_id")
		@Id
		private String emailId;
		
		@Column(name = "password")
		 private String password;
		
		

		public UserDetail() {
			super();
			// TODO Auto-generated constructor stub
		}



		public UserDetail( String firstName, String lastName, String emailId, String password) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.emailId = emailId;
			this.password = password;
		}

		

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmailId() {
			return emailId;
		}

		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
		
		
		
		


}
