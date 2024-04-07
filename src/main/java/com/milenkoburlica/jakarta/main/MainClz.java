package com.milenkoburlica.jakarta.main;

import static java.util.Arrays.asList;

import com.milenkoburlica.jakarta.beanvalidator.User;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class MainClz {

	public static void main(String[] args) {
		MainClz mc = new MainClz();
		mc.probeWithoutValidation();
		mc.probeWithValidation();

	}

	public void probeWithoutValidation() {
		//Good Case
		User user1 = new User("John", "John@mail.com", asList(1,2));
		
		//Error Case - Name is empty
		User user2 = new User("John", "John@mail.com", asList(1,2));
		
		//Error Case - EMail Format wrong
		User user = new User("John", "John", asList(1,2));
		
	}
	
	public void probeWithValidation() {
	    ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
	    Validator validator = factory.getValidator();

	    // Good Case
	    User user1 = new User("John", "John@mail.com", asList(1, 2));
	    Set<ConstraintViolation<User>> violations1 = validator.validate(user1);
	    if (!violations1.isEmpty()) {
	        for (ConstraintViolation<User> violation : violations1) {
	            System.out.println(violation.getMessage());
	        }
	    }

	    // Error Case - Name is empty
	    User user2 = new User("", "John@mail.com", asList(1, 2));
	    Set<ConstraintViolation<User>> violations2 = validator.validate(user2);
	    if (!violations2.isEmpty()) {
	        for (ConstraintViolation<User> violation : violations2) {
	            System.out.println(violation.getMessage());
	        }
	    }

	    // Error Case - EMail Format wrong
	    User user3 = new User("John", "John", asList(1, 2));
	    Set<ConstraintViolation<User>> violations3 = validator.validate(user3);
	    if (!violations3.isEmpty()) {
	        for (ConstraintViolation<User> violation : violations3) {
	            System.out.println(violation.getMessage());
	        }
	    }
	}
}
