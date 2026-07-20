package com.api.models.request;

import com.api.models.request.SignUpRequest.Builder;

public class profileRequest {

	
	private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;
	public profileRequest(String firstName, String lastName, String email, String mobileNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		
		
		
	}
	public profileRequest(Builder builder) {
		
		 this.email = builder.email;
		    this.firstName = builder.firstName;
		    this.lastName = builder.lastName;
		    this.mobileNumber = builder.mobileNumber;
		// TODO Auto-generated constructor stub
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "profileRequest [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", mobileNumber=" + mobileNumber + "]";
	}
	
	public static class Builder{
		
		
		private String firstName;
	    private String lastName;
	    private String email;
	    private String mobileNumber;
		
       
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
        public profileRequest  build() {
            return new profileRequest(this);
        }
    }
		
		
		
		
	
}
