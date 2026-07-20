package com.api.models.request;



public class SignUpRequest {
	
	
	private String username;
	private String password;
	private String email;
	private String firstName;
	private String lastName;
	private String mobileNumber;
	
	
	
	
	public String getUsername() {
		return username;
	}




	public void setUsername(String username) {
		this.username = username;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
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




	public String getMobileNumber() {
		return mobileNumber;
	}




	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}




	 
		private SignUpRequest(Builder builder) {
		    this.username = builder.userName;
		    this.password = builder.password;
		    this.email = builder.email;
		    this.firstName = builder.firstName;
		    this.lastName = builder.lastName;
		    this.mobileNumber = builder.mobileNumber;
		}

	




	  public static class Builder {
	        private String firstName;
	        private String lastName;
	        private String email;
	        private String mobileNumber;
	        private String userName;
	        private String password;

	        
	        public Builder userName(String userName) {
	            this.userName = userName;
	            return this;
	        }

	        public Builder password(String password) {
	            this.password =  password;
	            return this;
	        }

	        public Builder firstName(String firstName) {
	            this.firstName = firstName;
	            return this;
	        }
	        public Builder lastName(String lastName) {
	            this.lastName = lastName;
	            return this;
	        }
	        public Builder email(String email) {
	            this.email = email;
	            return this;
	        }
	        public Builder mobileNumber(String mobileNumber) {
	            this.mobileNumber = mobileNumber;
	            return this;
	        }

	        // Final step: create User object
	        public SignUpRequest build() {
	            return new SignUpRequest(this);
	        }
	    }


}
