package lsystems;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class A_ATest {

	@Test
	public void testMatch() {
		char expected = 'A';
		
		A_A match = new A_A();
		
		char actual = match.getMatch();
		
		assertEquals(expected, actual);
	}
	
	@Test 
	public void testBody() {
		char[] expected = {'A'};
		
		A_A body = new A_A();
		char[] actual = body.getBody();
		
		assertEquals(Arrays.toString(expected), Arrays.toString(actual));
	}
	

}
