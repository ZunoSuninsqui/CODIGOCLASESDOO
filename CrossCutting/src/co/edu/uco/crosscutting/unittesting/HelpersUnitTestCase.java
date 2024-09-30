package co.edu.uco.crosscutting.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.uco.crosscutting.helpers.ObjectHelper;

class HelpersUnitTestCase {

	@Test
	void givenWantValidateIfObjectIsNullwhenObjectIsNullThenResultIsTrue() {
		// Arrange: Initial Context
		String object = null;
		
		
		// Act
		boolean result = ObjectHelper.isNull(object);
		
		// Assert
		assertTrue(result);
	}
	
	@Test
	void givenWantValidateIfObjectIsNotNullwhenObjectIsNullThenResultIsFalse() {
		// Arrange: Initial Context
		var object = "";
		
		
		// Act: Execute action
		boolean result = ObjectHelper.isNull(object);
		
		// Assert: Validate result
		assertFalse(result);
		
	}
	
	@Test
	void givenWantGetDefaultOriginalValaueWhenFirstObjectIsNotNullThenResultIsTheSameObject() {
		// Arrange: Initial Context
		var object = "Casa";
		var defaultValue = "Default";
		
		
		// Act: Execute action
		var result = ObjectHelper.getDefault(object,defaultValue);
		
		// Assert: Validate result
		assertEquals(result,object);
		
	}
	
	@Test
	void givenWantGetDefaultValaueWhenFirstObjectIsNullThenResultIsDefaultObject() {
		// Arrange: Initial Context
		String object = null;
		var defaultValue = "Default";
		
		
		// Act: Execute action
		var result = ObjectHelper.getDefault(object,defaultValue);
		
		// Assert: Validate result
		assertEquals(result,defaultValue);
		
	}

}
