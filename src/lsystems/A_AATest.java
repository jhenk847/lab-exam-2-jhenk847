package lsystems;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class A_AATest {

	@Test
	public void testMatch() {
		char expected = 'A';
		
		A_AA match = new A_AA();
		
		char actual = match.getMatch();
		
		assertEquals(expected, actual);
	}
	@Test 
	public void testBody() {
		char[] expected = {'A', 'A'};
		
		A_AA body = new A_AA();
		char[] actual = body.getBody();
		
		assertEquals(Arrays.toString(expected), Arrays.toString(actual));
	}

}
