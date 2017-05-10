package net.helloworld.validate;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.BeforeClass;
import org.junit.Test;

import net.helloworld.user.User;

public class UserValidatorTest {
	private static Validator validator;
	
	 @BeforeClass
	   public static void setUp() {
	      ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
	      validator = factory.getValidator();
	   }
	 
	 @Test
	   public void usrIdIsNull() {
	      User user = new User( null, "password", "name", "" );

	      Set<ConstraintViolation<User>> constraintViolations =
	      validator.validate( user );

	      assertEquals( 1, constraintViolations.size() );
	      System.out.println(constraintViolations.iterator().next().getMessage());
	      assertEquals(
	         "may not be null",
	         constraintViolations.iterator().next().getMessage()
	      );
	   }
	 
	 @Test
	 public void useIdLength() throws Exception {
		 User user = new User( "us", "password", "name", "" );

	      Set<ConstraintViolation<User>> constraintViolations =
	      validator.validate( user );

	      assertEquals( 1, constraintViolations.size() );
	      System.out.println(constraintViolations.iterator().next().getMessage());
	      assertEquals(
	         "may not be null",
	         constraintViolations.iterator().next().getMessage()
	      );
	      
	      user = new User( "userIdasdasdasd", "password", "name", "" );

	      constraintViolations = validator.validate( user );

	      assertEquals( 1, constraintViolations.size() );
	      System.out.println(constraintViolations.iterator().next().getMessage());
	      assertEquals(
	         "may not be null",
	         constraintViolations.iterator().next().getMessage()
	      );
	 }
	 
	 @Test
	 public void email() throws Exception {
		 User user = new User( "userId", "password", "name", "email" );

	      Set<ConstraintViolation<User>> constraintViolations =
	      validator.validate( user );

	      assertEquals( 1, constraintViolations.size() );
	      System.out.println(constraintViolations.iterator().next().getMessage());
	      assertEquals(
	         "may not be null",
	         constraintViolations.iterator().next().getMessage()
	      );
	 }

	 
	 @Test
	 public void invalid() throws Exception {
		 User user = new User( "use", "password", "name", "email" );

	      Set<ConstraintViolation<User>> constraintViolations = validator.validate( user );

	      assertEquals( 2, constraintViolations.size() );
	      Iterator<ConstraintViolation<User>> violations  = constraintViolations.iterator();
	      while (violations.hasNext()) {
	    	  ConstraintViolation<User> each = violations.next();
	    	  System.out.println(each.getPropertyPath() + " : " +  each.getMessage());
	      }
	 }

}
