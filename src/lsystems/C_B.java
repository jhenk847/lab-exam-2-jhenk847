package lsystems;

//done 
public class C_B extends LRule{
	
	private final char match = 'C';
	private final char[] body = {'B'};
	
	public char getMatch(){
		
		return match;
	}
	
	public char[] getBody() {
		
		return body;
	}

}
