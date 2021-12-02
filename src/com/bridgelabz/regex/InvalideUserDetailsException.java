package com.bridgelabz.regex;

public class InvalideUserDetailsException extends Exception {
	enum Exception{FirstName,LastName,Email,Password,PhoneNumber};
	Exception exception;
	
          InvalideUserDetailsException(String exception) {
        	   if(exception == "FirstName") {
        				this.exception = Exception.FirstName;
        			}else if (exception == "LastName") {
        				this.exception = Exception.LastName;
        			}else if (exception == "Email") {
        				this.exception = Exception.Email;
        			}else if (exception == "Password") {
        				this.exception = Exception.Password;
        			}else if (exception == "Phonenumber") {
        				this.exception = Exception.PhoneNumber;
        			}
         }
          public String toString() {
        	  return "Exception : Invalid "+exception;
          }
	
}
