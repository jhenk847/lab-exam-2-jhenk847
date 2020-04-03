// delete this 


package lsystems;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

public class TestLine {
	
	public static void main(String[]args) {
		
		
		//char[] test = {'T', 'E', 'S', 'T'};
		//Set<LRule> rules = new HashSet<LRule>();
		//LLine line = new LLine(test, rules);
		//System.out.println(line); 
		
		LRule r1 = new A_BC();
		Set<LRule> rules = new HashSet<>();
		rules.add(r1);
		
		char[] lineChar = {'A'};
		LLine line = new LLine(lineChar, rules);
		System.out.println("Step 0:" + line);
		try {
			for (int i = 1; i <= 10; i++) {

				line.process();

				System.out.println("Step " + i + ":" + line);
			}
		} catch (LSystemSymbolException e) {
			System.err.println("Not able to process LSystem line due to " + e.getSymbol());
			e.printStackTrace();
		} catch (LSystemLengthException e) {
			System.err.println("Not able to process LSystem due to no symbols");
			e.printStackTrace();
		}
	}

}
