package com.epam.JUnit_TDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppClassTest {

	@Test
	void oneAs() {
		assertEquals("BCD",App.removeChars("ABCD"));
		assertEquals("BCD",App.removeChars("BACD"));
 	}
	
	@Test
	void twoAs() {
		assertEquals("BCD",App.removeChars("AABCD"));
 	}
	
	@Test
	void noAs() {
		assertEquals("BCDA",App.removeChars("BCDA"));
		assertEquals("BCACD",App.removeChars("BCACD"));
		assertEquals("BCDEF",App.removeChars("BCDEF"));
 	}
	
	@Test
	void emptyString() {
		assertEquals("",App.removeChars(""));
 	}


}
