package lsystems;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class A_XTest {

	@Test
	public void test() {
		char expected = 'A';
		
		A_X match = new A_X();
		
		char actual = match.getMatch();
		
		assertEquals(expected, actual);
	}
	
	@Test 
	public void testBody() {
		char[] expected = {' '};
		
		A_X body = new A_X();
		char[] actual = body.getBody();
		
		assertEquals(Arrays.toString(expected), Arrays.toString(actual));
	}

}
