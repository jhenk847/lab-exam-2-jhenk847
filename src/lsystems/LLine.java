package lsystems;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class LLine {

	
	char line[];
	Set<LRule> rules;
	
	public LLine (char[] start, Set<LRule> rules) {
		this.rules = rules;
		this.line = start;
	}
	
	public void process() throws LSystemSymbolException, LSystemLengthException {
		
		ArrayList<Character> tempList = new ArrayList<Character>();
		
		if(line.length==0) {
			throw new LSystemLengthException();
		}
	
		for(int i=0; i<line.length; i++) {
		
		
			
			for(LRule tempLRule: rules) {
				
				
				if(line[i] == tempLRule.getMatch()) {
					
					for(char tempChar: tempLRule.getBody()) {
						
						if(tempChar == 'Q') throw new LSystemSymbolException();
						
						tempList.add(tempChar);
					}
					break;
				}
			}
		}
		line = listToArray(tempList);
	}
	
	
	
	private char[] listToArray(List<Character> list) {
		char[] newChars = new char[list.size()];
		for (int i = 0; i < list.size(); i++) {
			newChars[i] = list.get(i);
		}
		return newChars;
	}

	public String toString() {
		
		return new String(line);
	}
	
}
