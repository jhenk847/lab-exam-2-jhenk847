package lsystems;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class A_QTest {

	@Test
	public void test() {
		char expected = 'A';
		
		A_Q match = new A_Q();
		
		char actual = match.getMatch();
		
		assertEquals(expected, actual);
	}
	
	@Test 
	public void testBody() {
		char[] expected = {'Q'};
		
		A_Q body = new A_Q();
		char[] actual = body.getBody();
		
		assertEquals(Arrays.toString(expected), Arrays.toString(actual));
	}

}
