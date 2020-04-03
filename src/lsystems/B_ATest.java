package lsystems;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class B_ATest {

	@Test
	public void test() {
		char expected = 'B';
		
		B_A match = new B_A();
		
		char actual = match.getMatch();
		
		assertEquals(expected, actual);
	}
	
	@Test 
	public void testBody() {
		char[] expected = {'A'};
		
		B_A body = new B_A();
		char[] actual = body.getBody();
		
		assertEquals(Arrays.toString(expected), Arrays.toString(actual));
	}

}
