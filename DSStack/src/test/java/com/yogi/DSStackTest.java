package com.yogi ;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DSStackTest {

	private static final String testResourceFolder = "src//test//resources//" ;
	
	@Test
	@DisplayName("Working case")
	void workingScenario() {
		StackImpl si = new StackImpl(10);
		assertTrue(si.push("one"), "Failed to push data");
		assertTrue(si.push("two"), "Failed to push data");
		assertEquals("two",si.pop(), "Failed to pop correct data");
	}
	
	@Test
	@DisplayName("Stack underflow")
	void underflowScenario() {
		StackImpl si = new StackImpl(10);
		assertTrue(si.push("one"), "Failed to push data");
		assertTrue(si.push("two"), "Failed to push data");
		assertEquals("two",si.pop(), "Failed to pop correct data");
		assertEquals("one",si.pop(), "Failed to pop correct data");
		assertEquals("",si.pop(), "Failed to pop correct data");
	}
	
	@Test
	@DisplayName("Stack overflow")
	void overflowScenario() {
		StackImpl si = new StackImpl(3);
		assertTrue(si.push("one"), "Failed to push data");
		assertTrue(si.push("two"), "Failed to push data");
		assertTrue(si.push("three"), "Failed to push data");
		assertFalse(si.push("four"), "Failed to push data");
	}
	
	
}
