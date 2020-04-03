package lsystems;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class C_BTest {

	@Test
	public void test() {
		char expected = 'C';
		
		C_B match = new C_B();
		
		char actual = match.getMatch();
		
		assertEquals(expected, actual);
	}
	
	@Test 
	public void testBody() {
		char[] expected = {'B'};
		
		C_B body = new C_B();
		char[] actual = body.getBody();
		
		assertEquals(Arrays.toString(expected), Arrays.toString(actual));
	}

}
